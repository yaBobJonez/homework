using Microsoft.EntityFrameworkCore;
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

namespace Coursework_AtPPZ
{
    /// <summary>
    /// Interaction logic for FilterDialog.xaml
    /// </summary>
    public partial class FilterDialog : Window
    {
        EmployeeContext _context;
        CollectionViewSource allViewSource;
        DataGrid allDataGrid;

        public int? branchCrit { get; set; }
        public int? departmentCrit { get; set; }
        public int? idCrit { get; set; }
        public string? firstNameCrit { get; set; }
        public string? lastNameCrit { get; set; }
        public int? birthYearCrit { get; set; }
        public string? positionCrit { get; set; }
        public int? experienceCrit { get; set; }
        public double? salaryCrit { get; set; }

        public FilterDialog(EmployeeContext _context, CollectionViewSource allViewSource, DataGrid allDataGrid)
        {
            InitializeComponent();
            DataContext = this;
            this._context = _context;
            this.allViewSource = allViewSource;
            this.allDataGrid = allDataGrid;
        }

        private void filterBtn_Checked(object sender, RoutedEventArgs eventArgs)
        {
            IQueryable<Employee> q = _context.Employees;
            if (branchCrit != null) q = q.Where(e => e.Department.BranchId == branchCrit);
            if (departmentCrit != null) q = q.Where(e => e.DepartmentId == departmentCrit);
            if (idCrit != null) q = q.Where(e => e.Id == idCrit);
            if (firstNameCrit != null) q = q.Where(e => e.FirstName == firstNameCrit);
            if (lastNameCrit != null) q = q.Where(e => e.LastName == lastNameCrit);
            if (birthYearCrit != null)
            {
                if (yearLt.IsChecked == true) q = q.Where(e => e.BirthYear < birthYearCrit);
                else if (yearGt.IsChecked == true) q = q.Where(e => e.BirthYear > birthYearCrit);
                else q = q.Where(e => e.BirthYear == birthYearCrit);
            }
            if (positionCrit != null) q = q.Where(e => e.Position == positionCrit);
            if (experienceCrit != null)
            {
                if (experienceLt.IsChecked == true) q = q.Where(e => e.Experience < experienceCrit);
                else if (experienceGt.IsChecked == true) q = q.Where(e => e.Experience > experienceCrit);
                else q = q.Where(e => e.Experience == experienceCrit);
            }
            if (salaryCrit != null)
            {
                if (salaryLt.IsChecked == true) q = q.Where(e => e.Salary < salaryCrit);
                else if (salaryGt.IsChecked == true) q = q.Where(e => e.Salary > salaryCrit);
                else q = q.Where(e => e.Salary == salaryCrit);
            }
            allViewSource.Source = q.ToList();
            allDataGrid.Items.Refresh();
        }

        private void filterBtn_Unchecked(object sender, RoutedEventArgs e)
        {
            allViewSource.Source = _context.Employees.Local.ToObservableCollection();
            allDataGrid.Items.Refresh();
        }
    }
}
