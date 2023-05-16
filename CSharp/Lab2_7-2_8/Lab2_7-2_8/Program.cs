namespace Lab2_7_2_8;

public class Program
{
    static string usage = "Використання:\nвводьте триплети чисел, значень a, b, c; завершуючи <EOF>\nexit - вийти";
    
    public static void Main(string[] args)
    {
        List<double[]> list = new List<double[]>();
        string input;
        Console.WriteLine(usage);
        while (true) {
            list.Clear();
            while (true) {
                input = Console.ReadLine();
                if(input == "exit") return;
                if(input == "EOF") break;
                var parsed = input.Split(" ");
                if(parsed.Length != 3 || !double.TryParse(parsed[0], out double n0) || !double.TryParse(parsed[1],
                    out double n1) || !double.TryParse(parsed[2], out double n2))
                { Console.Error.WriteLine("Недопустимі аргументи!"); break; }
                double[] data = { n0, n1, n2 };
                list.Add(data);
            }
            foreach(var el in list){
                try {
                    Console.WriteLine( new Expression(el[0], el[1], el[2]).Eval() );
                } catch(Exception e) when (e is LnNotGreaterThanZeroException or DivideByZeroException) {
                    Console.Error.WriteLine(e.Message);
                }
            }
        }
    }
}