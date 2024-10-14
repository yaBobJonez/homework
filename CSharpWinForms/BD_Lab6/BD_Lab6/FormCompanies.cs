using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BD_Lab6
{
    public partial class FormCompanies : Form
    {
        public FormCompanies()
        {
            InitializeComponent();
        }

        private void FormCompanies_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'flightsDBDataSet.Company' table. You can move, or remove it, as needed.
            this.companyTableAdapter.Fill(this.flightsDBDataSet.Company);
            foreach (DataGridViewColumn c in this.dataGridView1.Columns)
            {
                this.sortFieldCombo.Items.Add(c.HeaderText);
                this.betweenFieldCombo.Items.Add(c.HeaderText);
                this.groupNameCombo.Items.Add(c.HeaderText);
                this.groupActionFieldCombo.Items.Add(c.HeaderText);
                this.groupFieldCombo.Items.Add(c.HeaderText);
            }
            this.sortFieldCombo.SelectedIndex = 0;
            this.betweenFieldCombo.SelectedIndex = 0;
            this.groupNameCombo.SelectedIndex = 0;
            this.groupActionFieldCombo.SelectedIndex = 0;
            this.groupFieldCombo.SelectedIndex = 0;
        }

        private void saveToolStripButton_Click(object sender, EventArgs e)
        {
            this.companyTableAdapter.Update(this.flightsDBDataSet.Company);
        }

        private void sortBtn_Click(object sender, EventArgs e)
        {
            string column = this.dataGridView1.Columns[this.sortFieldCombo.SelectedIndex].DataPropertyName;
            string order = this.sortIsReverse.Checked ? "DESC" : "ASC";
            string limit = this.sortIsFirst10.Checked ? "TOP 10" : "";
            string q = $"SELECT {limit} * FROM Company ORDER BY {column} {order}";
            this.dataGridView1.DataSource = DBConnector.QuerySelect(q);
            this.dataGridView1.ReadOnly = true;
        }

        private void betweenBtn_Click(object sender, EventArgs e)
        {
            string column = this.dataGridView1.Columns[this.betweenFieldCombo.SelectedIndex].DataPropertyName;
            string from = this.betweenStartEdit.Text;
            string to = this.betweenEndEdit.Text;
            string q = $"SELECT * FROM Company WHERE {column} BETWEEN '{from}' AND '{to}'";
            this.dataGridView1.DataSource = DBConnector.QuerySelect(q);
            this.dataGridView1.ReadOnly = true;
        }

        private void groupBtn_Click(object sender, EventArgs e)
        {
            string group = this.dataGridView1.Columns[this.groupNameCombo.SelectedIndex].DataPropertyName;
            string action = this.groupActionCombo.Text;
            string actionField = this.dataGridView1.Columns[this.groupActionFieldCombo.SelectedIndex].DataPropertyName;
            string field = this.dataGridView1.Columns[this.groupFieldCombo.SelectedIndex].DataPropertyName;
            string op = this.groupOperatorCombo.Text;
            string value = this.groupValueEdit.Text;
            string q = $"SELECT {group} AS group_name, {action}({actionField}) AS result FROM Company WHERE " +
                $"{field} {op} '{value}' GROUP BY {group}";
            DialogGroupping dg = new DialogGroupping();
            dg.dataGridView1.DataSource = DBConnector.QuerySelect(q);
            dg.ShowDialog();
        }

        private void resetBtn_Click(object sender, EventArgs e)
        {
            this.dataGridView1.DataSource = this.companyBindingSource;
            this.dataGridView1.ReadOnly = false;
        }
    }
}
