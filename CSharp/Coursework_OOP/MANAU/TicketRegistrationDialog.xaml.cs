using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace MANAU
{
    /// <summary>
    /// Interaction logic for TicketRegistrationDialog.xaml
    /// </summary>
    public partial class TicketRegistrationDialog : Window
    {
        private Seat seat;
        public TicketRegistrationDialog(Seat seat)
        {
            InitializeComponent();
            this.seat = seat;
            if (!seat.IsVacant)
            {
                this.name.Text = seat.FullName;
                this.name.IsReadOnly = true;
                this.dateOfBirth.SelectedDate = seat.Birthday;
                this.dateOfBirth.IsEnabled = false;
                this.price.Text = seat.Price.ToString();
                this.price.IsReadOnly = true;
                this.deleteBtn.IsEnabled = true;
                this.okBtn.IsEnabled = false;
            }
        }

        private void OnOK(object sender, RoutedEventArgs e)
        {
            if (string.IsNullOrWhiteSpace(this.name.Text)) return;
            if (this.dateOfBirth.SelectedDate == null) return;
            if (!Double.TryParse(this.price.Text, out var _))
            {
                MessageBox.Show("Введіть числове значення ціни!", "Помилка введення");
                return;
            }
            this.seat.IsVacant = false;
            this.seat.FullName = this.name.Text;
            this.seat.Birthday = (DateTime)this.dateOfBirth.SelectedDate;
            this.seat.Price = Double.Parse(this.price.Text);
            this.DialogResult = true;
        }

        private void OnDelete(object sender, RoutedEventArgs e)
        {
            this.seat.IsVacant = true;
            this.seat.FullName = "";
            this.seat.Birthday = DateTime.Now.Date;
            this.seat.Price = 100;
            this.DialogResult = true;
        }
    }
}
