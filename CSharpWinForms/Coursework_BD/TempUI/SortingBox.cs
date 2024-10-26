using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UIComponents
{
    public partial class SortingBox : UserControl
    {
        private DataGridView _dataGridView;
        public DataGridView DataGridView
        {
            get { return _dataGridView; }
            set {
                if (_dataGridView == value) return;
                if (_dataGridView != null) _dataGridView.DataBindingComplete -= UpdateSelf;
                _dataGridView = value;
                if (_dataGridView != null) _dataGridView.DataBindingComplete += UpdateSelf;
            }
        }
        private bool _suppressUpdate = false;

        public SortingBox()
        {
            InitializeComponent();
            orderCombo.SelectedIndex = 0;
            fieldCombo.SelectedIndexChanged += DoSort;
            orderCombo.SelectedIndexChanged += DoSort;
        }

        protected void UpdateSelf(object sender, EventArgs e)
        {
            if (_suppressUpdate) return;
            fieldCombo.Items.Clear();
            foreach (DataGridViewColumn c in _dataGridView.Columns)
                fieldCombo.Items.Add(c.HeaderText);
            fieldCombo.SelectedIndex = 0;
            fieldCombo.Enabled = _dataGridView.ColumnCount > 0;
            orderCombo.Enabled = _dataGridView.ColumnCount > 0;
        }
        protected void DoSort(object sender, EventArgs e)
        {
            _suppressUpdate = true;
            DataGridViewColumn col = _dataGridView.Columns[fieldCombo.SelectedIndex];
            ListSortDirection order = orderCombo.SelectedIndex == 0 ? ListSortDirection.Ascending : ListSortDirection.Descending;
            _dataGridView.Sort(col, order);
            _suppressUpdate = false;
        }
    }
}
