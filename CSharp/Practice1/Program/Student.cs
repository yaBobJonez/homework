namespace Program;

public enum Names
{
    Valentyn, Olexandr, Nazar, Maxym,
    Mykhailo, Victor, Rostyslav, Volodymyr,
    Camila, Julian, Illia, Taras, Matviy,
    Julia, Olexandra, Vyacheslav, Sviatoslav,
    Vladyslav, Alina, Dmytro, Vadym,
    Danylo, Anatoliy
}

public class Student
{
    private static Dictionary<int, int> MaxDays = new Dictionary<int, int>()
    {
        {1, 31}, {2, 28}, {3, 31}, {4, 30},
        {5, 31}, {6, 30}, {7, 31}, {8, 31},
        {9, 30}, {10, 31}, {11, 30}, {12, 31}
    };
    public Names Name;
    public int DayOfBirth;
    public int MonthOfBirth;
    public Student(Names name, int day, int month)
    {
        if (month < 1 || month > 12)
            throw new ArgumentException($"Місяця з номером {month} не існує, допустимий діапазон 1..12.");
        if (day < 1 || day > MaxDays[month])
            throw new ArgumentException($"У місяці немає {day} дня, допустимий діапазон 1..{MaxDays[month]}");
        Name = name;
        DayOfBirth = day;
        MonthOfBirth = month;
    }
}
