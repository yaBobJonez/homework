namespace Lab2_1;

class Program
{
    private static string usage = "Використання:\nnew - новий рядок\nshow - вивести рядок\nlen - вивести довжину\nrsh - зсунути праворуч\nexit - вийти";
    public static void Main(string[] args)
    {
        string input;
        Console.WriteLine(usage);
        LetterString str = new LetterString("");
        while (true)
        {
            input = Console.ReadLine();
            if (input == "exit") break;
            switch (input)
            {
                case "new":
                    try { str = new LetterString(Console.ReadLine()); }
                    catch(ArgumentException){ Console.Error.WriteLine("Рядок містить не лише літери!"); }
                    break;
                case "show": Console.WriteLine($"Значення: {str.Value}"); break;
                case "len": Console.WriteLine($"Довжина: {str.Length}"); break;
                case "rsh": str.Rsh(); break;
                default: Console.WriteLine(usage); break;
            }
        }
    }
}
