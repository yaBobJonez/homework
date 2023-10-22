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

namespace LMV_Lab2
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void OnMessageShow(object sender, RoutedEventArgs e)
        {
            if( ! string.IsNullOrWhiteSpace(this.messageEdit.Text) )
                MessageBox.Show(this.messageEdit.Text, "Повідомлення");
        }

        private void OnClearMessage(object sender, RoutedEventArgs e)
        {
            this.messageEdit.Clear();
        }

        private void OnRunApp(object sender, RoutedEventArgs e)
        {
            for (int i = 0; i < 5; i++)
            {
                try { System.Diagnostics.Process.Start(this.programCombo.Text); }
                catch { continue; }
                return;
            }
            MessageBox.Show("Не вдалося запустити "+this.programCombo.Text+".",
                "Помилка запуску",
                MessageBoxButton.OK,
                MessageBoxImage.Error);
        }

        private void OnMessageEnable(object sender, RoutedEventArgs e)
        {
            this.messageEdit.IsEnabled = this.showMessageBtn.IsEnabled =
                this.defaultMessageBtn.IsEnabled = this.clearMessageBtn.IsEnabled = true;
        }

        private void OnMessageDisable(object sender, RoutedEventArgs e)
        {
            this.messageEdit.IsEnabled = this.showMessageBtn.IsEnabled =
                this.defaultMessageBtn.IsEnabled = this.clearMessageBtn.IsEnabled = false;
        }

        private void OnMessageShown(object sender, RoutedEventArgs e)
        {
            this.messageEdit.Visibility = this.showMessageBtn.Visibility =
                this.defaultMessageBtn.Visibility = this.clearMessageBtn.Visibility = Visibility.Visible;
        }

        private void OnMessageHidden(object sender, RoutedEventArgs e)
        {
            this.messageEdit.Visibility = this.showMessageBtn.Visibility =
                this.defaultMessageBtn.Visibility = this.clearMessageBtn.Visibility = Visibility.Hidden;
        }

        private void OnQuit(object sender, RoutedEventArgs e)
        {
            Close();
        }

        private void OnDefaultMessage(object sender, RoutedEventArgs e)
        {
            this.messageEdit.Text = "Введіть текст повідомлення тут";
        }

        private void OnProgramEnable(object sender, RoutedEventArgs e)
        {
            this.programCombo.IsEnabled = this.runProgramBtn.IsEnabled = true;
        }

        private void OnProgramDisable(object sender, RoutedEventArgs e)
        {
            this.programCombo.IsEnabled = this.runProgramBtn.IsEnabled = false;
        }

        private void OnProgramShown(object sender, RoutedEventArgs e)
        {
            this.programCombo.Visibility = this.runProgramBtn.Visibility = Visibility.Visible;
        }

        private void OnProgramHidden(object sender, RoutedEventArgs e)
        {
            this.programCombo.Visibility = this.runProgramBtn.Visibility = Visibility.Hidden;
        }

        private void OnCopy(object sender, RoutedEventArgs e)
        {
            if( ! string.IsNullOrWhiteSpace(this.clipboardEdit.Text) )
                Clipboard.SetText(this.clipboardEdit.Text);
        }

        private void OnPaste(object sender, RoutedEventArgs e)
        {
            this.clipboardEdit.Text = Clipboard.GetText();
        }
    }
}
