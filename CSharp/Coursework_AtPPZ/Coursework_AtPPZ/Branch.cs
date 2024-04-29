using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;

public class Branch
{

    #region Attributes

    public int Id { get; set; }

    public virtual ICollection<Department> Departments { get; private set; } = new ObservableCollection<Department>();

    public int EmployeesCount { get => Departments.Sum(d => d.Employees.Count); }


    public int Number { get; set; }


    public string Type { get; set; }


    public string Address { get; set; }

    #endregion

}

