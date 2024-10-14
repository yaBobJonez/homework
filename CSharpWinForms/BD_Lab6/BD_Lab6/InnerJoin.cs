using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Common;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BD_Lab6
{
    public partial class InnerJoin : Form
    {
        public InnerJoin()
        {
            InitializeComponent();
            this.table1.SelectedIndex = 0;
            this.table2.SelectedIndex = 0;
        }

        private void joinBtn_Click(object sender, EventArgs e)
        {
            var normalizedFields = new List<string>();
            for (int i = 0; i < this.fieldsGrid.RowCount-1; i++)
            {
                DataGridViewRow row = this.fieldsGrid.Rows[i];
                normalizedFields.Add($"{row.Cells[0].Value}.{row.Cells[1].Value}");
            }
            var fieldStr = String.Join(", ", normalizedFields);
            var table1Str = this.table1.Text + "." + this.field1.Text;
            var table2Str = this.table2.Text + "." + this.field2.Text;
            string q = $"SELECT {fieldStr} FROM {this.table1.Text} INNER JOIN {this.table2.Text} ON {table1Str} = {table2Str}";
            this.dataGridView1.DataSource = DBConnector.QuerySelect(q);
        }
    }
}
