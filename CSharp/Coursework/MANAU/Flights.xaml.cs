using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.ComponentModel;
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

namespace MANAU
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private SeatsForm seatsWindow;

        public readonly FlightContext _flightContext = new FlightContext();
        private CollectionViewSource flightViewSource;

        public MainWindow()
        {
            InitializeComponent();
            flightViewSource = (CollectionViewSource)FindResource(nameof(flightViewSource));
            seatsWindow = new SeatsForm();
            seatsWindow.Show();
        }

        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            _flightContext.Database.EnsureCreated();
            _flightContext.Flights.Load();
            flightViewSource.Source = _flightContext.Flights.Local.ToObservableCollection();
        }

        protected override void OnClosing(CancelEventArgs e)
        {
            _flightContext.SaveChanges();
            _flightContext.Dispose();
            base.OnClosing(e);
        }

        private void OnSaveClick(object sender, RoutedEventArgs e)
        {
            _flightContext.SaveChanges();
            flightDataGrid.Items.Refresh();
            seatsWindow.seatsFirstList.Items.Refresh();
            seatsWindow.seatsSecondList.Items.Refresh();
            seatsWindow.seatsThirdList.Items.Refresh();
        }

        private void OnSelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            _flightContext.SaveChanges();
        }

        private void OnFindSoonest(object sender, RoutedEventArgs e)
        {
            var matched = _flightContext.Flights
                .AsEnumerable()
                .Where(c => c.From == this.grepFrom.Text && c.To == this.grepTo.Text
                && (c.FirstSeats.Count > 0 && c.FirstSeats.Any(f => f.IsVacant)
                || c.SecondSeats.Count > 0 && c.SecondSeats.Any(f => f.IsVacant)
                || c.ThirdSeats.Count > 0 && c.ThirdSeats.Any(f => f.IsVacant)))
                .OrderBy(c => c.DepartDate).ThenBy(c => c.DepartTime);
            Flight soonest = matched.FirstOrDefault((Flight)null);
            if (soonest != null)
            {
                this.flightDataGrid.ItemsSource = matched.ToList();
                this.flightDataGrid.SelectedItem = soonest;
                this.flightDataGrid.Focus();
            }
        }

        private void OnStopSearching(object sender, RoutedEventArgs e)
        {
            this.flightDataGrid.ItemsSource = this.flightViewSource.View;
        }
    }
}
