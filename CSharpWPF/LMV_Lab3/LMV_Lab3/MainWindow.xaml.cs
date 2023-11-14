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

namespace LMV_Lab3
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public static readonly DependencyProperty IsCheckedProperty =
            DependencyProperty.Register("IsChecked", typeof(bool), typeof(MainWindow), new PropertyMetadata(true));

        public bool IsChecked
        {
            get { return (bool)GetValue(IsCheckedProperty); }
            set { SetValue(IsCheckedProperty, value); }
        }

        public MainWindow()
        {
            InitializeComponent();
        }

        private void OnMessageShow(object sender, RoutedEventArgs e)
        {
            if (!IsChecked) return;
            MessageBox.Show(this.TextEdit.Text, "Повідомлення");
        }

        private void OnCheck(object sender, RoutedEventArgs e) => IsChecked = !IsChecked;

        private void OnQuit(object sender, RoutedEventArgs e) => Close();

        private void OnAbout(object sender, RoutedEventArgs e)
        {
            MessageBox.Show(
                "Лабораторна 1.3\nv1.0\n\nДемонстрація меню та панелі інструментів.\n\n" +
                "https://github.com/yaBobJonez/Homework/tree/uni\nBoost Software License 1.0",
                "Про програму",
                MessageBoxButton.OK,
                MessageBoxImage.Information
            );
        }

        private void OnWindowKeyPress(object sender, KeyEventArgs e)
        {
            if(e.Key == Key.D)
            {
                if (!this.tableMenuItem.Items.IsEmpty) return;
                MenuItem draw = new MenuItem(); draw.Header = "_Draw";
                MenuItem sel = new MenuItem(); sel.Header = "_Select";
                MenuItem sort = new MenuItem(); sort.Header = "S_ort";
                this.tableMenuItem.Items.Add(draw);
                this.tableMenuItem.Items.Add(sel);
                this.tableMenuItem.Items.Add(sort);
            }
            else if(e.Key == Key.E)
                this.tableMenuItem.IsEnabled = false;
        }
    }
}
