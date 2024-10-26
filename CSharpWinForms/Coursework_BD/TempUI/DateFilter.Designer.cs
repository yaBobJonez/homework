namespace UIComponents
{
    partial class DateFilter
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

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.operationCombo = new System.Windows.Forms.ComboBox();
            this.columnLabel = new System.Windows.Forms.Label();
            this.firstDt = new System.Windows.Forms.DateTimePicker();
            this.secondDt = new System.Windows.Forms.DateTimePicker();
            this.tableLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.tableLayoutPanel1.ColumnCount = 2;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel1.Controls.Add(this.operationCombo, 1, 0);
            this.tableLayoutPanel1.Controls.Add(this.columnLabel, 0, 0);
            this.tableLayoutPanel1.Controls.Add(this.firstDt, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.secondDt, 1, 1);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(3, 3);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 2;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle());
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle());
            this.tableLayoutPanel1.Size = new System.Drawing.Size(163, 55);
            this.tableLayoutPanel1.TabIndex = 1;
            // 
            // operationCombo
            // 
            this.operationCombo.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.operationCombo.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.operationCombo.FormattingEnabled = true;
            this.operationCombo.Items.AddRange(new object[] {
            "",
            "між",
            "<",
            "≤",
            "=",
            "≠",
            "≥",
            ">"});
            this.operationCombo.Location = new System.Drawing.Point(84, 3);
            this.operationCombo.Name = "operationCombo";
            this.operationCombo.Size = new System.Drawing.Size(76, 21);
            this.operationCombo.TabIndex = 1;
            // 
            // columnLabel
            // 
            this.columnLabel.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.columnLabel.AutoSize = true;
            this.columnLabel.Location = new System.Drawing.Point(3, 0);
            this.columnLabel.Name = "columnLabel";
            this.columnLabel.Size = new System.Drawing.Size(75, 27);
            this.columnLabel.TabIndex = 2;
            this.columnLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // firstDt
            // 
            this.firstDt.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.firstDt.Enabled = false;
            this.firstDt.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.firstDt.Location = new System.Drawing.Point(3, 30);
            this.firstDt.Name = "firstDt";
            this.firstDt.Size = new System.Drawing.Size(75, 20);
            this.firstDt.TabIndex = 5;
            // 
            // secondDt
            // 
            this.secondDt.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.secondDt.Enabled = false;
            this.secondDt.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.secondDt.Location = new System.Drawing.Point(84, 30);
            this.secondDt.Name = "secondDt";
            this.secondDt.Size = new System.Drawing.Size(76, 20);
            this.secondDt.TabIndex = 6;
            // 
            // DateFilter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Controls.Add(this.tableLayoutPanel1);
            this.Name = "DateFilter";
            this.Size = new System.Drawing.Size(169, 61);
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.ComboBox operationCombo;
        private System.Windows.Forms.Label columnLabel;
        private System.Windows.Forms.DateTimePicker firstDt;
        private System.Windows.Forms.DateTimePicker secondDt;
    }
}
