using Microsoft.Win32;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace LMV_Lab4
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        MsgAndOptDlg MsgAndOptDlg;

        public MainWindow()
        {
            InitializeComponent();
        }

        private void OnYNC(object sender, RoutedEventArgs e)
        {
            this.dlgResultEdit.Text = MessageBox.Show(
                "Так, ні чи скасувати?",
                ((Button)sender).Content as string,
                MessageBoxButton.YesNoCancel,
                MessageBoxImage.Question
            ) switch
            {
                MessageBoxResult.Yes => "Yes",
                MessageBoxResult.No => "No",
                MessageBoxResult.Cancel => "Cancel",
                _ => "Сталася помилка :("
            };
        }

        private void OnARI(object sender, RoutedEventArgs e)
        {
            new ARIDialog().ShowDialog();
        }

        private void OnFileOpen(object sender, RoutedEventArgs e)
        {
            OpenFileDialog ofd = new OpenFileDialog();
            if (ofd.ShowDialog() == true)
                this.dlgResultEdit.Text = ofd.FileName;
        }

        private void OnCustomDialog(object sender, RoutedEventArgs e)
        {
            this.MsgAndOptDlg = new MsgAndOptDlg();
            this.MsgAndOptDlg.Show();
            this.whichOptionBtn.IsEnabled = false;
            this.customDlgBtn.IsEnabled = false;
        }

        private void OnWhichOption(object sender, RoutedEventArgs e)
        {
            this.dlgResultEdit.Text = this.MsgAndOptDlg.opt1.IsChecked == true ? "1"
                : this.MsgAndOptDlg.opt2.IsChecked == true ? "2"
                : this.MsgAndOptDlg.opt3.IsChecked == true ? "3"
                : this.MsgAndOptDlg.opt4.IsChecked == true ? "4"
                : "Нічого не вибрано";
        }

        private void OnQuit(object sender, RoutedEventArgs e)
        {
            Application.Current.Shutdown();
        }
    }
}
