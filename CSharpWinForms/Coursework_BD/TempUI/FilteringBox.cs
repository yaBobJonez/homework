using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Windows.Forms.Design;

namespace UIComponents
{
    [Designer(typeof(filtersDesigner))]
    public partial class FilteringBox : UserControl
    {
        private DataGridView _dataGridView;
        public DataGridView DataGridView {
            get => _dataGridView;
            set
            {
                if (_dataGridView != null) _dataGridView.DataBindingComplete -= UpdateSelf;
                _dataGridView = value;
                if (_dataGridView != null) _dataGridView.DataBindingComplete += UpdateSelf;
            }
        }

        [DesignerSerializationVisibility(DesignerSerializationVisibility.Content)]
        public Panel FiltersPanel
        {
            get => filtersPanel;
            set => filtersPanel = value;
        }

        public event EventHandler ApplyClick
        {
            add => applyBtn.Click += value;
            remove => applyBtn.Click -= value;
        }
        public event EventHandler ResetClick
        {
            add => resetBtn.Click += value;
            remove => resetBtn.Click -= value;
        }

        public string Query
        {
            get
            {
                List<string> conditions = new List<string>();
                foreach (Control c in filtersPanel.Controls)
                    if (c is Filter filter && filter.IsUsed)
                        conditions.Add(filter.Query);
                return string.Join(" AND ", conditions);
            }
        }

        public FilteringBox()
        {
            InitializeComponent();
        }

        protected void UpdateSelf(object sender, EventArgs e)
        {
            applyBtn.Enabled = _dataGridView.ColumnCount > 0;
            resetBtn.Enabled = _dataGridView.ColumnCount > 0;
        }

        public virtual void resetBtn_Click(object sender, EventArgs e)
        {
            foreach (Control c in filtersPanel.Controls)
                if (c is Filter filter) filter.Clear();
        }
    }

    class filtersDesigner : ParentControlDesigner
    {
        public override void Initialize(IComponent component)
        {
            base.Initialize(component);
            this.EnableDesignMode((component as FilteringBox).filtersPanel, "FiltersPanel");
        }
    }
}
