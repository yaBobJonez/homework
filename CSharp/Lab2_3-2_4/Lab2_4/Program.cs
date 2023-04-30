namespace Lab2_4;

public class Program
{
    static string usage = "Використання:\nsp new <зміст> - новий рядок спеціальних символів\nsp show - показати рядок спец. символів\n" +
                          "sp len - довжина рядка спец. символів\nsp change <символ> - потроїти символ у рядку спец. символів\n" +
                          "cl new <зміст> - новий рядок великих літер\ncl show - показати рядок великих літер\ncl len - довжина рядка" +
                          "великих літер\ncl change <символ> - видалити всі трапляння символа з рядка великих літер\n?|help - це " +
                          "повідомлення\nexit - вийти";
    
    public static void Main(string[] args)
    {
        string input;
        IChangingString sp = new SpecialCharacters("");
        IChangingString cl = new CapitalLetters("");
        Console.WriteLine(usage);
        while(true)
        {
            if ((input = Console.ReadLine()) == "exit") break;
            string[] parsed = input.Split(" ");
            switch(parsed[0])
            {
                case "sp":
                    if(parsed.Length < 2){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                    switch (parsed[1])
                    {
                        case "new":
                            if(parsed.Length != 3){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            try{ sp = new SpecialCharacters(parsed[2]); }
                            catch(Exception e){ Console.Error.WriteLine(e.Message); continue; }
                            break;
                        case "show":
                            if(parsed.Length != 2){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            Console.WriteLine(sp);
                            break;
                        case "len":
                            if(parsed.Length != 2){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            Console.WriteLine(sp.Length);
                            break;
                        case "change":
                            if(parsed.Length != 3){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            try {
                                if(!char.TryParse(parsed[2], out char c) || char.IsLetterOrDigit(c))
                                    throw new ArgumentException("Символ не є спеціальним.");
                                sp.Change(c);
                            } catch(Exception e){ Console.Error.WriteLine(e.Message); continue; }
                            break;
                        default:
                            Console.Error.WriteLine("Некоректний формат вводу! ? - використання");
                            break;
                    } break;
                case "cl":
                    if(parsed.Length < 2){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                    switch (parsed[1])
                    {
                        case "new":
                            if(parsed.Length != 3){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            try{ cl = new CapitalLetters(parsed[2]); }
                            catch(Exception e){ Console.Error.WriteLine(e.Message); continue; }
                            break;
                        case "show":
                            if(parsed.Length != 2){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            Console.WriteLine(cl);
                            break;
                        case "len":
                            if(parsed.Length != 2){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            Console.WriteLine(cl.Length);
                            break;
                        case "change":
                            if(parsed.Length != 3){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                            try {
                                if(!char.TryParse(parsed[2], out char c) || !char.IsLetter(c) || !char.IsUpper(c))
                                    throw new ArgumentException("Символ не є великою літерою.");
                                cl.Change(c);
                            } catch(Exception e){ Console.Error.WriteLine(e.Message); continue; }
                            break;
                        default:
                            Console.Error.WriteLine("Некоректний формат вводу! ? - використання");
                            break;
                    } break;
                case "?" or "help":
                    Console.WriteLine(usage);
                    break;
                default:
                    Console.Error.WriteLine("Некоректний формат вводу! ? - використання");
                    break;
            }
        }
    }
}