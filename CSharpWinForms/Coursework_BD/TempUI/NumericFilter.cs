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
    public partial class NumericFilter : UserControl, Filter
    {
        public string DataPropertyName { get; set; }
        public string HeaderText
        {
            get => columnLabel.Text;
            set => columnLabel.Text = value;
        }
        public bool IsUsed { get => operationCombo.SelectedIndex != 0; }
        public void Clear() { operationCombo.SelectedIndex = 0; }
        public string Query
        {
            get {
                if (!IsUsed) return "";
                string secondPart = operationCombo.SelectedIndex == 1 ? $" AND {secondSpinner.Value}" : "";
                string operation = UIHelper.OperatorToSQL(operationCombo.Text);
                return $"{DataPropertyName} {operation} {firstSpinner.Value}{secondPart}";
            }
        }

        public NumericFilter()
        {
            InitializeComponent();
            operationCombo.SelectedIndex = 0;
            operationCombo.SelectedIndexChanged += delegate (object sender, EventArgs e) {
                firstSpinner.Enabled = operationCombo.SelectedIndex != 0;
                secondSpinner.Enabled = operationCombo.SelectedIndex == 1;
            };
        }
    }
}
