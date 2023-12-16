using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MANAU
{
    public class Seat
    {
        [Key]
        public int SeatId { get; set; }
        public int Number { get; set; }
        public bool IsVacant { get; set; } = true;
        public string FullName { get; set; } = "";
        public DateTime Birthday { get; set; } = DateTime.Now.Date;
        public double Price { get; set; } = 100;
        
        public int FlightId { get; set; }
        public virtual Flight Flight { get; set; }
    }
    public class FirstSeat : Seat {}
    public class SecondSeat : Seat { }
    public class ThirdSeat : Seat { }
    public class Flight : INotifyPropertyChanged
    {
        public int FlightId { get; set; }
        public string Name { get; set; } = "";
        public DateTime DepartDate { get; set; } = DateTime.Now.Date;
        public TimeSpan DepartTime {
            set => DepartDate = new DateTime(DepartDate.Year, DepartDate.Month, DepartDate.Day,
                value.Hours, value.Minutes, value.Seconds);
            get => DepartDate.TimeOfDay;
        }
        public virtual ICollection<FirstSeat> FirstSeats { get; set; } = new ObservableCollection<FirstSeat>();
        public virtual ICollection<SecondSeat> SecondSeats { get; set; } = new ObservableCollection<SecondSeat>();
        public virtual ICollection<ThirdSeat> ThirdSeats { get; set; } = new ObservableCollection<ThirdSeat>();
        private string _route = "";
        public string Route
        {
            get => _route;
            set
            {
                _route = value;
                PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(Route)));
                PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(From)));
                PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(To)));
            }
        }
        public string From { get => Route.Split(", ").FirstOrDefault(""); }
        public string To { get => Route.Split(", ").LastOrDefault(""); }

        public event PropertyChangedEventHandler? PropertyChanged;
    }

    public class FlightContext : DbContext
    {
        public DbSet<Flight> Flights { get; set; }
        //public DbSet<Route> Routes { get; set; }
        public DbSet<FirstSeat> FirstSeats { get; set; }
        public DbSet<SecondSeat> SecondSeats { get; set; }
        public DbSet<ThirdSeat> ThirdSeats { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlite("Data Source=flights.db");
            optionsBuilder.UseLazyLoadingProxies();
            optionsBuilder.EnableSensitiveDataLogging();
        }
    }
}
