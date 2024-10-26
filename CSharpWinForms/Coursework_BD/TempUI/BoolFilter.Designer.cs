namespace UIComponents
{
    partial class BoolFilter
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
            this.valueCheck = new System.Windows.Forms.CheckBox();
            this.SuspendLayout();
            // 
            // valueCheck
            // 
            this.valueCheck.Anchor = ((System.Windows.Forms.AnchorStyles)((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom) 
            | System.Windows.Forms.AnchorStyles.Left) 
            | System.Windows.Forms.AnchorStyles.Right)));
            this.valueCheck.Checked = true;
            this.valueCheck.CheckState = System.Windows.Forms.CheckState.Indeterminate;
            this.valueCheck.Location = new System.Drawing.Point(3, 3);
            this.valueCheck.Name = "valueCheck";
            this.valueCheck.Size = new System.Drawing.Size(163, 20);
            this.valueCheck.TabIndex = 0;
            this.valueCheck.ThreeState = true;
            this.valueCheck.UseVisualStyleBackColor = true;
            // 
            // BoolFilter
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.Controls.Add(this.valueCheck);
            this.Name = "BoolFilter";
            this.Size = new System.Drawing.Size(169, 26);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.CheckBox valueCheck;
    }
}
