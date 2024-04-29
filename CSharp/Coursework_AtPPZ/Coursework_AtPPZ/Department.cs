using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;

public class Department
{

    #region Attributes

    public int Id { get; set; }

    public int BranchId { get; set; }
    public virtual Branch Branch { get; set; }
    public virtual ICollection<Employee> Employees { get; private set; } = new ObservableCollection<Employee>();


    public string Name { get; set; }

    #endregion

}

