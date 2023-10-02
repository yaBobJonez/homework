namespace OOPLR1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Розпочинаємо вивчення основ ООП");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label1.Text = "Текст було змінено.";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Як кіт наплакав", "Ще прислів'я", MessageBoxButtons.YesNo);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Інші GUI фреймворки, з якими я працював:\n• Java Swing\n• JavaFX\n• wxWidgets\n• Qt (QML)");
        }

        private void button5_Click(object sender, EventArgs e)
        {
            this.Text = "Новий заголовок вікна";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}