using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BD_Lab6
{
    internal class DBConnector
    {
        private static readonly string _connectionString = "Data Source=YABJLT;Initial Catalog=FlightsDB;Integrated Security=True";

        public static DataTable QuerySelect(string query)
        {
            using (SqlConnection connection = new SqlConnection(_connectionString))
            {
                SqlDataAdapter dataAdapter = new SqlDataAdapter(query, connection);
                DataTable dataTable = new DataTable();
                try
                {
                    connection.Open();
                    dataAdapter.Fill(dataTable);
                    return dataTable;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("Помилка запиту: " + ex.Message);
                    return new DataTable();
                }
            }
        }
    }
}
