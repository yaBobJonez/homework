using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Coursework_BD
{
    public class DBConnector
    {
        public static readonly string connectionString = "Data Source=YABJLT;Initial Catalog=KRPropertiesDB;Integrated Security=True";

        public static readonly string unitSaleColumns = @"SELECT
                Unit.id, Unit.name, Building.type, Building.district, Building.settlement, Building.complex, Unit.level, Property.area,
                Sale_conditions.price AS price,
                Sale_conditions.installment_plan,
                'N/A' AS billing_period,
                Property.creation_date
            FROM Unit
            JOIN Building ON Unit.building_id = Building.id
            JOIN Property ON Unit.property_id = Property.id
            JOIN Sale_conditions ON Property.id = Sale_conditions.property_id";

        public static readonly string unitRentColumns = @"SELECT
                Unit.id, Unit.name, Building.type, Building.district, Building.settlement, Building.complex, Unit.level, Property.area,
                Lease_conditions.cost AS price,
                1 AS installment_plan,
                Lease_conditions.billing_period,
                Property.creation_date
            FROM Unit
            JOIN Building ON Unit.building_id = Building.id
            JOIN Property ON Unit.property_id = Property.id
            JOIN Lease_conditions ON Property.id = Lease_conditions.property_id";

        public static readonly string landSaleColumns = @"SELECT
                Land.cadastre_number, Land.usage, Property.area,
                Sale_conditions.price AS price,
                Sale_conditions.installment_plan,
                'N/A' AS billing_period,
                Property.creation_date
            FROM Land
            JOIN Property ON Land.property_id = Property.id
            JOIN Sale_conditions ON Property.id = Sale_conditions.property_id";

        public static readonly string landRentColumns = @"SELECT
                Land.cadastre_number, Land.usage, Property.area,
                Lease_conditions.cost AS price,
                1 AS installment_plan,
                Lease_conditions.billing_period,
                Property.creation_date
            FROM Land
            JOIN Property ON Land.property_id = Property.id
            JOIN Lease_conditions ON Property.id = Lease_conditions.property_id";

        public static readonly string agencyColumns = "SELECT id, name, registered_in, address, phone, establishment_year, rating FROM Agency";

        private static string searchFields(string[] haystack, string[] needle)
        {
            List<string> query = new List<string>(needle.Length);
            for (int keyword = 0; keyword < needle.Length; keyword++)
            {
                List<string> keywordQuery = new List<string>(haystack.Length);
                for (int field = 0; field < haystack.Length; field++)
                    keywordQuery.Add($"LOWER({haystack[field]}) LIKE '%{needle[keyword].ToLower()}%'");
                query.Add("( " + string.Join(" OR ", keywordQuery) + " )");
            }
            return "( " + string.Join(" AND ", query) + " )";
        }

        public static string unitSearchFields(string prompt) => searchFields(new string[]{
            "Unit.name", "Building.type", "Building.district", "Building.settlement", "Building.complex"
        }, prompt.Split(' '));

        public static string landSearchFields(string prompt) => searchFields(new string[]{
            "Land.cadastre_number", "Land.usage"
        }, prompt.Split(' '));

        public static string agencySearchFields(string prompt) => searchFields(new string[]{
            "Agency.name", "Agency.description", "Agency.registered_in", "Agency.address", "Agency.phone"
        }, prompt.Split(' '));

        public static DataTable DefaultUnitSet(string conditions_type, string unit_type)
        {
            string unitColumns = conditions_type == "Оренда" ? unitRentColumns : unitSaleColumns;
            string q = $@"{unitColumns} WHERE
                Property.conditions_type = '{conditions_type}'
                AND Unit.type = '{unit_type}'
                AND Property.status = 'Активне'
            ;";
            return QuerySelect(q);
        }

        public static DataTable DefaultLandSet(string conditions_type)
        {
            string landColumns = conditions_type == "Оренда" ? landRentColumns : landSaleColumns;
            string q = $@"{landColumns} WHERE
                Property.conditions_type = '{conditions_type}'
                AND Property.status = 'Активне'
            ;";
            return QuerySelect(q);
        }

        public static DataTable DefaultAgencySet() => QuerySelect(agencyColumns);

        public static DataTable QuerySelect(string query)
        {
            using (SqlConnection connection = new SqlConnection(connectionString))
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
