using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace LMV_Lab4
{
    /// <summary>
    /// Interaction logic for ARIDialog.xaml
    /// </summary>
    public partial class ARIDialog : Window
    {
        public ARIDialog()
        {
            InitializeComponent();
            this.dlgIcon.Source = Imaging.CreateBitmapSourceFromHIcon(
                SystemIcons.Question.Handle, 
                Int32Rect.Empty, BitmapSizeOptions.FromEmptyOptions());
        }

        private void OnAction(object sender, RoutedEventArgs e)
        {
            (Application.Current.MainWindow as MainWindow).dlgResultEdit.Text = ((Button)sender).Content.ToString().Trim();
            Close();
        }
    }
}
