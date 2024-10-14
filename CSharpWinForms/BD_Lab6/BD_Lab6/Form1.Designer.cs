namespace BD_Lab6
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.Company = new System.Windows.Forms.DataGridView();
            this.codeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.websiteDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.companyBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.flightsDBDataSet = new BD_Lab6.FlightsDBDataSet();
            this.Flight = new System.Windows.Forms.DataGridView();
            this.numberDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.planenumberDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.companycodeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.originDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.destinationDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.departureDateDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.departureTimeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.arrivalDateDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.arrivalTimeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.delayedDataGridViewCheckBoxColumn = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.flightBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.Passenger = new System.Windows.Forms.DataGridView();
            this.passportDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.sexDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.firstnameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.lastnameDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dateofbirthDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nationalityDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.validuntilDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.passengerBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.Plane = new System.Windows.Forms.DataGridView();
            this.numberDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.brandDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.modelDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.companycodeDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.planeBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.Restriction = new System.Windows.Forms.DataGridView();
            this.idDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.flightnumberDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.nameDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.conditionsDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.restrictionBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.Seat = new System.Windows.Forms.DataGridView();
            this.idDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.numberDataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.classDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.priceDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.flightnumberDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.passengerpassportDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.seatBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.Service = new System.Windows.Forms.DataGridView();
            this.idDataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.flightnumberDataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.availableDataGridViewCheckBoxColumn = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.nameDataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.typeDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.amountDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.priceDataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.serviceBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.companyTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.CompanyTableAdapter();
            this.flightTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.FlightTableAdapter();
            this.passengerTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.PassengerTableAdapter();
            this.planeTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.PlaneTableAdapter();
            this.restrictionTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.RestrictionTableAdapter();
            this.seatTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.SeatTableAdapter();
            this.serviceTableAdapter = new BD_Lab6.FlightsDBDataSetTableAdapters.ServiceTableAdapter();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.роботаЗТаблицямиToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.авіакомпаніїToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.рейсиToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.пасажириToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.літакиToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.обмеженняToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.місцяToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.послугиToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.внутрішнєЗєднанняMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.tableLayoutPanel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.Company)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.companyBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.flightsDBDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Flight)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.flightBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Passenger)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.passengerBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Plane)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.planeBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Restriction)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.restrictionBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Seat)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.seatBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.Service)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.serviceBindingSource)).BeginInit();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.Anchor = ((System.Windows.Forms.AnchorStyles)(((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.tableLayoutPanel1.ColumnCount = 2;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.Controls.Add(this.Company, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.Flight, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.Passenger, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.Plane, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.Restriction, 0, 2);
            this.tableLayoutPanel1.Controls.Add(this.Seat, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.Service, 0, 3);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(12, 27);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 4;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(776, 411);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // Company
            // 
            this.Company.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Company.AutoGenerateColumns = false;
            this.Company.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Company.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codeDataGridViewTextBoxColumn,
            this.nameDataGridViewTextBoxColumn,
            this.websiteDataGridViewTextBoxColumn});
            this.Company.DataSource = this.companyBindingSource;
            this.Company.Location = new System.Drawing.Point(3, 3);
            this.Company.Name = "Company";
            this.Company.Size = new System.Drawing.Size(382, 96);
            this.Company.TabIndex = 0;
            // 
            // codeDataGridViewTextBoxColumn
            // 
            this.codeDataGridViewTextBoxColumn.DataPropertyName = "code";
            this.codeDataGridViewTextBoxColumn.HeaderText = "code";
            this.codeDataGridViewTextBoxColumn.Name = "codeDataGridViewTextBoxColumn";
            // 
            // nameDataGridViewTextBoxColumn
            // 
            this.nameDataGridViewTextBoxColumn.DataPropertyName = "name";
            this.nameDataGridViewTextBoxColumn.HeaderText = "name";
            this.nameDataGridViewTextBoxColumn.Name = "nameDataGridViewTextBoxColumn";
            // 
            // websiteDataGridViewTextBoxColumn
            // 
            this.websiteDataGridViewTextBoxColumn.DataPropertyName = "website";
            this.websiteDataGridViewTextBoxColumn.HeaderText = "website";
            this.websiteDataGridViewTextBoxColumn.Name = "websiteDataGridViewTextBoxColumn";
            // 
            // companyBindingSource
            // 
            this.companyBindingSource.DataMember = "Company";
            this.companyBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // flightsDBDataSet
            // 
            this.flightsDBDataSet.DataSetName = "FlightsDBDataSet";
            this.flightsDBDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // Flight
            // 
            this.Flight.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Flight.AutoGenerateColumns = false;
            this.Flight.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Flight.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.numberDataGridViewTextBoxColumn,
            this.planenumberDataGridViewTextBoxColumn,
            this.companycodeDataGridViewTextBoxColumn,
            this.originDataGridViewTextBoxColumn,
            this.destinationDataGridViewTextBoxColumn,
            this.departureDateDataGridViewTextBoxColumn,
            this.departureTimeDataGridViewTextBoxColumn,
            this.arrivalDateDataGridViewTextBoxColumn,
            this.arrivalTimeDataGridViewTextBoxColumn,
            this.delayedDataGridViewCheckBoxColumn});
            this.Flight.DataSource = this.flightBindingSource;
            this.Flight.Location = new System.Drawing.Point(391, 3);
            this.Flight.Name = "Flight";
            this.Flight.Size = new System.Drawing.Size(382, 96);
            this.Flight.TabIndex = 1;
            // 
            // numberDataGridViewTextBoxColumn
            // 
            this.numberDataGridViewTextBoxColumn.DataPropertyName = "number";
            this.numberDataGridViewTextBoxColumn.HeaderText = "number";
            this.numberDataGridViewTextBoxColumn.Name = "numberDataGridViewTextBoxColumn";
            // 
            // planenumberDataGridViewTextBoxColumn
            // 
            this.planenumberDataGridViewTextBoxColumn.DataPropertyName = "plane_number";
            this.planenumberDataGridViewTextBoxColumn.HeaderText = "plane_number";
            this.planenumberDataGridViewTextBoxColumn.Name = "planenumberDataGridViewTextBoxColumn";
            // 
            // companycodeDataGridViewTextBoxColumn
            // 
            this.companycodeDataGridViewTextBoxColumn.DataPropertyName = "company_code";
            this.companycodeDataGridViewTextBoxColumn.HeaderText = "company_code";
            this.companycodeDataGridViewTextBoxColumn.Name = "companycodeDataGridViewTextBoxColumn";
            // 
            // originDataGridViewTextBoxColumn
            // 
            this.originDataGridViewTextBoxColumn.DataPropertyName = "origin";
            this.originDataGridViewTextBoxColumn.HeaderText = "origin";
            this.originDataGridViewTextBoxColumn.Name = "originDataGridViewTextBoxColumn";
            // 
            // destinationDataGridViewTextBoxColumn
            // 
            this.destinationDataGridViewTextBoxColumn.DataPropertyName = "destination";
            this.destinationDataGridViewTextBoxColumn.HeaderText = "destination";
            this.destinationDataGridViewTextBoxColumn.Name = "destinationDataGridViewTextBoxColumn";
            // 
            // departureDateDataGridViewTextBoxColumn
            // 
            this.departureDateDataGridViewTextBoxColumn.DataPropertyName = "departureDate";
            this.departureDateDataGridViewTextBoxColumn.HeaderText = "departureDate";
            this.departureDateDataGridViewTextBoxColumn.Name = "departureDateDataGridViewTextBoxColumn";
            // 
            // departureTimeDataGridViewTextBoxColumn
            // 
            this.departureTimeDataGridViewTextBoxColumn.DataPropertyName = "departureTime";
            this.departureTimeDataGridViewTextBoxColumn.HeaderText = "departureTime";
            this.departureTimeDataGridViewTextBoxColumn.Name = "departureTimeDataGridViewTextBoxColumn";
            // 
            // arrivalDateDataGridViewTextBoxColumn
            // 
            this.arrivalDateDataGridViewTextBoxColumn.DataPropertyName = "arrivalDate";
            this.arrivalDateDataGridViewTextBoxColumn.HeaderText = "arrivalDate";
            this.arrivalDateDataGridViewTextBoxColumn.Name = "arrivalDateDataGridViewTextBoxColumn";
            // 
            // arrivalTimeDataGridViewTextBoxColumn
            // 
            this.arrivalTimeDataGridViewTextBoxColumn.DataPropertyName = "arrivalTime";
            this.arrivalTimeDataGridViewTextBoxColumn.HeaderText = "arrivalTime";
            this.arrivalTimeDataGridViewTextBoxColumn.Name = "arrivalTimeDataGridViewTextBoxColumn";
            // 
            // delayedDataGridViewCheckBoxColumn
            // 
            this.delayedDataGridViewCheckBoxColumn.DataPropertyName = "delayed";
            this.delayedDataGridViewCheckBoxColumn.HeaderText = "delayed";
            this.delayedDataGridViewCheckBoxColumn.Name = "delayedDataGridViewCheckBoxColumn";
            // 
            // flightBindingSource
            // 
            this.flightBindingSource.DataMember = "Flight";
            this.flightBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // Passenger
            // 
            this.Passenger.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Passenger.AutoGenerateColumns = false;
            this.Passenger.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Passenger.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.passportDataGridViewTextBoxColumn,
            this.sexDataGridViewTextBoxColumn,
            this.firstnameDataGridViewTextBoxColumn,
            this.lastnameDataGridViewTextBoxColumn,
            this.dateofbirthDataGridViewTextBoxColumn,
            this.nationalityDataGridViewTextBoxColumn,
            this.validuntilDataGridViewTextBoxColumn});
            this.Passenger.DataSource = this.passengerBindingSource;
            this.Passenger.Location = new System.Drawing.Point(3, 105);
            this.Passenger.Name = "Passenger";
            this.Passenger.Size = new System.Drawing.Size(382, 96);
            this.Passenger.TabIndex = 2;
            // 
            // passportDataGridViewTextBoxColumn
            // 
            this.passportDataGridViewTextBoxColumn.DataPropertyName = "passport";
            this.passportDataGridViewTextBoxColumn.HeaderText = "passport";
            this.passportDataGridViewTextBoxColumn.Name = "passportDataGridViewTextBoxColumn";
            // 
            // sexDataGridViewTextBoxColumn
            // 
            this.sexDataGridViewTextBoxColumn.DataPropertyName = "sex";
            this.sexDataGridViewTextBoxColumn.HeaderText = "sex";
            this.sexDataGridViewTextBoxColumn.Name = "sexDataGridViewTextBoxColumn";
            // 
            // firstnameDataGridViewTextBoxColumn
            // 
            this.firstnameDataGridViewTextBoxColumn.DataPropertyName = "first_name";
            this.firstnameDataGridViewTextBoxColumn.HeaderText = "first_name";
            this.firstnameDataGridViewTextBoxColumn.Name = "firstnameDataGridViewTextBoxColumn";
            // 
            // lastnameDataGridViewTextBoxColumn
            // 
            this.lastnameDataGridViewTextBoxColumn.DataPropertyName = "last_name";
            this.lastnameDataGridViewTextBoxColumn.HeaderText = "last_name";
            this.lastnameDataGridViewTextBoxColumn.Name = "lastnameDataGridViewTextBoxColumn";
            // 
            // dateofbirthDataGridViewTextBoxColumn
            // 
            this.dateofbirthDataGridViewTextBoxColumn.DataPropertyName = "date_of_birth";
            this.dateofbirthDataGridViewTextBoxColumn.HeaderText = "date_of_birth";
            this.dateofbirthDataGridViewTextBoxColumn.Name = "dateofbirthDataGridViewTextBoxColumn";
            // 
            // nationalityDataGridViewTextBoxColumn
            // 
            this.nationalityDataGridViewTextBoxColumn.DataPropertyName = "nationality";
            this.nationalityDataGridViewTextBoxColumn.HeaderText = "nationality";
            this.nationalityDataGridViewTextBoxColumn.Name = "nationalityDataGridViewTextBoxColumn";
            // 
            // validuntilDataGridViewTextBoxColumn
            // 
            this.validuntilDataGridViewTextBoxColumn.DataPropertyName = "valid_until";
            this.validuntilDataGridViewTextBoxColumn.HeaderText = "valid_until";
            this.validuntilDataGridViewTextBoxColumn.Name = "validuntilDataGridViewTextBoxColumn";
            // 
            // passengerBindingSource
            // 
            this.passengerBindingSource.DataMember = "Passenger";
            this.passengerBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // Plane
            // 
            this.Plane.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Plane.AutoGenerateColumns = false;
            this.Plane.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Plane.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.numberDataGridViewTextBoxColumn1,
            this.brandDataGridViewTextBoxColumn,
            this.modelDataGridViewTextBoxColumn,
            this.companycodeDataGridViewTextBoxColumn1});
            this.Plane.DataSource = this.planeBindingSource;
            this.Plane.Location = new System.Drawing.Point(391, 105);
            this.Plane.Name = "Plane";
            this.Plane.Size = new System.Drawing.Size(382, 96);
            this.Plane.TabIndex = 3;
            // 
            // numberDataGridViewTextBoxColumn1
            // 
            this.numberDataGridViewTextBoxColumn1.DataPropertyName = "number";
            this.numberDataGridViewTextBoxColumn1.HeaderText = "number";
            this.numberDataGridViewTextBoxColumn1.Name = "numberDataGridViewTextBoxColumn1";
            // 
            // brandDataGridViewTextBoxColumn
            // 
            this.brandDataGridViewTextBoxColumn.DataPropertyName = "brand";
            this.brandDataGridViewTextBoxColumn.HeaderText = "brand";
            this.brandDataGridViewTextBoxColumn.Name = "brandDataGridViewTextBoxColumn";
            // 
            // modelDataGridViewTextBoxColumn
            // 
            this.modelDataGridViewTextBoxColumn.DataPropertyName = "model";
            this.modelDataGridViewTextBoxColumn.HeaderText = "model";
            this.modelDataGridViewTextBoxColumn.Name = "modelDataGridViewTextBoxColumn";
            // 
            // companycodeDataGridViewTextBoxColumn1
            // 
            this.companycodeDataGridViewTextBoxColumn1.DataPropertyName = "company_code";
            this.companycodeDataGridViewTextBoxColumn1.HeaderText = "company_code";
            this.companycodeDataGridViewTextBoxColumn1.Name = "companycodeDataGridViewTextBoxColumn1";
            // 
            // planeBindingSource
            // 
            this.planeBindingSource.DataMember = "Plane";
            this.planeBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // Restriction
            // 
            this.Restriction.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Restriction.AutoGenerateColumns = false;
            this.Restriction.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Restriction.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn,
            this.flightnumberDataGridViewTextBoxColumn,
            this.nameDataGridViewTextBoxColumn1,
            this.conditionsDataGridViewTextBoxColumn});
            this.Restriction.DataSource = this.restrictionBindingSource;
            this.Restriction.Location = new System.Drawing.Point(3, 207);
            this.Restriction.Name = "Restriction";
            this.Restriction.Size = new System.Drawing.Size(382, 96);
            this.Restriction.TabIndex = 4;
            // 
            // idDataGridViewTextBoxColumn
            // 
            this.idDataGridViewTextBoxColumn.DataPropertyName = "id";
            this.idDataGridViewTextBoxColumn.HeaderText = "id";
            this.idDataGridViewTextBoxColumn.Name = "idDataGridViewTextBoxColumn";
            this.idDataGridViewTextBoxColumn.ReadOnly = true;
            // 
            // flightnumberDataGridViewTextBoxColumn
            // 
            this.flightnumberDataGridViewTextBoxColumn.DataPropertyName = "flight_number";
            this.flightnumberDataGridViewTextBoxColumn.HeaderText = "flight_number";
            this.flightnumberDataGridViewTextBoxColumn.Name = "flightnumberDataGridViewTextBoxColumn";
            // 
            // nameDataGridViewTextBoxColumn1
            // 
            this.nameDataGridViewTextBoxColumn1.DataPropertyName = "name";
            this.nameDataGridViewTextBoxColumn1.HeaderText = "name";
            this.nameDataGridViewTextBoxColumn1.Name = "nameDataGridViewTextBoxColumn1";
            // 
            // conditionsDataGridViewTextBoxColumn
            // 
            this.conditionsDataGridViewTextBoxColumn.DataPropertyName = "conditions";
            this.conditionsDataGridViewTextBoxColumn.HeaderText = "conditions";
            this.conditionsDataGridViewTextBoxColumn.Name = "conditionsDataGridViewTextBoxColumn";
            // 
            // restrictionBindingSource
            // 
            this.restrictionBindingSource.DataMember = "Restriction";
            this.restrictionBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // Seat
            // 
            this.Seat.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Seat.AutoGenerateColumns = false;
            this.Seat.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Seat.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn1,
            this.numberDataGridViewTextBoxColumn2,
            this.classDataGridViewTextBoxColumn,
            this.priceDataGridViewTextBoxColumn,
            this.flightnumberDataGridViewTextBoxColumn1,
            this.passengerpassportDataGridViewTextBoxColumn});
            this.Seat.DataSource = this.seatBindingSource;
            this.Seat.Location = new System.Drawing.Point(391, 207);
            this.Seat.Name = "Seat";
            this.Seat.Size = new System.Drawing.Size(382, 96);
            this.Seat.TabIndex = 5;
            // 
            // idDataGridViewTextBoxColumn1
            // 
            this.idDataGridViewTextBoxColumn1.DataPropertyName = "id";
            this.idDataGridViewTextBoxColumn1.HeaderText = "id";
            this.idDataGridViewTextBoxColumn1.Name = "idDataGridViewTextBoxColumn1";
            this.idDataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // numberDataGridViewTextBoxColumn2
            // 
            this.numberDataGridViewTextBoxColumn2.DataPropertyName = "number";
            this.numberDataGridViewTextBoxColumn2.HeaderText = "number";
            this.numberDataGridViewTextBoxColumn2.Name = "numberDataGridViewTextBoxColumn2";
            // 
            // classDataGridViewTextBoxColumn
            // 
            this.classDataGridViewTextBoxColumn.DataPropertyName = "class";
            this.classDataGridViewTextBoxColumn.HeaderText = "class";
            this.classDataGridViewTextBoxColumn.Name = "classDataGridViewTextBoxColumn";
            // 
            // priceDataGridViewTextBoxColumn
            // 
            this.priceDataGridViewTextBoxColumn.DataPropertyName = "price";
            this.priceDataGridViewTextBoxColumn.HeaderText = "price";
            this.priceDataGridViewTextBoxColumn.Name = "priceDataGridViewTextBoxColumn";
            // 
            // flightnumberDataGridViewTextBoxColumn1
            // 
            this.flightnumberDataGridViewTextBoxColumn1.DataPropertyName = "flight_number";
            this.flightnumberDataGridViewTextBoxColumn1.HeaderText = "flight_number";
            this.flightnumberDataGridViewTextBoxColumn1.Name = "flightnumberDataGridViewTextBoxColumn1";
            // 
            // passengerpassportDataGridViewTextBoxColumn
            // 
            this.passengerpassportDataGridViewTextBoxColumn.DataPropertyName = "passenger_passport";
            this.passengerpassportDataGridViewTextBoxColumn.HeaderText = "passenger_passport";
            this.passengerpassportDataGridViewTextBoxColumn.Name = "passengerpassportDataGridViewTextBoxColumn";
            // 
            // seatBindingSource
            // 
            this.seatBindingSource.DataMember = "Seat";
            this.seatBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // Service
            // 
            this.Service.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.Service.AutoGenerateColumns = false;
            this.Service.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.Service.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.idDataGridViewTextBoxColumn2,
            this.flightnumberDataGridViewTextBoxColumn2,
            this.availableDataGridViewCheckBoxColumn,
            this.nameDataGridViewTextBoxColumn2,
            this.typeDataGridViewTextBoxColumn,
            this.amountDataGridViewTextBoxColumn,
            this.priceDataGridViewTextBoxColumn1});
            this.Service.DataSource = this.serviceBindingSource;
            this.Service.Location = new System.Drawing.Point(3, 309);
            this.Service.Name = "Service";
            this.Service.Size = new System.Drawing.Size(382, 99);
            this.Service.TabIndex = 6;
            // 
            // idDataGridViewTextBoxColumn2
            // 
            this.idDataGridViewTextBoxColumn2.DataPropertyName = "id";
            this.idDataGridViewTextBoxColumn2.HeaderText = "id";
            this.idDataGridViewTextBoxColumn2.Name = "idDataGridViewTextBoxColumn2";
            this.idDataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // flightnumberDataGridViewTextBoxColumn2
            // 
            this.flightnumberDataGridViewTextBoxColumn2.DataPropertyName = "flight_number";
            this.flightnumberDataGridViewTextBoxColumn2.HeaderText = "flight_number";
            this.flightnumberDataGridViewTextBoxColumn2.Name = "flightnumberDataGridViewTextBoxColumn2";
            // 
            // availableDataGridViewCheckBoxColumn
            // 
            this.availableDataGridViewCheckBoxColumn.DataPropertyName = "available";
            this.availableDataGridViewCheckBoxColumn.HeaderText = "available";
            this.availableDataGridViewCheckBoxColumn.Name = "availableDataGridViewCheckBoxColumn";
            // 
            // nameDataGridViewTextBoxColumn2
            // 
            this.nameDataGridViewTextBoxColumn2.DataPropertyName = "name";
            this.nameDataGridViewTextBoxColumn2.HeaderText = "name";
            this.nameDataGridViewTextBoxColumn2.Name = "nameDataGridViewTextBoxColumn2";
            // 
            // typeDataGridViewTextBoxColumn
            // 
            this.typeDataGridViewTextBoxColumn.DataPropertyName = "type";
            this.typeDataGridViewTextBoxColumn.HeaderText = "type";
            this.typeDataGridViewTextBoxColumn.Name = "typeDataGridViewTextBoxColumn";
            // 
            // amountDataGridViewTextBoxColumn
            // 
            this.amountDataGridViewTextBoxColumn.DataPropertyName = "amount";
            this.amountDataGridViewTextBoxColumn.HeaderText = "amount";
            this.amountDataGridViewTextBoxColumn.Name = "amountDataGridViewTextBoxColumn";
            // 
            // priceDataGridViewTextBoxColumn1
            // 
            this.priceDataGridViewTextBoxColumn1.DataPropertyName = "price";
            this.priceDataGridViewTextBoxColumn1.HeaderText = "price";
            this.priceDataGridViewTextBoxColumn1.Name = "priceDataGridViewTextBoxColumn1";
            // 
            // serviceBindingSource
            // 
            this.serviceBindingSource.DataMember = "Service";
            this.serviceBindingSource.DataSource = this.flightsDBDataSet;
            // 
            // companyTableAdapter
            // 
            this.companyTableAdapter.ClearBeforeFill = true;
            // 
            // flightTableAdapter
            // 
            this.flightTableAdapter.ClearBeforeFill = true;
            // 
            // passengerTableAdapter
            // 
            this.passengerTableAdapter.ClearBeforeFill = true;
            // 
            // planeTableAdapter
            // 
            this.planeTableAdapter.ClearBeforeFill = true;
            // 
            // restrictionTableAdapter
            // 
            this.restrictionTableAdapter.ClearBeforeFill = true;
            // 
            // seatTableAdapter
            // 
            this.seatTableAdapter.ClearBeforeFill = true;
            // 
            // serviceTableAdapter
            // 
            this.serviceTableAdapter.ClearBeforeFill = true;
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.роботаЗТаблицямиToolStripMenuItem,
            this.внутрішнєЗєднанняMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 1;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // роботаЗТаблицямиToolStripMenuItem
            // 
            this.роботаЗТаблицямиToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.авіакомпаніїToolStripMenuItem,
            this.рейсиToolStripMenuItem,
            this.пасажириToolStripMenuItem,
            this.літакиToolStripMenuItem,
            this.обмеженняToolStripMenuItem,
            this.місцяToolStripMenuItem,
            this.послугиToolStripMenuItem});
            this.роботаЗТаблицямиToolStripMenuItem.Name = "роботаЗТаблицямиToolStripMenuItem";
            this.роботаЗТаблицямиToolStripMenuItem.Size = new System.Drawing.Size(130, 20);
            this.роботаЗТаблицямиToolStripMenuItem.Text = "Робота з таблицями";
            // 
            // авіакомпаніїToolStripMenuItem
            // 
            this.авіакомпаніїToolStripMenuItem.Name = "авіакомпаніїToolStripMenuItem";
            this.авіакомпаніїToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.авіакомпаніїToolStripMenuItem.Text = "Авіакомпанії";
            this.авіакомпаніїToolStripMenuItem.Click += new System.EventHandler(this.авіакомпаніїToolStripMenuItem_Click);
            // 
            // рейсиToolStripMenuItem
            // 
            this.рейсиToolStripMenuItem.Name = "рейсиToolStripMenuItem";
            this.рейсиToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.рейсиToolStripMenuItem.Text = "Рейси";
            this.рейсиToolStripMenuItem.Click += new System.EventHandler(this.рейсиToolStripMenuItem_Click);
            // 
            // пасажириToolStripMenuItem
            // 
            this.пасажириToolStripMenuItem.Name = "пасажириToolStripMenuItem";
            this.пасажириToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.пасажириToolStripMenuItem.Text = "Пасажири";
            this.пасажириToolStripMenuItem.Click += new System.EventHandler(this.пасажириToolStripMenuItem_Click);
            // 
            // літакиToolStripMenuItem
            // 
            this.літакиToolStripMenuItem.Name = "літакиToolStripMenuItem";
            this.літакиToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.літакиToolStripMenuItem.Text = "Літаки";
            this.літакиToolStripMenuItem.Click += new System.EventHandler(this.літакиToolStripMenuItem_Click);
            // 
            // обмеженняToolStripMenuItem
            // 
            this.обмеженняToolStripMenuItem.Name = "обмеженняToolStripMenuItem";
            this.обмеженняToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.обмеженняToolStripMenuItem.Text = "Обмеження";
            this.обмеженняToolStripMenuItem.Click += new System.EventHandler(this.обмеженняToolStripMenuItem_Click);
            // 
            // місцяToolStripMenuItem
            // 
            this.місцяToolStripMenuItem.Name = "місцяToolStripMenuItem";
            this.місцяToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.місцяToolStripMenuItem.Text = "Місця";
            this.місцяToolStripMenuItem.Click += new System.EventHandler(this.місцяToolStripMenuItem_Click);
            // 
            // послугиToolStripMenuItem
            // 
            this.послугиToolStripMenuItem.Name = "послугиToolStripMenuItem";
            this.послугиToolStripMenuItem.Size = new System.Drawing.Size(180, 22);
            this.послугиToolStripMenuItem.Text = "Послуги";
            this.послугиToolStripMenuItem.Click += new System.EventHandler(this.послугиToolStripMenuItem_Click);
            // 
            // внутрішнєЗєднанняMenuItem
            // 
            this.внутрішнєЗєднанняMenuItem.Name = "внутрішнєЗєднанняMenuItem";
            this.внутрішнєЗєднанняMenuItem.Size = new System.Drawing.Size(134, 20);
            this.внутрішнєЗєднанняMenuItem.Text = "Внутрішнє з\'єднання";
            this.внутрішнєЗєднанняMenuItem.Click += new System.EventHandler(this.внутрішнєЗєднанняMenuItem_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.tableLayoutPanel1);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "База даних авіарейсів";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.tableLayoutPanel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.Company)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.companyBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.flightsDBDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Flight)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.flightBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Passenger)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.passengerBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Plane)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.planeBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Restriction)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.restrictionBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Seat)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.seatBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.Service)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.serviceBindingSource)).EndInit();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.DataGridView Company;
        private System.Windows.Forms.DataGridView Flight;
        private System.Windows.Forms.DataGridView Passenger;
        private System.Windows.Forms.DataGridView Plane;
        private System.Windows.Forms.DataGridView Restriction;
        private System.Windows.Forms.DataGridView Seat;
        private System.Windows.Forms.DataGridView Service;
        private FlightsDBDataSet flightsDBDataSet;
        private System.Windows.Forms.BindingSource companyBindingSource;
        private FlightsDBDataSetTableAdapters.CompanyTableAdapter companyTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn codeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn websiteDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource flightBindingSource;
        private FlightsDBDataSetTableAdapters.FlightTableAdapter flightTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn numberDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn planenumberDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn companycodeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn originDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn destinationDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn departureDateDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn departureTimeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn arrivalDateDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn arrivalTimeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewCheckBoxColumn delayedDataGridViewCheckBoxColumn;
        private System.Windows.Forms.BindingSource passengerBindingSource;
        private FlightsDBDataSetTableAdapters.PassengerTableAdapter passengerTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn passportDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn sexDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn firstnameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn lastnameDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn dateofbirthDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nationalityDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn validuntilDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource planeBindingSource;
        private FlightsDBDataSetTableAdapters.PlaneTableAdapter planeTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn numberDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn brandDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn modelDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn companycodeDataGridViewTextBoxColumn1;
        private System.Windows.Forms.BindingSource restrictionBindingSource;
        private FlightsDBDataSetTableAdapters.RestrictionTableAdapter restrictionTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn flightnumberDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn conditionsDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource seatBindingSource;
        private FlightsDBDataSetTableAdapters.SeatTableAdapter seatTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn numberDataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn classDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn priceDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn flightnumberDataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn passengerpassportDataGridViewTextBoxColumn;
        private System.Windows.Forms.BindingSource serviceBindingSource;
        private FlightsDBDataSetTableAdapters.ServiceTableAdapter serviceTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn idDataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn flightnumberDataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewCheckBoxColumn availableDataGridViewCheckBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn nameDataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn typeDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn amountDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn priceDataGridViewTextBoxColumn1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem роботаЗТаблицямиToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem авіакомпаніїToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem рейсиToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem пасажириToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem літакиToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem обмеженняToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem місцяToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem послугиToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem внутрішнєЗєднанняMenuItem;
    }
}

