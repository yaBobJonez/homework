namespace Program;

using libDoubleLinkedList;

public class Program
{
    private static string usage = "names - вивести список доступних імен\nadd <Name> <day>.<month> - додати студента з ім'ям " +
        "за номером, днем.місяцем народження\nremove <n> - видалити n-ий елемент\nchange <n> <Name> <day>.<month> - змінити " +
        "n-ий елемент\nlength - відобразити довжину списку\nshow - вивести у вигляді таблиці\nsort <param> - відсортувати список " +
        "за параметром:\n\t0 - день народження\n\t1 - місяць\nfilter - знайти студентів, що народилися восени\nhelp - це " +
        "повідомлення\nexit - вийти з програми";

    private static Dictionary<string, Names> availNames = new Dictionary<string, Names>(){
        {"Валентин", Names.Valentyn}, {"Олександр", Names.Olexandr}, {"Назар", Names.Nazar}, {"Максим", Names.Maxym},
        {"Михайло", Names.Mykhailo}, {"Віктор", Names.Victor}, {"Ростислав", Names.Rostyslav}, {"Володимир", Names.Volodymyr},
        {"Каміла", Names.Camila}, {"Юліан", Names.Julian}, {"Ілля", Names.Illia}, {"Тарас", Names.Taras}, {"Матвій", Names.Matviy},
        {"Юлія", Names.Julia}, {"Олександра", Names.Olexandra}, {"В'ячеслав", Names.Vyacheslav}, {"Святослав", Names.Sviatoslav},
        {"Владислав", Names.Vladyslav}, {"Аліна", Names.Alina}, {"Дмитро", Names.Dmytro}, {"Вадим", Names.Vadym},
        {"Данило", Names.Danylo}, {"Анатолій", Names.Anatoliy}
    };

    public static void Main(string[] args)
    {
        LinkedList<Student> list = new LinkedList<Student>();
        Console.WriteLine(usage);
        string input;
        while ((input = Console.ReadLine()) != "exit")
        {
            string[] split = input.Split(" ");
            if (split.Length == 0){ Console.Error.WriteLine("Некоректна команда."); continue; }
            int n, nameN, day, month; string[] date;
            switch (split[0])
            {
                case "names":
                    for (int i = 1; i <= 23; i++)
                    {
                        Console.Write($"{i+". "+availNames.ElementAt(i-1).Key , -17}");
                        if (i % 4 == 0) Console.WriteLine();
                    }
                    Console.WriteLine();
                    break;
                case "add":
                    if (split.Length < 3){ Console.Error.WriteLine("Некоректна команда."); break; }
                    if (!int.TryParse(split[1], out nameN)){ Console.Error.WriteLine($"Некоретний номер імені {split[1]}."); continue; }
                    if (nameN < 1 || nameN > 23){ Console.Error.WriteLine($"Імені з номером {nameN} не існує."); continue; }
                    date = split[2].Split(".");
                    if (date.Length != 2){ Console.Error.WriteLine($"Некоректна формат дати {split[2]}."); break; }
                    if (!int.TryParse(date[0], out day)){ Console.Error.WriteLine($"Некоретний день {date[0]}."); continue; }
                    if (!int.TryParse(date[1], out month)){ Console.Error.WriteLine($"Некоретний місяць {date[1]}."); continue; }
                    try { list.PushBack(new Student(availNames.ElementAt(nameN).Value, day, month)); }
                    catch(ArgumentException e){ Console.Error.WriteLine(e.Message); continue; }
                    break;
                case "remove":
                    if (split.Length < 2){ Console.Error.WriteLine("Некоректна команда."); break; }
                    if (!int.TryParse(split[1], out n)){ Console.Error.WriteLine($"Некоректне число-індекс {split[1]}."); continue; }
                    try { list.Remove(n); }
                    catch(ArgumentException e){ Console.Error.WriteLine(e.Message); continue; }
                    break;
                case "change":
                    if (split.Length < 4){ Console.Error.WriteLine("Некоректна команда."); break; }
                    if (!int.TryParse(split[1], out n)){ Console.Error.WriteLine($"Некоректне число-індекс {split[1]}."); continue; }
                    if (!int.TryParse(split[2], out nameN)){ Console.Error.WriteLine($"Некоретний номер імені {split[2]}."); continue; }
                    if (nameN < 1 || nameN > 23){ Console.Error.WriteLine($"Імені з номером {nameN} не існує."); continue; }
                    date = split[3].Split(".");
                    if (date.Length != 2){ Console.Error.WriteLine($"Некоректна формат дати {split[3]}."); break; }
                    if (!int.TryParse(date[0], out day)){ Console.Error.WriteLine($"Некоретний день {date[0]}."); continue; }
                    if (!int.TryParse(date[1], out month)){ Console.Error.WriteLine($"Некоретний місяць {date[1]}."); continue; }
                    try { list[n] = new Student(availNames.ElementAt(nameN).Value, day, month); }
                    catch(ArgumentException e){ Console.Error.WriteLine(e.Message); continue; }
                    break;
                case "length":
                    Console.WriteLine($"Довжина списку: {list.Length}");
                    break;
                case "show":
                    int showLine = list.Length-1;
                    Console.WriteLine("{0,5}. {1,-17} {2}", "Рядок", "Ім'я", "Дата народження");
                    foreach (var student in list)
                        Console.WriteLine("{0,5}. {1,-17} {2,2}.{3,-2}",
                            showLine--,
                            availNames.First(x => x.Value==student.Name).Key,
                            student.DayOfBirth,
                            student.MonthOfBirth);
                    break;
                case "sort":
                    if (split.Length < 2){ Console.Error.WriteLine("Некоректна команда."); break; }
                    if (!int.TryParse(split[1], out int sortParam)){ Console.Error.WriteLine($"Некоректний параметр {split[1]}."); continue; }
                    if (sortParam != 0 && sortParam != 1){ Console.Error.WriteLine($"Параметру {sortParam} не існує."); continue; }
                    var sorter = (Student a, Student b) => sortParam==0
                        ? a.DayOfBirth > b.DayOfBirth
                        : a.MonthOfBirth > b.MonthOfBirth;
                    list.Sort(sorter);
                    break;
                case "filter":
                    Console.WriteLine("Студенти, що народились восени:");
                    LinkedList<Student> filtered = list.Filter( (Student st) => 9 <= st.MonthOfBirth && st.MonthOfBirth <= 11 );
                    int filterLine = list.Length-1;
                    Console.WriteLine("{0,5}. {1,-17} {2}", "Рядок", "Ім'я", "Дата народження");
                    foreach (var student in filtered)
                        Console.WriteLine("{0,5}. {1,-17} {2,2}.{3,-2}",
                            filterLine--,
                            availNames.First(x => x.Value==student.Name).Key,
                            student.DayOfBirth,
                            student.MonthOfBirth);
                    break;
                case "help":
                    Console.WriteLine(usage);
                    break;
                default:
                    Console.Error.WriteLine("Некоректна команда.");
                    break;
            }
        }
    }
}
