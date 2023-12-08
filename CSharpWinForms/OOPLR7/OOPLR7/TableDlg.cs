using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace OOPLR7
{
    public partial class TableDlg : Form
    {
        public TableDlg()
        {
            InitializeComponent();
        }

        private void OnOK(object sender, EventArgs e)
        {
            Close();
        }
    }
}
