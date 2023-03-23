namespace Lab1_4;

class Program
{
    private static string usage = File.ReadAllText("Usage.txt");
    public static void Main(String[] args)
    {
        Console.WriteLine(usage);
        CharArray ca = new CharArray(" ");
        string input; string line;
        while((line = Console.ReadLine()) != "exit")
        {
            string[] l = line.Split(" ");
            if (l[0] == "show") Console.WriteLine(ca);
            else if (l[0] == "new")
            {
                input = Console.ReadLine();
                if (input == "EOF") input = " ";
                else while ((line = Console.ReadLine()) != "EOF") input += "\n" + line;
                try { ca = new CharArray(input); }
                catch (ArgumentException e){ Console.Error.WriteLine("Матриця не квадратна! Спробуйте інші дані."); }
            }
            else if (l[0] == "vows") Console.WriteLine("Кількість голосних: " + ca.vowelCount);
            else if (l[0] == "diag")
            {
                if(l.Length == 2 && int.TryParse(l[1], out int n)) Console.WriteLine("Діагональ: " + ca[n]);
                else Console.Error.WriteLine("Некоректні дані, введіть число.");
            }
            else if (l[0] == "exit") break;
            else Console.WriteLine(usage);
        }
    }
}
