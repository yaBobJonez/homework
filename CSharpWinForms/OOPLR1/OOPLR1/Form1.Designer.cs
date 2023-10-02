namespace OOPLR1
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            button1 = new Button();
            tableLayoutPanel1 = new TableLayoutPanel();
            button2 = new Button();
            button3 = new Button();
            button4 = new Button();
            button5 = new Button();
            button6 = new Button();
            tableLayoutPanel1.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.Font = new Font("Comic Sans MS", 14.25F, FontStyle.Bold, GraphicsUnit.Point);
            label1.ForeColor = Color.Blue;
            label1.Location = new Point(12, 9);
            label1.Name = "label1";
            label1.Size = new Size(380, 85);
            label1.TabIndex = 0;
            label1.Text = "Баба з воза — кобилі легше.";
            label1.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // button1
            // 
            button1.Location = new Point(12, 97);
            button1.Name = "button1";
            button1.Size = new Size(380, 52);
            button1.TabIndex = 1;
            button1.Text = "Історія №1";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // tableLayoutPanel1
            // 
            tableLayoutPanel1.ColumnCount = 2;
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.Controls.Add(button2, 0, 0);
            tableLayoutPanel1.Controls.Add(button3, 1, 0);
            tableLayoutPanel1.Controls.Add(button4, 0, 1);
            tableLayoutPanel1.Controls.Add(button5, 1, 1);
            tableLayoutPanel1.Location = new Point(12, 155);
            tableLayoutPanel1.Name = "tableLayoutPanel1";
            tableLayoutPanel1.RowCount = 2;
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.Size = new Size(380, 133);
            tableLayoutPanel1.TabIndex = 2;
            // 
            // button2
            // 
            button2.Font = new Font("Tahoma", 12F, FontStyle.Italic, GraphicsUnit.Point);
            button2.ForeColor = Color.IndianRed;
            button2.Location = new Point(3, 3);
            button2.Name = "button2";
            button2.Size = new Size(184, 60);
            button2.TabIndex = 0;
            button2.Text = "Історія №2";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button3
            // 
            button3.Font = new Font("Segoe Script", 18F, FontStyle.Regular, GraphicsUnit.Point);
            button3.Location = new Point(193, 3);
            button3.Name = "button3";
            button3.Size = new Size(184, 60);
            button3.TabIndex = 1;
            button3.Text = "Історія №3";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // button4
            // 
            button4.Font = new Font("Segoe UI", 11.25F, FontStyle.Regular, GraphicsUnit.Point);
            button4.ForeColor = Color.Lime;
            button4.Location = new Point(3, 69);
            button4.Name = "button4";
            button4.Size = new Size(184, 61);
            button4.TabIndex = 2;
            button4.Text = "Історія №4";
            button4.TextAlign = ContentAlignment.MiddleRight;
            button4.UseVisualStyleBackColor = true;
            button4.Click += button4_Click;
            // 
            // button5
            // 
            button5.Font = new Font("Courier New", 14.25F, FontStyle.Bold, GraphicsUnit.Point);
            button5.ForeColor = Color.DarkOrange;
            button5.Location = new Point(193, 69);
            button5.Name = "button5";
            button5.Size = new Size(184, 61);
            button5.TabIndex = 3;
            button5.Text = "Історія №5";
            button5.TextAlign = ContentAlignment.TopLeft;
            button5.UseVisualStyleBackColor = true;
            button5.Click += button5_Click;
            // 
            // button6
            // 
            button6.Location = new Point(12, 294);
            button6.Name = "button6";
            button6.Size = new Size(380, 47);
            button6.TabIndex = 3;
            button6.Text = "Завершити роботу програми";
            button6.UseVisualStyleBackColor = true;
            button6.Click += button6_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(404, 353);
            Controls.Add(button6);
            Controls.Add(tableLayoutPanel1);
            Controls.Add(button1);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Вас вітає студент групи ПІ-221Б Стецюк Михайло";
            tableLayoutPanel1.ResumeLayout(false);
            ResumeLayout(false);
        }

        #endregion

        private Label label1;
        private Button button1;
        private TableLayoutPanel tableLayoutPanel1;
        private Button button2;
        private Button button3;
        private Button button4;
        private Button button5;
        private Button button6;
    }
}