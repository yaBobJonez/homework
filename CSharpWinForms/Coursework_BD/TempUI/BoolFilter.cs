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
    public partial class BoolFilter : UserControl, Filter
    {
        public string DataPropertyName { get; set; }
        public string HeaderText {
            get => valueCheck.Text;
            set => valueCheck.Text = value;
        }
        public bool IsUsed { get => valueCheck.CheckState != CheckState.Indeterminate; }
        public void Clear() { valueCheck.CheckState = CheckState.Indeterminate; }
        public string Query
        {
            get
            {
                if (!IsUsed) return "";
                int state = valueCheck.CheckState == CheckState.Checked ? 1 : 0;
                return $"{DataPropertyName} = {state}";
            }
        }

        public BoolFilter()
        {
            InitializeComponent();
        }
    }
}
