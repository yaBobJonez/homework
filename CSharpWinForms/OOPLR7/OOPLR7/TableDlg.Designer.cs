namespace OOPLR7
{
    partial class TableDlg
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
            button1 = new Button();
            data = new DataGridView();
            x = new DataGridViewTextBoxColumn();
            y = new DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)data).BeginInit();
            SuspendLayout();
            // 
            // button1
            // 
            button1.Anchor = AnchorStyles.Bottom | AnchorStyles.Right;
            button1.Location = new Point(212, 257);
            button1.Name = "button1";
            button1.Size = new Size(104, 36);
            button1.TabIndex = 0;
            button1.Text = "OK";
            button1.UseVisualStyleBackColor = true;
            button1.Click += OnOK;
            // 
            // data
            // 
            data.AllowUserToAddRows = false;
            data.AllowUserToDeleteRows = false;
            data.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            data.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            data.Columns.AddRange(new DataGridViewColumn[] { x, y });
            data.Location = new Point(12, 12);
            data.Name = "data";
            data.ReadOnly = true;
            data.RowTemplate.Height = 25;
            data.Size = new Size(304, 239);
            data.TabIndex = 1;
            // 
            // x
            // 
            x.AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            x.HeaderText = "x";
            x.Name = "x";
            x.ReadOnly = true;
            // 
            // y
            // 
            y.AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            y.HeaderText = "y";
            y.Name = "y";
            y.ReadOnly = true;
            // 
            // TableDlg
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(328, 305);
            Controls.Add(data);
            Controls.Add(button1);
            Name = "TableDlg";
            Text = "Результат";
            ((System.ComponentModel.ISupportInitialize)data).EndInit();
            ResumeLayout(false);
        }

        #endregion

        private Button button1;
        private DataGridViewTextBoxColumn x;
        private DataGridViewTextBoxColumn y;
        internal DataGridView data;
    }
}