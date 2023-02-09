namespace Task1;

class Program
{
    private static double ReverseAngle(double angle)
    {
        return Math.Round(Math.Abs(90.0 - angle), 2);
    }
    public static void Main(string[] args)
    {
        Console.WriteLine("Використання програми:\nвведіть 4 цілих числа через кому, наприклад <-2, 1, 3, -3>,\nабо <exit> щоб вийти.");
        while (true)
        {
            Console.Write("> ");
            string[] input = Console.ReadLine().Split(", ");
            if (input.Length != 0 && input[0] == "exit") break;
            int[] nums;
            try {
                nums = Array.ConvertAll(input, el => int.Parse(el));
                if (nums.Length != 4) throw new Exception();
            } catch (Exception) { Console.Error.WriteLine("Будь ласка, введіть 4 числа через кому."); continue; }
            var obj = new LineSegment((nums[0], nums[1]), (nums[2], nums[3]));
            Console.WriteLine(obj.Begin + " -> " + obj.End);
            Console.WriteLine("Довжина: " + obj.GetLength());
            Console.WriteLine("Кут між OX: " + ReverseAngle(obj.GetAngleRelToOY()));
        }
    }
}