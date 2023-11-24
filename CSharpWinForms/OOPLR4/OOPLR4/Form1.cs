using Microsoft.VisualBasic;
using OOPLR4;
using System.Drawing;
using System.Windows.Forms;

namespace OOPLR2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            new Form2().Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            new Newspaper();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int inIssue, inPeriod, inPages, inWPP; string inDate, inTitle, inHeadline, inAuthor;
            while (!int.TryParse(Interaction.InputBox("Введіть випуск", "Введення"), out inIssue)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть періодичність (у днях)", "Введення"), out inPeriod)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість сторінок", "Введення"), out inPages)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість слів на сторінку", "Введення"), out inWPP)) ;
            inDate = Interaction.InputBox("Введіть дату", "Введення");
            inTitle = Interaction.InputBox("Введіть назву", "Введення");
            inHeadline = Interaction.InputBox("Введіть заголовок", "Введення");
            inAuthor = Interaction.InputBox("Введіть автора", "Введення");
            new Newspaper(inIssue, inPeriod, inPages, inWPP, inDate, inTitle, inHeadline, inAuthor).Info();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Magazine mag = new Magazine();
            Newspaper news = new Newspaper();
            PeriodicalPublication pub;
            pub = mag;
            pub.Info();
            pub = news;
            pub.Info();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            new Magazine();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            int inIssue, inPeriod, inPages, inWPP, inImgs, inAds; string inTitle, inAuthor;
            while (!int.TryParse(Interaction.InputBox("Введіть випуск", "Введення"), out inIssue)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть періодичність (у днях)", "Введення"), out inPeriod)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість сторінок", "Введення"), out inPages)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість слів на сторінку", "Введення"), out inWPP)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість зображень", "Введення"), out inImgs)) ;
            while (!int.TryParse(Interaction.InputBox("Введіть кількість реклам", "Введення"), out inAds)) ;
            inTitle = Interaction.InputBox("Введіть назву", "Введення");
            inAuthor = Interaction.InputBox("Введіть автора", "Введення");
            new Magazine(inIssue, inPeriod, inPages, inWPP, inImgs, inAds, inTitle, inAuthor).Info();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            MessageBox.Show($"На даний момент існує {PeriodicalPublication.Count} періодичних видань.");
        }

        private void OnNewButtonCreate(object sender, EventArgs e)
        {
            Random rand = new Random();
            Button newBtn = new Button();
            newBtn.Parent = this;
            newBtn.Size = new Size(188, 82);
            newBtn.Location = new Point(
                rand.Next(this.Width - 82),
                rand.Next(this.Height - 188)
            );
            newBtn.Text = "Створити нову кнопку";
            newBtn.Click += new EventHandler(this.OnNewButtonCreate);
            newBtn.Visible = true;
            newBtn.BringToFront();
        }

        private void OnMoveLeftAllControls(object sender, EventArgs e)
        {
            foreach (Control control in this.Controls)
                control.Location = new Point(control.Location.X - 20, control.Location.Y);
        }

        private void button10_Click(object sender, EventArgs e)
        {
            Color[] colors = new Color[] { Color.Crimson, Color.LimeGreen, Color.Navy, Color.OrangeRed, Color.Wheat };
            Cursor[] cursors = new Cursor[] { Cursors.Arrow, Cursors.Hand, Cursors.WaitCursor, Cursors.VSplit, Cursors.Cross };
            Random rng = new Random();
            switch (rng.Next(3))
            {
                case 0:
                    foreach (Control c in this.Controls)
                        c.Location = new Point(c.Location.X, c.Location.Y + 5); break;
                case 1:
                    foreach (Control c in this.Controls)
                        c.BackColor = colors[rng.Next(colors.Length)]; break;
                case 2:
                    foreach (Control c in this.Controls)
                        c.Cursor = cursors[rng.Next(cursors.Length)]; break;
            }
        }

        private void button11_Click(object sender, EventArgs e)
        {
            PeriodicalPublication pub = new Magazine();
            Magazine mag = (Magazine)pub;
            string info = $"Часу до наступного випуску: {mag.RelativeTimeTillIssueNumber(2)}\n";
            info += $"Журнал містить приблизно {mag.WordCount()} слів.\n";
            info += $"Кількість зображень: {mag.NofImages}.";
            MessageBox.Show(info, "Журнал");
        }
    }

    public abstract class PeriodicalPublication
    {
        public static int Count = 0;
        public int Nomer;

        protected int Issue, PeriodInDays = 7, NumberOfPages, AvgWordsPerPage;
        protected string Title, Author = "Без автора";

        public PeriodicalPublication(int issue, int periodInDays, int numberOfPages, int avgWordsPerPage, string title, string author)
        {
            Issue = Math.Abs(issue);
            PeriodInDays = Math.Abs(periodInDays);
            AvgWordsPerPage = Math.Abs(avgWordsPerPage);
            NumberOfPages = Math.Abs(numberOfPages);
            Title = title;
            Author = author;
            Nomer = ++Count;
        }
        public PeriodicalPublication(int issue, int numberOfPages, string title)
        {
            Issue = Math.Abs(issue);
            NumberOfPages = Math.Abs(numberOfPages);
            Title = title;
            Nomer = ++Count;
            Info();
        }
        public PeriodicalPublication()
        {
            Issue = 1;
            NumberOfPages = 25;
            Title = "Безіменне Видання";
            Nomer = ++Count;
            Info();
        }

        ~PeriodicalPublication()
        {
            MessageBox.Show($"Знищується періодичне видання №{Nomer}.");
            --Count;
            Info();
        }

        public abstract int RelativeTimeTillIssueNumber(int nextIssue);
        public abstract int WordCount();

        public virtual void Info()
        {
            string info = $"№{Nomer}: {Author} {Title}. Випуск №{Issue}. {NumberOfPages} c.\nПеріодичність: ";
            info += PeriodToVerbal();
            info += $"\nПриблизно слів на кожній сторінці: {AvgWordsPerPage}";
            MessageBox.Show(info, Title);
        }

        protected string PeriodToVerbal() => PeriodInDays switch
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
    }

    public class Newspaper : PeriodicalPublication
    {
        string Headline, Date;

        public Newspaper(int issue, int periodInDays, int numberOfPages, int avgWordsPerPage, string date, string title, string headline, string author)
            : base(issue, periodInDays, numberOfPages, avgWordsPerPage, title, author)
        {
            Date = date;
            Headline = headline;
        }
        public Newspaper() : base()
        {
            Date = "01.01.1970";
            Title = "Безіменна Газета";
            Headline = "НЕМАЄ НОВИН";
        }

        public override int RelativeTimeTillIssueNumber(int nextIssue)
        {
            return Math.Abs((nextIssue - Issue) * PeriodInDays);
        }
        public override int WordCount()
        {
            return NumberOfPages * AvgWordsPerPage;
        }

        public override void Info()
        {
            string info = $"№{Nomer}: {Title} - {Headline}. Випуск №{Issue} ({Date}). {NumberOfPages} c.\nПеріодичність: ";
            info += PeriodToVerbal();
            info += $"\nПриблизно слів на кожній сторінці: {AvgWordsPerPage}";
            MessageBox.Show(info, Headline);
        }
    }

    public class Magazine : PeriodicalPublication
    {
        public int NofImages = 46, NofAds = 8;

        public Magazine(int issue, int periodInDays, int numberOfPages, int avgWordsPerPage, int nOfImages, int nOfAds, string title, string author)
            : base(issue, periodInDays, numberOfPages, avgWordsPerPage, title, author)
        {
            NofImages = nOfImages;
            NofAds = nOfAds;
        }
        public Magazine() : base()
        {
            Title = "Безіменний Журнал";
        }

        public override int RelativeTimeTillIssueNumber(int nextIssue)
        {
            return Math.Abs((nextIssue - Issue) * PeriodInDays);
        }
        public override int WordCount()
        {
            return NumberOfPages * AvgWordsPerPage;
        }

        public override void Info()
        {
            string info = $"№{Nomer}: {Title} : журнал. Випуск №{Issue}. {NumberOfPages} c.\nПеріодичність: ";
            info += PeriodToVerbal();
            info += $"\nПриблизно слів на кожній сторінці: {AvgWordsPerPage}";
            info += $"\nКількість зображень: {NofImages}\nКількість реклам: {NofAds}";
            MessageBox.Show(info, Title);
        }
    }
}