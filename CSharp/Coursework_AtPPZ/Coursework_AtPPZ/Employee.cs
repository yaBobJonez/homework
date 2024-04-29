using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;


public class Employee
{

    #region Attributes

    public int Id { get; set; }

    public int DepartmentId { get; set; }
    public virtual Department Department {  get; set; }


    public string FirstName { get; set; }


    public string LastName { get; set; }


    public int BirthYear { get; set; }


    public string Position { get; set; }


    public int Experience { get; set; }


    public double Salary { get; set; }

    #endregion

}

