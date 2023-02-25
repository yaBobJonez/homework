using ClassLib;

class Program
{
    private static void program1()
    {
        LineSegment line = new LineSegment(0, 0, 0, 0);
        Console.WriteLine("Використання:\nвведіть координати точок відрізка через кому, наприклад: <1, 2, 3, 4>\nабо <exit> для виходу із програми.");
        string input;
        while ((input = Console.ReadLine()) != "exit")
        {
            string[] args = input.Split(",");
            if(args.Length != 4 || !args.All(x => int.TryParse(x, out _)))
            {
                Console.Error.WriteLine("Некоректний формат вводу!");
                continue;
            }
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) arr[i] = int.Parse(args[i]);
            if(arr[0] == arr[2] && arr[1] == arr[3])
            {
                Console.Error.WriteLine("Точка не є відрізком, кінці не можуть збігатись!");
                continue;
            }
            line.set(arr[0], arr[1], arr[2], arr[3]);
            Console.WriteLine(line.ToString());
            Console.WriteLine("Довжина відрізка: " + line.length());
            Console.WriteLine("Кут відносно OX: " + Math.Abs(90 - line.getAngleRelToOY()));
        }
    }

    private static void mirrorArray(LineSegment[] arr)
    {
        for (int i = 18; i > 9; i--) arr[i] = new LineSegment(arr[18 - i]);
    }
    
    private static void program2()
    {
        LineSegment[] lss = new LineSegment[19];
        int v = -1;
        var lambda = () => {
            v += 2; return (v + DateTime.UtcNow.Millisecond % 2, v + DateTime.UtcNow.Millisecond % 3);
        };
        for (int i = 0; i < 9; i++) lss[i] = new LineSegment(lambda(), lambda());
        mirrorArray(lss);
        lss[9] = new LineSegment();
        foreach(LineSegment ls in lss) Console.WriteLine(ls.ToString());
    }
    
    static void Main(string[] args)
    {
        Console.WriteLine("Вітаємо Вас,");
        string input = "";
        while (input != "3")
        {
            Console.Write("Виберіть програму для запуску:\n1. Програма 1\n2. Програма 2\n3. Вихід\n> ");
            input = Console.ReadLine();
            if(input == "1") program1();
            else if (input == "2") program2();
            else if (input == "3") break;
            else Console.Error.WriteLine("Будь ласка, виберіть число.");
        }
    }
}