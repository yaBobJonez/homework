using Microsoft.EntityFrameworkCore;
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
    /// Interaction logic for SeatsConfigDialog.xaml
    /// </summary>
    public partial class SeatsConfigDialog : Window
    {
        public SeatsConfigDialog()
        {
            InitializeComponent();
        }

        private void OnOK(object sender, RoutedEventArgs e)
        {
            MainWindow mainWin = ((MainWindow)Application.Current.MainWindow);
            FlightContext context = mainWin._flightContext;
            Flight flight = (Flight)mainWin.flightDataGrid.SelectedItem;
            int f, s, t;
            if (!int.TryParse(this.first.Text, out f) || !int.TryParse(this.second.Text, out s) || !int.TryParse(this.third.Text, out t)
                || f < 0 || s < 0 || t < 0)
            {
                MessageBox.Show("Введіть цілі додатні числа!", "Помилка введення");
                return;
            }
            context.FirstSeats.RemoveRange(context.FirstSeats.Where(el => el.FlightId == flight.FlightId));
            context.SecondSeats.RemoveRange(context.SecondSeats.Where(el => el.FlightId == flight.FlightId));
            context.ThirdSeats.RemoveRange(context.ThirdSeats.Where(el => el.FlightId == flight.FlightId));
            for (int i = 0; i < f; i++)
                context.FirstSeats.Add(new FirstSeat(){ FlightId = flight.FlightId, Number = i + 1 });
            for (int i = 0; i < s; i++)
                context.SecondSeats.Add(new SecondSeat(){ FlightId = flight.FlightId, Number = i + 1 });
            for (int i = 0; i < t; i++)
                context.ThirdSeats.Add(new ThirdSeat(){ FlightId = flight.FlightId, Number = i + 1 });
            this.DialogResult = true;
        }

        private void OnCancel(object sender, RoutedEventArgs e)
        {
            this.DialogResult = false;
        }
    }
}
