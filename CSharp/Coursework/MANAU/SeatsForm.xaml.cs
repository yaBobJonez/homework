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

namespace MANAU
{
    /// <summary>
    /// Interaction logic for SeatsForm.xaml
    /// </summary>
    public partial class SeatsForm : Window
    {
        MainWindow mainWin = ((MainWindow)Application.Current.MainWindow);
        public SeatsForm()
        {
            InitializeComponent();
        }

        private void OnConfigureSeats(object sender, RoutedEventArgs e)
        {
            if (new SeatsConfigDialog().ShowDialog() == true)
            {
                mainWin._flightContext.SaveChanges();
                this.seatsFirstList.Items.Refresh();
                this.seatsSecondList.Items.Refresh();
                this.seatsThirdList.Items.Refresh();
            }
        }
        private void OnSeatClick(object sender, RoutedEventArgs e)
        {
            Button btn = sender as Button;
            Seat seat = btn.DataContext as Seat;
            if (new TicketRegistrationDialog(seat).ShowDialog() == true)
            {
                mainWin._flightContext.SaveChanges();
                this.seatsFirstList.Items.Refresh();
                this.seatsSecondList.Items.Refresh();
                this.seatsThirdList.Items.Refresh();
            }
        }
    }
}
