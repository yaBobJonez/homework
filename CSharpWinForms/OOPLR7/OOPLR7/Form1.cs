using Microsoft.VisualBasic;

namespace OOPLR7
{
    public partial class Form1 : Form
    {
        double firstX = 7.654, firstY = 0.876, firstZ = 0.0987;
        double? secondX = null;
        double thirdX = 0.2, thirdDx = 0.7, thirdN = 6;
        public Form1()
        {
            InitializeComponent();
        }

        protected double InputParam(double def, string msg)
        {
            double res;
            while (!Double.TryParse(Interaction.InputBox(msg, "Введення", def.ToString()), out res)) ;
            return res;
        }
        protected double InputParam(string msg)
        {
            double res;
            while (!Double.TryParse(Interaction.InputBox(msg, "Введення"), out res)) ;
            return res;
        }

        private void OnQuitClick(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void OnExprEval(object sender, EventArgs e)
        {
            double x = firstX = InputParam(firstX, "Уведіть x:"),
                y = firstY = InputParam(firstY, "Уведіть y:"),
                z = firstZ = InputParam(firstZ, "Уведіть z:");
            double res = (x + 4 * y) / (x * y - z * (x - y));
            MessageBox.Show($"При x = {x}\n    y = {y}\n    z = {z}\nзначення виразу = {res}", "Результат");
        }

        private void OnCondExprEval(object sender, EventArgs e)
        {
            double x = InputParam("Уведіть аргумент x:"), res;
            if (x <= -3) res = Math.Sin(-Math.Pow(x, 2) + 1);
            else if (x > -3 && x < 0) res = -Math.Pow(Math.E, 1 / x);
            else res = 2 * x + Math.Pow(Math.Log(4.4), 2);
            MessageBox.Show($"При x = {x}\nзначення функції = {res}", "Результат");
        }

        private void OnTabularEval(object sender, EventArgs e)
        {
            TableDlg table = new TableDlg();
            double x = thirdX = InputParam(thirdX, "Введіть початкову точку:");
            double dx = thirdDx = InputParam(thirdDx, "Введіть крок:");
            double n = thirdN = InputParam(thirdN, "Введіть кількість точок:");
            for (int i = 0; i < n; i++, x += dx)
            {
                double y = Math.Pow(3 * x + 2, 2) / (Math.Sin(x) + 3);
                table.data.Rows.Add(x, y);
            }
            table.Show();
        }
    }
}