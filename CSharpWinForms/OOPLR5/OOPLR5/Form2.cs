using OOPLR2;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace OOPLR4
{
    public partial class Form2 : Form
    {
        PeriodicalPublication[] pubs = new PeriodicalPublication[2];

        public Form2()
        {
            InitializeComponent();
        }

        private void OnBothObjs(object sender, EventArgs e)
        {
            if (pubs[0] == null) pubs[0] = new Newspaper();
            if (pubs[1] == null) pubs[1] = new Magazine();
            foreach (PeriodicalPublication p in pubs) p.Info();
        }

        private void OnRandObj(object sender, EventArgs e)
        {
            if (pubs[0] == null) pubs[0] = new Newspaper();
            if (pubs[1] == null) pubs[1] = new Magazine();
            pubs[new Random().Next(2)].Info();
        }

        private void OnFormClose(object sender, EventArgs e)
        {
            Close();
        }
    }
}
