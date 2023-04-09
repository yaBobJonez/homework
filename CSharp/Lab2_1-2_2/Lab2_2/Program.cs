namespace Lab2_2;

class Program
{
    static void Graph(Circle c)
    {
        Console.WriteLine("      *****      ");
        Console.WriteLine("  **         **  ");
        Console.WriteLine("*         {0:N2}  *", Math.Round(c.Radius,2));
        Console.WriteLine("*       O-------*");
        Console.WriteLine("*  ({0:N2};{1:N2})  *", Math.Round(c.GetX(),2), Math.Round(c.GetY(),2));
        Console.WriteLine("  **         **  ");
        Console.WriteLine("      *****      ");
        Console.WriteLine($"Площа: {Math.Round(c.Area,2)}");
    }
    static void Graph(Ellipse e)
    {
        double l1 = e.IsVertical ? Math.Round(e.MajorAxis, 2) : Math.Round(e.Radius, 2);
        double l2 = e.IsVertical ? Math.Round(e.Radius,2) : Math.Round(e.MajorAxis,2);
        Console.WriteLine("                   *******                   ");
        Console.WriteLine("           *****      |      *****           ");
        Console.WriteLine("      ***             | {0:N2}        **       ", l1);
        Console.WriteLine("  **          {0:N2}    |        {1:N2}      **  ", e.GetDistanceToFoci(), l2);
        Console.WriteLine("*        o------------O============o========*");
        Console.WriteLine("  **({0:N2};{1:N2})  ({2:N2};{3:N2})  ({4:N2};{5:N2})**  ", Math.Round(e.Focus2.x,2), Math.Round(e.Focus2.y,2),
            Math.Round(e.GetX(),2), Math.Round(e.GetY(),2), Math.Round(e.Focus1.x,2), Math.Round(e.Focus1.y,2));
        Console.WriteLine("      ***                           ***      ");
        Console.WriteLine("           *****             *****           ");
        Console.WriteLine("                   *******                   ");
        Console.WriteLine($"Площа: {Math.Round(e.Area,2)}");
        Console.WriteLine($"Ексцентриситет: {Math.Round(e.Eccentricity,2)}");
    }

    private static string usage = "Використання:\nc <x> <y> <r> - круг з центром у (x;y) і радіусом r\ne <x> <y> <b> <a> - еліпс з центром у (x;y) "
            + "довжиною малої піввісі b, великої піввісі a\nexit - вийти";

    public static void Main(string[] args)
    {
        string input;
        Circle c;
        Ellipse e;
        Console.WriteLine(usage);
        while (true)
        {
            if ((input = Console.ReadLine()) == "exit") break;
            string[] parsed = input.Split(" ");
            double n1, n2, n3, n4;
            switch (parsed[0])
            {
                case "c":
                    if(parsed.Length != 4 || !double.TryParse(parsed[1], out n1) || !double.TryParse(parsed[2], out n2)
                       || !double.TryParse(parsed[3], out n3)){ Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                    try {
                        c = new Circle(n1, n2, n3);
                        Graph(c);
                    } catch (Exception) { Console.Error.WriteLine("Коло не може бути точкою!"); }
                    break;
                case "e":
                    if(parsed.Length != 5 || !double.TryParse(parsed[1], out n1) || !double.TryParse(parsed[2], out n2)
                            || !double.TryParse(parsed[3], out n3) || !double.TryParse(parsed[4], out n4))
                        { Console.Error.WriteLine("Некоректний формат вводу!"); continue; }
                    try {
                        e = new Ellipse(n1, n2, n3, n4);
                        Graph(e);
                    } catch (Exception) { Console.Error.WriteLine("Еліпс не може бути відрізком!"); }
                    break;
                default: Console.WriteLine(usage); break;
            }
        }
    }
}
