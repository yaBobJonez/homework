using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using UIComponents;

namespace Coursework_BD
{
    public partial class MainForm : Form
    {
        private string unitColumns;
        private string conditions_type;
        private string unit_type;

        private string landColumns;
        private string landConditions_type;
        
        public MainForm()
        {
            InitializeComponent();
            conditionsTypeCombo.SelectedIndex = 0;
            typeCombo.SelectedIndex = 0;
            landConditionsCombo.SelectedIndex = 0;
            agencyGridView.DataSource = DBConnector.DefaultAgencySet();
            foreach (KeyValuePair<string, string> table in this.tableNames)
                tableStatsCombo.Items.Add(table.Key);
            foreach (KeyValuePair<string, string> field in this.tableFields["Агентство"])
                fieldStatsCombo.Items.Add(field.Key);
            foreach (KeyValuePair<string, string> field in this.tableGroups["Агентство"])
                groupStatsCombo.Items.Add(field.Key);
            foreach (KeyValuePair<string, string> func in this.aggrFuncs)
                functionStatsCombo.Items.Add(func.Key);
            tableStatsCombo.SelectedIndex = 0;
            fieldStatsCombo.SelectedIndex = 0;
            functionStatsCombo.SelectedIndex = 0;
            sortStatsCombo.SelectedIndex = 0;
            groupStatsCombo.SelectedIndex = 0;
        }

        private void filteringBox1_ApplyClick(object sender, EventArgs e)
        {
            string search = searchEdit.Text;
            if (search != "") search = "AND " + DBConnector.unitSearchFields(search);
            string filters = filteringBox1.Query;
            if (filters != "") filters = "AND " + filters;
            string q = $@"{unitColumns} WHERE
                Property.conditions_type = '{conditions_type}'
                AND Unit.type = '{unit_type}'
                AND Property.status = 'Активне'
                {search}
                {filters}
            ;";
            unitsGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void filteringBox1_ResetClick(object sender, EventArgs e)
        {
            unitsGridView.DataSource = DBConnector.DefaultUnitSet(conditions_type, unit_type);
        }

        private void conditionsTypeCombo_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (conditionsTypeCombo.SelectedIndex == 1)
            {
                conditions_type = "Оренда";
                unitColumns = DBConnector.unitRentColumns;
                boolFilter1.Visible = false;
                boolFilter1.Clear();
                textFilter7.Visible = true;
                numericFilter3.DataPropertyName = "cost";
                unitsGridView.Columns["installment_plan"].Visible = false;
                unitsGridView.Columns["billing_period"].Visible = true;
            }
            else
            {
                conditions_type = "Продаж";
                unitColumns = DBConnector.unitSaleColumns;
                boolFilter1.Visible = true;
                textFilter7.Visible = false;
                textFilter7.Clear();
                numericFilter3.DataPropertyName = "price";
                unitsGridView.Columns["installment_plan"].Visible = true;
                unitsGridView.Columns["billing_period"].Visible = false;
            }
            unitsGridView.DataSource = DBConnector.DefaultUnitSet(conditions_type, unit_type);
        }

        private void typeCombo_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (typeCombo.SelectedIndex == 1) unit_type = "Комерція";
            else unit_type = "Житло";
            unitsGridView.DataSource = DBConnector.DefaultUnitSet(conditions_type, unit_type);
        }

        private void searchBtn_Click(object sender, EventArgs e)
        {
            if (searchEdit.Text == "") return;
            string search = "AND " + DBConnector.unitSearchFields(searchEdit.Text);
            string q = $@"{unitColumns} WHERE
                Property.conditions_type = '{conditions_type}'
                AND Unit.type = '{unit_type}'
                AND Property.status = 'Активне'
                {search}
            ;";
            foreach (Control c in filteringBox1.filtersPanel.Controls)
                if (c is Filter filter) filter.Clear();
            unitsGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void unitsGridView_SelectionChanged(object sender, EventArgs e)
        {
            if (unitsGridView.SelectedRows.Count < 1) return;
            DataGridViewCellCollection r = unitsGridView.SelectedRows[0].Cells;
            int id = (int)r["id"].Value;
            int building_id = DBConnector.QuerySelect($"SELECT building_id FROM Unit WHERE id = {id}").Rows[0].Field<int>(0);
            int property_id = DBConnector.QuerySelect($"SELECT property_id FROM Unit WHERE id = {id}").Rows[0].Field<int>(0);
            unitDescription.Text = DBConnector.QuerySelect($"SELECT description FROM Property WHERE Property.id = {property_id}").Rows[0].Field<string>(0);
            string building_query = $@"SELECT 
                    zone, zipcode,
                    CONCAT(street, ', ', number, ' ', section) AS address,
                    stories, passenger_elevators, freight_elevators, built
                FROM Building
                WHERE id = {building_id};";
            alternativeGridViewPanel1.SetFirstData(DBConnector.QuerySelect(building_query));
            if (unit_type == "Житло")
            {
                string q = $@"SELECT bedrooms, living_room, kitchens, dining_room, bathrooms, restrooms, storage_room, renovation
                    FROM Housing_unit WHERE unit_id = {id};";
                alternativeGridViewPanel2.Title = "Про житло";
                alternativeGridViewPanel2.SetFirstData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel2.ShowFirst();
            }
            else
            {
                string q = $"SELECT category, usage, bathrooms, parking_spaces FROM Commercial_unit WHERE unit_id = {id};";
                alternativeGridViewPanel2.Title = "Про комерційне приміщення";
                alternativeGridViewPanel2.SetSecondData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel2.ShowSecond();
            }
            if (conditions_type == "Продаж")
            {
                string q = $"SELECT price, installment_plan, completion_date FROM Sale_conditions WHERE property_id = {property_id};";
                alternativeGridViewPanel3.Title = "Умови продажу";
                alternativeGridViewPanel3.SetFirstData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel3.ShowFirst();
                q = $@"SELECT CONCAT(first_name, ' ', last_name) AS name, sex, phone, email, registered
                    FROM Owner
                    JOIN Sale_conditions ON Sale_conditions.owner_passport = Owner.passport
                    WHERE property_id = {property_id};";
                alternativeGridViewPanel4.Title = "Власник";
                alternativeGridViewPanel4.SetFirstData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel4.ShowFirst();
            }
            else
            {
                string q = $"SELECT cost, billing_period, min_rent_period, max_rent_period FROM Lease_conditions WHERE property_id = {property_id};";
                alternativeGridViewPanel3.Title = "Умови оренди";
                alternativeGridViewPanel3.SetSecondData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel3.ShowSecond();
                q = $@"SELECT CONCAT(first_name, ' ', last_name) AS name, sex, Agent.phone, Agency.name AS agency_name, works_since, Agent.rating
                    FROM Agent
                    JOIN Agency ON Agent.agency_id = Agency.id
                    JOIN Lease_conditions ON Lease_conditions.agent_passport = Agent.passport
                    WHERE property_id = {property_id};";
                alternativeGridViewPanel4.Title = "Рієлтор";
                alternativeGridViewPanel4.SetSecondData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel4.ShowSecond();
            }
            string inf_q = $"SELECT title, category FROM Infrastructure WHERE unit_id = {id};";
            infrastructureGridView.DataSource = DBConnector.QuerySelect(inf_q);
            string amen_q = $"SELECT title, cost FROM Amenity WHERE unit_id = {id};";
            amenitiesGridView.DataSource = DBConnector.QuerySelect(amen_q);
        }

        private void filteringBox2_ApplyClick(object sender, EventArgs e)
        {
            string search = landSearchEdit.Text;
            if (search != "") search = "AND " + DBConnector.landSearchFields(search);
            string filters = filteringBox2.Query;
            if (filters != "") filters = "AND " + filters;
            string q = $@"{landColumns} WHERE
                Property.conditions_type = '{landConditions_type}'
                AND Property.status = 'Активне'
                {search}
                {filters}
            ;";
            landGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void filteringBox2_ResetClick(object sender, EventArgs e)
        {
            landGridView.DataSource = DBConnector.DefaultLandSet(landConditions_type);
        }

        private void landConditionsCombo_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (landConditionsCombo.SelectedIndex == 1)
            {
                landConditions_type = "Оренда";
                landColumns = DBConnector.landRentColumns;
                boolFilter2.Visible = false;
                boolFilter2.Clear();
                textFilter10.Visible = true;
                numericFilter5.DataPropertyName = "cost";
                landGridView.Columns["installment_planLand"].Visible = false;
                landGridView.Columns["billing_periodLand"].Visible = true;
            }
            else
            {
                landConditions_type = "Продаж";
                landColumns = DBConnector.landSaleColumns;
                boolFilter2.Visible = true;
                textFilter10.Visible = false;
                textFilter10.Clear();
                numericFilter5.DataPropertyName = "price";
                landGridView.Columns["installment_planLand"].Visible = true;
                landGridView.Columns["billing_periodLand"].Visible = false;
            }
            landGridView.DataSource = DBConnector.DefaultLandSet(landConditions_type);
        }

        private void landSearchBtn_Click(object sender, EventArgs e)
        {
            if (landSearchEdit.Text == "") return;
            string search = "AND " + DBConnector.landSearchFields(landSearchEdit.Text);
            string q = $@"{landColumns} WHERE
                Property.conditions_type = '{landConditions_type}'
                AND Property.status = 'Активне'
                {search}
            ;";
            foreach (Control c in filteringBox2.filtersPanel.Controls)
                if (c is Filter filter) filter.Clear();
            landGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void landGridView_SelectionChanged(object sender, EventArgs e)
        {
            if (landGridView.SelectedRows.Count < 1) return;
            DataGridViewCellCollection r = landGridView.SelectedRows[0].Cells;
            string cadastre_number = (string)r["cadastre_number"].Value;
            int property_id = DBConnector.QuerySelect($"SELECT property_id FROM Land WHERE cadastre_number = '{cadastre_number}'")
                .Rows[0].Field<int>(0);
            landDescription.Text = DBConnector.QuerySelect($"SELECT description FROM Property WHERE Property.id = {property_id}").Rows[0].Field<string>(0);
            if (landConditions_type == "Продаж")
            {
                string q = $"SELECT price, installment_plan, completion_date FROM Sale_conditions WHERE property_id = {property_id};";
                alternativeGridViewPanel5.Title = "Умови продажу";
                alternativeGridViewPanel5.SetFirstData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel5.ShowFirst();
                q = $@"SELECT CONCAT(first_name, ' ', last_name) AS name, sex, phone, email, registered
                    FROM Owner
                    JOIN Sale_conditions ON Sale_conditions.owner_passport = Owner.passport
                    WHERE property_id = {property_id};";
                alternativeGridViewPanel6.Title = "Власник";
                alternativeGridViewPanel6.SetFirstData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel6.ShowFirst();
            }
            else
            {
                string q = $"SELECT cost, billing_period, min_rent_period, max_rent_period FROM Lease_conditions WHERE property_id = {property_id};";
                alternativeGridViewPanel5.Title = "Умови оренди";
                alternativeGridViewPanel5.SetSecondData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel5.ShowSecond();
                q = $@"SELECT CONCAT(first_name, ' ', last_name) AS name, sex, Agent.phone, Agency.name AS agency_name, works_since, Agent.rating
                    FROM Agent
                    JOIN Agency ON Agent.agency_id = Agency.id
                    JOIN Lease_conditions ON Lease_conditions.agent_passport = Agent.passport
                    WHERE property_id = {property_id};";
                alternativeGridViewPanel6.Title = "Рієлтор";
                alternativeGridViewPanel6.SetSecondData(DBConnector.QuerySelect(q));
                alternativeGridViewPanel6.ShowSecond();
            }
        }

        private void filteringBox3_ApplyClick(object sender, EventArgs e)
        {
            string search = agencySearchEdit.Text;
            if (search != "") search = "AND " + DBConnector.agencySearchFields(search);
            string filters = filteringBox3.Query;
            if (filters != "") filters = "AND " + filters;
            string q = $"{DBConnector.agencyColumns} WHERE 1=1 {search} {filters};";
            agencyGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void filteringBox3_ResetClick(object sender, EventArgs e)
        {
            agencyGridView.DataSource = DBConnector.DefaultAgencySet();
        }

        private void agencySearchBtn_Click(object sender, EventArgs e)
        {
            if (agencySearchEdit.Text == "") return;
            string search = DBConnector.agencySearchFields(agencySearchEdit.Text);
            string q = $"{DBConnector.agencyColumns} WHERE {search};";
            foreach (Control c in filteringBox3.filtersPanel.Controls)
                if (c is Filter filter) filter.Clear();
            agencyGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void agencyGridView_SelectionChanged(object sender, EventArgs e)
        {
            if (agencyGridView.SelectedRows.Count < 1) return;
            DataGridViewCellCollection r = agencyGridView.SelectedRows[0].Cells;
            int id = (int)r["idAgency"].Value;
            agencyDescription.Text = DBConnector.QuerySelect($"SELECT description FROM Agency WHERE id = {id}").Rows[0].Field<string>(0);
            string q = $@"SELECT
                    CONCAT(first_name, ' ', last_name) AS name,
                    sex, phone, works_since, rating
                FROM Agent WHERE agency_id = {id};";
            agentGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private readonly Dictionary<string, string> tableNames = new Dictionary<string, string>{
            {"Агентство", "Agency"},
            {"Рієлтор", "Agent"},
            {"Зручність", "Amenity"},
            {"Будівля", "Building"},
            {"Комерційне приміщення", "Commercial_unit"},
            {"Житлове приміщення", "Housing_unit"},
            {"Оренда", "Lease_conditions"},
            {"Обʼєкт нерух.", "Property"},
            {"Продаж", "Sale_conditions"},
            {"Приміщення", "Unit"},
        };
        private readonly Dictionary<string, Dictionary<string, string>> tableFields = new Dictionary<string, Dictionary<string, string>>{
            {"Агентство", new Dictionary<string, string>{
                {"Рік заснування", "establishment_year"},
                {"Рейтинг", "rating"},
            }},
            {"Рієлтор", new Dictionary<string, string>{
                {"Рік початку роботу", "works_since"},
                {"Рейтинг", "rating"},
            }},
            {"Зручність", new Dictionary<string, string>{
                {"Вартість", "cost"},
            }},
            {"Будівля", new Dictionary<string, string>{
                {"Поверховість", "stories"},
                {"Пасаж. ліфтів", "passenger_elevators"},
                {"Вантаж. ліфтів", "freight_elevators"},
            }},
            {"Комерційне приміщення", new Dictionary<string, string>{
                {"Санвузлів", "bathrooms"},
                {"Паркувальних місць", "parking_spaces"},
            }},
            {"Житлове приміщення", new Dictionary<string, string>{
                {"Спальних кімнат", "bedrooms"},
                {"Кухонь", "kitchens"},
                {"Ванних кімнат", "bathrooms"},
                {"Туалетів", "restrooms"},
            }},
            {"Оренда", new Dictionary<string, string>{
                {"Вартість", "cost"},
            }},
            {"Обʼєкт нерух.", new Dictionary<string, string>{
                {"Площа", "area"},
            }},
            {"Продаж", new Dictionary<string, string>{
                {"Ціна", "price"},
            }},
            {"Приміщення", new Dictionary<string, string>{
                {"Поверх", "level"},
            }},
        };
        private readonly Dictionary<string, string> aggrFuncs = new Dictionary<string, string>{
            {"Мінімальне", "MIN"},
            {"Максимальне", "MAX"},
            {"Кількість", "COUNT"},
            {"Сума", "SUM"},
            {"Середнє", "AVG"},
        };
        private readonly Dictionary<string, Dictionary<string, string>> tableGroups = new Dictionary<string, Dictionary<string, string>>{
            {"Агентство", new Dictionary<string, string>{
                {"Назва", "name"},
                {"Зареєстровано у", "registered_in"},
                {"Рік заснування", "establishment_year"},
                {"Рейтинг", "rating"},
            }},
            {"Рієлтор", new Dictionary<string, string>{
                {"Імʼя", "first_name"},
                {"Прізвище", "last_name"},
                {"Стать", "sex"},
                {"Працює з", "works_since"},
                {"Рейтинг", "rating"},
            }},
            {"Зручність", new Dictionary<string, string>{
                {"Назва", "title"},
            }},
            {"Будівля", new Dictionary<string, string>{
                {"Зона", "zone"},
                {"Тип", "type"},
                {"Населений пункт", "settlement"},
                {"Індекс", "zipcode"},
                {"ЖК", "complex"},
                {"Поверховість", "stories"},
                {"Збудовано", "built"},
            }},
            {"Комерційне приміщення", new Dictionary<string, string>{
                {"Категорія", "category"},
                {"Призначення", "usage"},
                {"Санвузлів", "bathrooms"},
                {"Паркувальних місць", "parking_spaces"},
            }},
            {"Житлове приміщення", new Dictionary<string, string>{
                {"Спальних кімнат", "bedrooms"},
                {"Кухонь", "kitchens"},
                {"Ванних кімнат", "bathrooms"},
                {"Туалетів", "restrooms"},
                {"Ремонт", "renovation"},
            }},
            {"Оренда", new Dictionary<string, string>{
                {"Платіжний період", "billing_period"},
                {"Мін. період оренди", "min_rent_period"},
                {"Макс. період оренди", "max_rent_period"},
            }},
            {"Обʼєкт нерух.", new Dictionary<string, string>{
                {"Тип умов", "conditions_type"},
                {"Статус", "status"},
                {"Дата створення", "creation_date"},
            }},
            {"Продаж", new Dictionary<string, string>{
                {"Розстрочка", "installment_plan"},
                {"Дата здачі", "completion_date"},
            }},
            {"Приміщення", new Dictionary<string, string>{
                {"Назва", "name"},
                {"Тип", "type"},
            }},
        };

        private void tableStatsCombo_SelectedIndexChanged(object sender, EventArgs e)
        {
            fieldStatsCombo.Items.Clear();
            groupStatsCombo.Items.Clear();
            foreach (KeyValuePair<string, string> field in this.tableFields[this.tableStatsCombo.Text])
                fieldStatsCombo.Items.Add(field.Key);
            foreach (KeyValuePair<string, string> field in this.tableGroups[this.tableStatsCombo.Text])
                groupStatsCombo.Items.Add(field.Key);
            fieldStatsCombo.SelectedIndex = 0;
            groupStatsCombo.SelectedIndex = 0;
        }

        private void evalStatsBtn_Click(object sender, EventArgs e)
        {
            string table = this.tableNames[tableStatsCombo.Text];
            string field = this.tableFields[tableStatsCombo.Text][fieldStatsCombo.Text];
            string func = this.aggrFuncs[functionStatsCombo.Text];
            string order = sortStatsCombo.SelectedIndex == 0 ? "ASC" : "DESC";
            string group = this.tableGroups[tableStatsCombo.Text][groupStatsCombo.Text];
            string q = $@"SELECT
                    {group} AS group_name,
                    {func}({field}) AS result
                FROM {table}                
                GROUP BY {group}
                ORDER BY result {order};";
            grouppingGridView.DataSource = DBConnector.QuerySelect(q);
        }

        private void clearStatsBtn_Click(object sender, EventArgs e)
        {
            (grouppingGridView.DataSource as DataTable).Clear();
        }
    }
}
