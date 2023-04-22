namespace Lab2_3;

public class Program
{
    static void Graph(Circle c, double area, double perimeter)
    {
        Console.WriteLine("      *****      ");
        Console.WriteLine("  **         **  ");
        Console.WriteLine("*         {0,5:0.00} *", c.Radius);
        Console.WriteLine("*       O-------*");
        Console.WriteLine("*   {0,7:0.00}     *", area);
        Console.WriteLine("  **         **  ");
        Console.WriteLine("      *****      ");
        Console.WriteLine("Периметр: {0:N2}", perimeter);
    }

    static void Graph(Square s, double area, double perimeter)
    {
        Console.WriteLine("{0:0.0};{1:0.0}               {2:0.0};{3:0.0}", s.P2.x, s.P2.y, s.P3.x, s.P3.y);
        Console.WriteLine("       ┍━━━━━━━━━━━━┑");
        Console.WriteLine("       ┃            ┃");
        Console.WriteLine("       ┃  {0,7:0.00}   ┃", area);
        Console.WriteLine("       ┃            ┃");
        Console.WriteLine("       ┕━━━━━━━━━━━━┙");
        Console.WriteLine("{0:0.0};{1:0.0}               {2:0.0};{3:0.0}", s.P1.x, s.P1.y, s.P4.x, s.P4.y);
        Console.WriteLine("Периметр: {0:N2}", perimeter);
    }
    
    static void Graph(Shape sh){
        double area = sh.Area();
        double perimeter = sh.Perimeter();
        if(sh is Circle c) Graph(c, area, perimeter);
        else Graph(sh as Square, area, perimeter);
    }
    
    static string usage = "Використання:\nc <r> - круг з радіусом r\ns <x1>,<y1> <x2>,<y2> <x3>,<y3> <x4>,<y4> - квадрат за "
        + "заданими точками\nexit - вийти";
    
    public static void Main(string[] args)
    {
        string input;
        Shape sh;
        Console.WriteLine(usage);
        while(true)
        {
            if ((input = Console.ReadLine()) == "exit") break;
            string[] parsed = input.Split(" ");
            switch(parsed[0])
            {
                case "c":
                    if(parsed.Length != 2 || !double.TryParse(parsed[1], out double n1))
                        { Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                    try {
                        sh = new Circle(n1);
                        Graph(sh);
                    } catch(Exception){ Console.Error.WriteLine("Коло не може бути точкою!"); }
                    break;
                case "s":
                    if(parsed.Length != 5){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                    try {
                        var getArg = (string pair) => {
                            string[] parsedArg = pair.Split(",");
                            if(parsedArg.Length != 2 || !double.TryParse(parsedArg[0], out double n1) || !double.TryParse(parsedArg[1], out double n2))
                                throw new ArgumentException("Недопустимі аргументи!");
                            return (n1, n2);
                        };
                        sh = new Square(getArg(parsed[1]), getArg(parsed[2]), getArg(parsed[3]), getArg(parsed[4]));
                        Graph(sh);
                    } catch(Exception e){ Console.Error.WriteLine(e.Message); }
                    break;
                default:
                    Console.WriteLine(usage);
                    break;
            }
        }
    }
}