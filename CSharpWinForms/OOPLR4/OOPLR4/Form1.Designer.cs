namespace OOPLR2
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
            tableLayoutPanel1 = new TableLayoutPanel();
            button1 = new Button();
            button2 = new Button();
            button4 = new Button();
            button5 = new Button();
            button3 = new Button();
            button6 = new Button();
            button8 = new Button();
            button9 = new Button();
            button7 = new Button();
            button10 = new Button();
            button11 = new Button();
            tableLayoutPanel1.SuspendLayout();
            SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            tableLayoutPanel1.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            tableLayoutPanel1.ColumnCount = 2;
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.Controls.Add(button1, 0, 1);
            tableLayoutPanel1.Controls.Add(button2, 1, 1);
            tableLayoutPanel1.Controls.Add(button4, 0, 0);
            tableLayoutPanel1.Controls.Add(button5, 0, 2);
            tableLayoutPanel1.Controls.Add(button3, 0, 5);
            tableLayoutPanel1.Controls.Add(button6, 1, 2);
            tableLayoutPanel1.Controls.Add(button8, 0, 4);
            tableLayoutPanel1.Controls.Add(button9, 1, 4);
            tableLayoutPanel1.Controls.Add(button7, 1, 0);
            tableLayoutPanel1.Controls.Add(button10, 0, 3);
            tableLayoutPanel1.Controls.Add(button11, 1, 3);
            tableLayoutPanel1.Location = new Point(12, 12);
            tableLayoutPanel1.Name = "tableLayoutPanel1";
            tableLayoutPanel1.RowCount = 6;
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 16.666666F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 16.666666F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 16.666666F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 16.666666F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 16.666666F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 16.666666F));
            tableLayoutPanel1.Size = new Size(388, 527);
            tableLayoutPanel1.TabIndex = 0;
            // 
            // button1
            // 
            button1.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button1.Location = new Point(3, 90);
            button1.Name = "button1";
            button1.Size = new Size(188, 81);
            button1.TabIndex = 0;
            button1.Text = "Газета за замовчуванням";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button2.Location = new Point(197, 90);
            button2.Name = "button2";
            button2.Size = new Size(188, 81);
            button2.TabIndex = 1;
            button2.Text = "Газета з параметрами";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // button4
            // 
            button4.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button4.Location = new Point(3, 3);
            button4.Name = "button4";
            button4.Size = new Size(188, 81);
            button4.TabIndex = 3;
            button4.Text = "Використання абстрактного класу";
            button4.UseVisualStyleBackColor = true;
            button4.Click += button4_Click;
            // 
            // button5
            // 
            button5.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button5.Location = new Point(3, 177);
            button5.Name = "button5";
            button5.Size = new Size(188, 81);
            button5.TabIndex = 4;
            button5.Text = "Журнал за замовчуванням";
            button5.UseVisualStyleBackColor = true;
            button5.Click += button5_Click;
            // 
            // button3
            // 
            button3.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            tableLayoutPanel1.SetColumnSpan(button3, 2);
            button3.Location = new Point(3, 438);
            button3.Name = "button3";
            button3.Size = new Size(382, 86);
            button3.TabIndex = 2;
            button3.Text = "Завершити роботу";
            button3.UseVisualStyleBackColor = true;
            button3.Click += button3_Click;
            // 
            // button6
            // 
            button6.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button6.Location = new Point(197, 177);
            button6.Name = "button6";
            button6.Size = new Size(188, 81);
            button6.TabIndex = 5;
            button6.Text = "Журнал з параметрами";
            button6.UseVisualStyleBackColor = true;
            button6.Click += button6_Click;
            // 
            // button8
            // 
            button8.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button8.Location = new Point(3, 351);
            button8.Name = "button8";
            button8.Size = new Size(188, 81);
            button8.TabIndex = 7;
            button8.Text = "Створити нову кнопку";
            button8.UseVisualStyleBackColor = true;
            button8.Click += OnNewButtonCreate;
            // 
            // button9
            // 
            button9.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button9.Location = new Point(197, 351);
            button9.Name = "button9";
            button9.Size = new Size(188, 81);
            button9.TabIndex = 8;
            button9.Text = "Змістити все ліворуч";
            button9.UseVisualStyleBackColor = true;
            button9.Click += OnMoveLeftAllControls;
            // 
            // button7
            // 
            button7.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button7.Location = new Point(197, 3);
            button7.Name = "button7";
            button7.Size = new Size(188, 81);
            button7.TabIndex = 6;
            button7.Text = "Поточна кількість об'єктів";
            button7.UseVisualStyleBackColor = true;
            button7.Click += button7_Click;
            // 
            // button10
            // 
            button10.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button10.Location = new Point(3, 264);
            button10.Name = "button10";
            button10.Size = new Size(188, 81);
            button10.TabIndex = 9;
            button10.Text = "Випадкові дії над усім";
            button10.UseVisualStyleBackColor = true;
            button10.Click += button10_Click;
            // 
            // button11
            // 
            button11.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button11.Location = new Point(197, 264);
            button11.Name = "button11";
            button11.Size = new Size(188, 81);
            button11.TabIndex = 10;
            button11.Text = "Приведення типів";
            button11.UseVisualStyleBackColor = true;
            button11.Click += button11_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(412, 551);
            Controls.Add(tableLayoutPanel1);
            Name = "Form1";
            Text = "Періодичне видання";
            tableLayoutPanel1.ResumeLayout(false);
            ResumeLayout(false);
        }

        #endregion

        private TableLayoutPanel tableLayoutPanel1;
        private Button button1;
        private Button button2;
        private Button button3;
        private Button button4;
        private Button button5;
        private Button button6;
        private Button button7;
        private Button button8;
        private Button button9;
        private Button button10;
        private Button button11;
    }
}