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
    public partial class TextFilter : UserControl, Filter
    {
        public string DataPropertyName { get; set; }
        public string HeaderText
        {
            get => columnLabel.Text;
            set => columnLabel.Text = value;
        }
        public bool IsUsed { get => valueEdit.Text != ""; }
        public void Clear() { valueEdit.Text = ""; }
        public string Query
        {
            get
            {
                if (!IsUsed) return "";
                else return $"LOWER({DataPropertyName}) LIKE '%{valueEdit.Text.ToLower()}%'";
            }
        }

        public TextFilter()
        {
            InitializeComponent();
        }
    }
}
