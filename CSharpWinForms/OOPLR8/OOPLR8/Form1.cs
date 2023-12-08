using Microsoft.VisualBasic;

namespace OOPLR8
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void OnQuit(object sender, EventArgs e)
        {
            Close();
        }

        private void OnCountKK(object sender, EventArgs e)
        {
            string s = Interaction.InputBox("Введіть Ваш рядок:", "Введення");
            int c = 0; bool isSecondK = false;
            foreach (char ch in s)
            {
                if (ch == 'к' && isSecondK) { ++c; isSecondK = false; }
                else if (ch == 'к') isSecondK = true;
            }
            MessageBox.Show($"Рядок: {s}\nКількість \"кк\": {c}", "Результат", MessageBoxButtons.OK);
        }

        private void OnRmCommasEtReplace3wPlus(object sender, EventArgs e)
        {
            string orig = Interaction.InputBox("Введіть Ваш рядок:", "Введення");
            string res = "";
            foreach (char ch in orig)
                res += (ch == ',')? "" : (ch == '3')? "+" : ch;
            MessageBox.Show($"Початковий рядок: {orig}\nНовий рядок: {res}", "Результат", MessageBoxButtons.OK);
        }
    }
}