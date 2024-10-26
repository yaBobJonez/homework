namespace UIComponents
{
    partial class NumericFilter
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
            this.firstSpinner = new System.Windows.Forms.NumericUpDown();
            this.secondSpinner = new System.Windows.Forms.NumericUpDown();
            this.tableLayoutPanel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.firstSpinner)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.secondSpinner)).BeginInit();
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
            this.tableLayoutPanel1.Controls.Add(this.firstSpinner, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.secondSpinner, 1, 1);
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
            // firstSpinner
            // 
            this.firstSpinner.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.firstSpinner.Enabled = false;
            this.firstSpinner.Location = new System.Drawing.Point(3, 30);
            this.firstSpinner.Maximum = new decimal(new int[] {
            -1,
            2147483647,
            0,
            0});
            this.firstSpinner.Name = "firstSpinner";
            this.firstSpinner.Size = new System.Drawing.Size(75, 20);
            this.firstSpinner.TabIndex = 3;
            // 
            // secondSpinner
            // 
            this.secondSpinner.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.secondSpinner.Enabled = false;
            this.secondSpinner.Location = new System.Drawing.Point(84, 30);
            this.secondSpinner.Maximum = new decimal(new int[] {
            -1,
            2147483647,
            0,
            0});
            this.secondSpinner.Name = "secondSpinner";
            this.secondSpinner.Size = new System.Drawing.Size(76, 20);
            this.secondSpinner.TabIndex = 4;
            // 
            // NumericFilter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Controls.Add(this.tableLayoutPanel1);
            this.Name = "NumericFilter";
            this.Size = new System.Drawing.Size(169, 61);
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.firstSpinner)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.secondSpinner)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.ComboBox operationCombo;
        private System.Windows.Forms.Label columnLabel;
        private System.Windows.Forms.NumericUpDown firstSpinner;
        private System.Windows.Forms.NumericUpDown secondSpinner;
    }
}
