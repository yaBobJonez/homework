using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace LMV_Lab4
{
    /// <summary>
    /// Interaction logic for MsgAndOptDlg.xaml
    /// </summary>
    public partial class MsgAndOptDlg : Window
    {
        public MsgAndOptDlg()
        {
            InitializeComponent();
        }

        private void OnOK(object sender, RoutedEventArgs e)
        {
            MainWindow mainWin = Application.Current.MainWindow as MainWindow;
            mainWin.dlgResultEdit.Text = this.messageEdit.Text;
            mainWin.whichOptionBtn.IsEnabled = true;
            Close();
        }

        private void OnCancel(object sender, RoutedEventArgs e)
        {
            Close();
        }

        private void OnClosed(object sender, EventArgs e)
        {
            (Application.Current.MainWindow as MainWindow).customDlgBtn.IsEnabled = true;
        }
    }
}
