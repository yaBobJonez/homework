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
            j2DestructBtn = new Button();
            j2TimeBtn = new Button();
            button4 = new Button();
            j2WordsBtn = new Button();
            j2InfoBtn = new Button();
            button1 = new Button();
            j1TimeBtn = new Button();
            j1WordsBtn = new Button();
            j1InfoBtn = new Button();
            j1DestructBtn = new Button();
            button2 = new Button();
            button3 = new Button();
            j1incrBtn = new Button();
            equalsBtn = new Button();
            tableLayoutPanel1.SuspendLayout();
            SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            tableLayoutPanel1.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            tableLayoutPanel1.ColumnCount = 2;
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            tableLayoutPanel1.Controls.Add(j2DestructBtn, 1, 4);
            tableLayoutPanel1.Controls.Add(j2TimeBtn, 1, 1);
            tableLayoutPanel1.Controls.Add(button4, 0, 0);
            tableLayoutPanel1.Controls.Add(j2WordsBtn, 1, 2);
            tableLayoutPanel1.Controls.Add(j2InfoBtn, 1, 3);
            tableLayoutPanel1.Controls.Add(button1, 1, 0);
            tableLayoutPanel1.Controls.Add(j1TimeBtn, 0, 1);
            tableLayoutPanel1.Controls.Add(j1WordsBtn, 0, 2);
            tableLayoutPanel1.Controls.Add(j1InfoBtn, 0, 3);
            tableLayoutPanel1.Controls.Add(j1DestructBtn, 0, 4);
            tableLayoutPanel1.Controls.Add(button2, 0, 6);
            tableLayoutPanel1.Controls.Add(button3, 1, 6);
            tableLayoutPanel1.Controls.Add(j1incrBtn, 0, 5);
            tableLayoutPanel1.Controls.Add(equalsBtn, 1, 5);
            tableLayoutPanel1.Location = new Point(12, 12);
            tableLayoutPanel1.Name = "tableLayoutPanel1";
            tableLayoutPanel1.RowCount = 7;
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 14.2857141F));
            tableLayoutPanel1.Size = new Size(388, 527);
            tableLayoutPanel1.TabIndex = 0;
            // 
            // j2DestructBtn
            // 
            j2DestructBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j2DestructBtn.Enabled = false;
            j2DestructBtn.Location = new Point(197, 303);
            j2DestructBtn.Name = "j2DestructBtn";
            j2DestructBtn.Size = new Size(188, 69);
            j2DestructBtn.TabIndex = 13;
            j2DestructBtn.Text = "Знищити журнал 2";
            j2DestructBtn.UseVisualStyleBackColor = true;
            j2DestructBtn.Click += OnJ2Destruct;
            // 
            // j2TimeBtn
            // 
            j2TimeBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j2TimeBtn.Enabled = false;
            j2TimeBtn.Location = new Point(197, 78);
            j2TimeBtn.Name = "j2TimeBtn";
            j2TimeBtn.Size = new Size(188, 69);
            j2TimeBtn.TabIndex = 1;
            j2TimeBtn.Text = "Час до наст. випуску журналу 2";
            j2TimeBtn.UseVisualStyleBackColor = true;
            j2TimeBtn.Click += OnJ2Time;
            // 
            // button4
            // 
            button4.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button4.Location = new Point(3, 3);
            button4.Name = "button4";
            button4.Size = new Size(188, 69);
            button4.TabIndex = 3;
            button4.Text = "Створити дит. журнал 1";
            button4.UseVisualStyleBackColor = true;
            button4.Click += OnJ1Create;
            // 
            // j2WordsBtn
            // 
            j2WordsBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j2WordsBtn.Enabled = false;
            j2WordsBtn.Location = new Point(197, 153);
            j2WordsBtn.Name = "j2WordsBtn";
            j2WordsBtn.Size = new Size(188, 69);
            j2WordsBtn.TabIndex = 5;
            j2WordsBtn.Text = "Кількість слів журналу 2";
            j2WordsBtn.UseVisualStyleBackColor = true;
            j2WordsBtn.Click += OnJ2Words;
            // 
            // j2InfoBtn
            // 
            j2InfoBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j2InfoBtn.Enabled = false;
            j2InfoBtn.Location = new Point(197, 228);
            j2InfoBtn.Name = "j2InfoBtn";
            j2InfoBtn.Size = new Size(188, 69);
            j2InfoBtn.TabIndex = 10;
            j2InfoBtn.Text = "Інформація про журнал 2";
            j2InfoBtn.UseVisualStyleBackColor = true;
            j2InfoBtn.Click += OnJ2Info;
            // 
            // button1
            // 
            button1.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button1.Location = new Point(197, 3);
            button1.Name = "button1";
            button1.Size = new Size(188, 69);
            button1.TabIndex = 0;
            button1.Text = "Створити дит. журнал 2";
            button1.UseVisualStyleBackColor = true;
            button1.Click += OnJ2Create;
            // 
            // j1TimeBtn
            // 
            j1TimeBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j1TimeBtn.Enabled = false;
            j1TimeBtn.Location = new Point(3, 78);
            j1TimeBtn.Name = "j1TimeBtn";
            j1TimeBtn.Size = new Size(188, 69);
            j1TimeBtn.TabIndex = 4;
            j1TimeBtn.Text = "Час до наст. випуску журналу 1";
            j1TimeBtn.UseVisualStyleBackColor = true;
            j1TimeBtn.Click += OnJ1Time;
            // 
            // j1WordsBtn
            // 
            j1WordsBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j1WordsBtn.Enabled = false;
            j1WordsBtn.Location = new Point(3, 153);
            j1WordsBtn.Name = "j1WordsBtn";
            j1WordsBtn.Size = new Size(188, 69);
            j1WordsBtn.TabIndex = 9;
            j1WordsBtn.Text = "Кількість слів журналу 1";
            j1WordsBtn.UseVisualStyleBackColor = true;
            j1WordsBtn.Click += OnJ1Words;
            // 
            // j1InfoBtn
            // 
            j1InfoBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j1InfoBtn.Enabled = false;
            j1InfoBtn.Location = new Point(3, 228);
            j1InfoBtn.Name = "j1InfoBtn";
            j1InfoBtn.Size = new Size(188, 69);
            j1InfoBtn.TabIndex = 7;
            j1InfoBtn.Text = "Інформація про журнал 1";
            j1InfoBtn.UseVisualStyleBackColor = true;
            j1InfoBtn.Click += OnJ1Info;
            // 
            // j1DestructBtn
            // 
            j1DestructBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j1DestructBtn.Enabled = false;
            j1DestructBtn.Location = new Point(3, 303);
            j1DestructBtn.Name = "j1DestructBtn";
            j1DestructBtn.Size = new Size(188, 69);
            j1DestructBtn.TabIndex = 8;
            j1DestructBtn.Text = "Знищити журнал 1";
            j1DestructBtn.UseVisualStyleBackColor = true;
            j1DestructBtn.Click += OnJ1Destruct;
            // 
            // button2
            // 
            button2.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button2.Location = new Point(3, 453);
            button2.Name = "button2";
            button2.Size = new Size(188, 71);
            button2.TabIndex = 14;
            button2.Text = "Використання індексатора";
            button2.UseVisualStyleBackColor = true;
            button2.Click += OnPeriodRepresent;
            // 
            // button3
            // 
            button3.AccessibleDescription = "";
            button3.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            button3.Location = new Point(197, 453);
            button3.Name = "button3";
            button3.Size = new Size(188, 71);
            button3.TabIndex = 2;
            button3.Text = "Завершити роботу";
            button3.UseVisualStyleBackColor = true;
            button3.Click += OnQuit;
            // 
            // j1incrBtn
            // 
            j1incrBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            j1incrBtn.Enabled = false;
            j1incrBtn.Location = new Point(3, 378);
            j1incrBtn.Name = "j1incrBtn";
            j1incrBtn.Size = new Size(188, 69);
            j1incrBtn.TabIndex = 15;
            j1incrBtn.Text = "Інкрементувати журнал 1";
            j1incrBtn.UseVisualStyleBackColor = true;
            j1incrBtn.Click += OnJ1Incr;
            // 
            // equalsBtn
            // 
            equalsBtn.Anchor = AnchorStyles.Top | AnchorStyles.Bottom | AnchorStyles.Left | AnchorStyles.Right;
            equalsBtn.Enabled = false;
            equalsBtn.Location = new Point(197, 378);
            equalsBtn.Name = "equalsBtn";
            equalsBtn.Size = new Size(188, 69);
            equalsBtn.TabIndex = 16;
            equalsBtn.Text = "Порівняти журнали";
            equalsBtn.UseVisualStyleBackColor = true;
            equalsBtn.Click += OnCompareJ12;
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
        private Button j2TimeBtn;
        private Button button3;
        private Button button4;
        private Button j1TimeBtn;
        private Button j2WordsBtn;
        private Button j1InfoBtn;
        private Button j1DestructBtn;
        private Button j1WordsBtn;
        private Button j2InfoBtn;
        private Button j2DestructBtn;
        private Button button2;
        private Button j1incrBtn;
        private Button equalsBtn;
    }
}