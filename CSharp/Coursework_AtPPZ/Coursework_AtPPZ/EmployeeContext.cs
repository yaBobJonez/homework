using Microsoft.EntityFrameworkCore;

public class EmployeeContext : DbContext
{

    #region Attributes

    public DbSet<Employee> Employees { get; set; }
    public DbSet<Department> Departments { get; set; }
    public DbSet<Branch> Branches { get; set; }

    #endregion

    #region Protected methods

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        optionsBuilder
            .UseSqlite("Data Source=employees.db")
            .UseLazyLoadingProxies();
    }

    #endregion

}
