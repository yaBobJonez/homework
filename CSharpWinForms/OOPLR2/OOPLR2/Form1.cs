using Microsoft.VisualBasic;

namespace OOPLR2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            new PeriodicalPublication().Info();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int inIssue, inPeriod, inPages, inWPP; string inTitle, inAuthor;
            while (!int.TryParse(Interaction.InputBox("Введіть випуск", "Введення"), out inIssue)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть періодичність (у днях)", "Введення"), out inPeriod)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість сторінок", "Введення"), out inPages)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість слів на сторінку", "Введення"), out inWPP)) ;
            inTitle = Interaction.InputBox("Введіть назву", "Введення");
            inAuthor = Interaction.InputBox("Введіть автора", "Введення");
            new PeriodicalPublication(inIssue, inPeriod, inPages, inWPP, inTitle, inAuthor).Info();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Close();
        }
    }

    public class PeriodicalPublication
    {
        int Issue, PeriodInDays = 7, NumberOfPages, AvgWordsPerPage;
        string Title, Author = "Без автора";

        public PeriodicalPublication(int issue, int periodInDays, int numberOfPages, int avgWordsPerPage, string title, string author)
        {
            Issue = Math.Abs(issue);
            PeriodInDays = Math.Abs(periodInDays);
            AvgWordsPerPage = Math.Abs(avgWordsPerPage);
            NumberOfPages = Math.Abs(numberOfPages);
            Title = title;
            Author = author;
        }
        public PeriodicalPublication(int issue, int numberOfPages, string title)
        {
            Issue = Math.Abs(issue);
            NumberOfPages = Math.Abs(numberOfPages);
            Title = title;
        }
        public PeriodicalPublication()
        {
            Issue = 1;
            NumberOfPages = 25;
            Title = "Безіменне Видання";
        }

        public int RelativeTimeTillIssueNumber(int nextIssue)
        {
            return Math.Abs((nextIssue - Issue) * PeriodInDays);
        }
        public int WordCount()
        {
            return NumberOfPages * AvgWordsPerPage;
        }

        public void Info()
        {
            string info = $"{Author} {Title}. Випуск №{Issue}. {NumberOfPages} c.\nПеріодичність: ";
            info += PeriodInDays switch
            {
                1 => "щоденно",
                2 => "двощоденно",
                7 => "щотижнево",
                14 => "щодвотижнево",
                >= 28 and < 32 => "щомісячно",
                365 | 366 => "щорічно",
                _ => (
                    PeriodInDays % 10 == 1
                        ? $"кожен {PeriodInDays} день"
                        : PeriodInDays % 10 >= 2 && PeriodInDays % 10 < 5
                            ? $"кожні {PeriodInDays} дні"
                            : $"кожні {PeriodInDays} днів"
                )
            };
            info += $"\nПриблизно слів на кожній сторінці: {AvgWordsPerPage}";
            MessageBox.Show(info, Title);
        }
    }
}