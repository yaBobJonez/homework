using Microsoft.EntityFrameworkCore;
using Microsoft.Win32;
using System;
using System.Collections.Generic;
using System.IO;
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

namespace Coursework_AtPPZ
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public readonly EmployeeContext _context = new EmployeeContext();

        private CollectionViewSource allViewSource;
        private CollectionViewSource branchViewSource;

        public MainWindow()
        {
            InitializeComponent();
            allViewSource = (CollectionViewSource)FindResource(nameof(allViewSource));
            branchViewSource = (CollectionViewSource)FindResource(nameof(branchViewSource));
        }

        private void Window_Loaded(object sender, RoutedEventArgs e)
        {
            _context.Database.EnsureCreated();
            _context.Branches.Load();
            _context.Employees.Load();
            branchViewSource.Source = _context.Branches.Local.ToObservableCollection();
            allViewSource.Source = _context.Employees.Local.ToObservableCollection();
        }

        private void saveBtn_Click(object sender, RoutedEventArgs e)
        {
            _context.SaveChanges();
            branchDataGrid.Items.Refresh();
            departmentDataGrid.Items.Refresh();
            employeeDataGrid.Items.Refresh();
            allDataGrid.Items.Refresh();
        }

        private void statisticsBtn_Click(object sender, RoutedEventArgs e)
        {
            MessageBox.Show(
                $"Кількість працівників: {allDataGrid.Items.Count}\n" +
                $"Середній стаж: {Math.Round(_context.Employees.Average(e => e.Experience), 2)}\n" +
                $"Витрати на зарплату: {Math.Round(_context.Employees.Sum(e => e.Salary), 2)}",
                "Статистичні дані",
                MessageBoxButton.OK,
                MessageBoxImage.Information
            );
        }

        private void exportBtn_Click(object sender, RoutedEventArgs eventArgs)
        {
            var saveDlg = new SaveFileDialog();
            saveDlg.FileName = "Працівники";
            saveDlg.DefaultExt = ".csv";
            saveDlg.Filter = "Comma-separated values (CSV)|*.csv";
            if (saveDlg.ShowDialog() == true)
            {
                StringBuilder sb = new StringBuilder();
                foreach (var e in _context.Employees) sb.Append($"{e.Department.BranchId},{e.DepartmentId},{
                    e.Id},{e.FirstName},{e.LastName},{e.BirthYear},{e.Position},{e.Experience},{e.Salary}\n");
                File.WriteAllText(saveDlg.FileName, sb.ToString());
            }
        }

        private void filterBtn_Click(object sender, RoutedEventArgs e)
        {
            FilterDialog dlg = new FilterDialog(_context, allViewSource, allDataGrid);
            dlg.Show();
        }
    }
}
