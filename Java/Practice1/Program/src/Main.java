import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import linkedList.*;
import linkedList.LinkedList;

public class Main {
    private static String usage = "names - вивести список доступних імен\nadd <Name> <sex> <dormitory> - додати студента з ім'ям " +
            "за номером, статтю (f/m), гуртожитком (1/0)\nremove <n> - видалити n-ий елемент\nchange <n> <Name> <sex> <dormitory> - змінити " +
            "n-ий елемент\nlength - відобразити довжину списку\nshow - вивести у вигляді таблиці\nsort <param> - відсортувати список " +
            "за параметром:\n\t0 - ім'я\n\t1 - стать\n\t2 - гуртожиток\nfilter - знайти студентів жіночої статі, що проживають у " +
            "гуртожитку\nhelp - це повідомлення\nexit - вийти з програми";

    private static LinkedHashMap<String, Names> availNames = new LinkedHashMap<>(){{
        put("Валентин", Names.Valentyn); put("Олександр", Names.Olexandr); put("Назар", Names.Nazar); put("Максим", Names.Maxym);
        put("Михайло", Names.Mykhailo); put("Віктор", Names.Victor); put("Ростислав", Names.Rostyslav); put("Володимир", Names.Volodymyr);
        put("Каміла", Names.Camila); put("Юліан", Names.Julian); put("Ілля", Names.Illia); put("Тарас", Names.Taras); put("Матвій", Names.Matviy);
        put("Юлія", Names.Julia); put("Олександра", Names.Olexandra); put("В'ячеслав", Names.Vyacheslav); put("Святослав", Names.Sviatoslav);
        put("Владислав", Names.Vladyslav); put("Аліна", Names.Alina); put("Дмитро", Names.Dmytro); put("Вадим", Names.Vadym);
        put("Данило", Names.Danylo); put("Анатолій", Names.Anatoliy);
    }};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<>();
        System.out.println(usage);
        String input;
        while (!(input = sc.nextLine()).equals("exit")) {
            String[] split = input.split(" ");
            if (split.length == 0){ System.err.println("Некоректна команда."); continue; }
            Integer n, nameN, day, month; Character sex; Boolean dormitory;
            switch (split[0]) {
                case "names":
                    for (int i = 0; i < 23; i++) {
                        System.out.printf("%-17s", ""+i+". "+(String)availNames.keySet().toArray()[i]);
                        if ((i+1) % 4 == 0) System.out.println();
                    } System.out.println();
                    break;
                case "add":
                    if (split.length < 4){ System.err.println("Некоректна команда."); break; }
                    if ((nameN = tryParse(split[1])) == null){ System.err.println("Некоретний номер імені "+split[1]+"."); continue; }
                    if (nameN < 0 || nameN > 22){ System.err.println("Імені з номером "+nameN+" не існує."); continue; }
                    if (!split[2].equals("f") && !split[2].equals("m")){ System.err.println("Не знайдено статі "+split[2]+"."); break; }
                    if (!split[3].equals("1") && !split[3].equals("0")){ System.err.println("Некоректне значення гуртожитку "+split[3]+"."); break; }
                    try {
                        list.PushBack(new Student(
                            availNames.get((String)availNames.keySet().toArray()[nameN]),
                            split[2].equals("f")? 'f' : 'm',
                            split[3].equals("1")
                        ));
                    } catch(IllegalArgumentException e){ System.err.println(e.getMessage()); continue; }
                    break;
                case "remove":
                    if (split.length < 2){ System.err.println("Некоректна команда."); break; }
                    if ((n = tryParse(split[1])) == null){ System.err.println("Некоректне число-індекс "+split[1]+"."); continue; }
                    try { list.Remove(n); }
                    catch(IllegalArgumentException e){ System.err.println(e.getMessage()); continue; }
                    break;
                case "change":
                    if (split.length < 5){ System.err.println("Некоректна команда."); break; }
                    if ((n = tryParse(split[1])) == null){ System.err.println("Некоректне число-індекс "+split[1]+"."); continue; }
                    if ((nameN = tryParse(split[2])) == null){ System.err.println("Некоретний номер імені "+split[2]+"."); continue; }
                    if (nameN < 0 || nameN > 22){ System.err.println("Імені з номером "+nameN+" не існує."); continue; }
                    if (!split[3].equals("f") && !split[3].equals("m")){ System.err.println("Не знайдено статі "+split[3]+"."); break; }
                    if (!split[4].equals("1") && !split[4].equals("0")){ System.err.println("Некоректне значення гуртожитку "+split[4]+"."); break; }
                    try {
                        list.set(n, new Student(
                            availNames.get((String)availNames.keySet().toArray()[nameN]),
                            split[3].equals("f")? 'f' : 'm',
                            split[4].equals("1")
                        ));
                    } catch(IllegalArgumentException e){ System.err.println(e.getMessage()); continue; }
                    break;
                case "length":
                    System.out.println("Довжина списку: "+list.getLength()+".");
                    break;
                case "show":
                    int showLine = list.getLength()-1;
                    System.out.printf("%5s. %-17s %-5s %-10s%n", "Рядок", "Ім'я", "Стать", "Гуртожиток");
                    for (Student student : list)
                        System.out.printf("%5s. %-17s %-5s %-10s%n",
                            showLine--,
                            availNames.entrySet().stream()
                                .filter(x -> x.getValue() == student.name)
                                .map(Map.Entry::getKey)
                                .toArray()[0],
                            Character.toUpperCase(student.sex),
                            student.dormitory? "Так" : "Ні");
                    break;
                case "sort":
                    if (split.length < 2){ System.err.println("Некоректна команда."); break; }
                    Integer sortParam;
                    if ((sortParam = tryParse(split[1])) == null){ System.err.println("Некоректний параметр "+split[1]+"."); continue; }
                    if (sortParam != 0 && sortParam != 1 && sortParam != 2){ System.err.println("Параметру "+sortParam+" не існує."); continue; }
                    ListSorter<Student> sorter = (Student a, Student b) -> {
                        if(sortParam == 0){
                            String aN = (String)availNames.entrySet().stream().filter(x -> x.getValue() == a.name).map(Map.Entry::getKey).toArray()[0];
                            String bN = (String)availNames.entrySet().stream().filter(x -> x.getValue() == b.name).map(Map.Entry::getKey).toArray()[0];
                            return aN.compareTo(bN) > 0;
                        } else if(sortParam == 1) return a.sex > b.sex;
                        else return !a.dormitory && b.dormitory;
                    };
                    list.Sort(sorter);
                    break;
                case "filter":
                    System.out.println("Студенти жіночої статі, що проживають в гуртожитку:");
                    LinkedList<Student> filtered = list.Filter( (Student st) -> st.sex=='f' && st.dormitory );
                    int filterLine = list.getLength()-1;
                    System.out.printf("%5s. %-17s %-5s %-10s%n", "Рядок", "Ім'я", "Стать", "Гуртожиток");
                    for (Student student : filtered)
                        System.out.printf("%5s. %-17s %-5s %-10s%n",
                            filterLine--,
                            availNames.entrySet().stream()
                                .filter(x -> x.getValue() == student.name)
                                .map(Map.Entry::getKey)
                                .toArray()[0],
                            Character.toUpperCase(student.sex),
                            student.dormitory? "Так" : "Ні");
                    break;
                case "help":
                    System.out.println(usage);
                    break;
                case "cat":
                    try{ System.out.println(new String(Base64.getDecoder().decode(
                        Files.readString(Paths.get(Main.class.getResource("cache.txt").toURI()))
                    ))); } catch(Exception ignored){}
                    break;
                default:
                    System.err.println("Некоректна команда.");
                    break;
            }
        }
    }
    protected static Integer tryParse(String s){
        try{ return Integer.parseInt(s); }
        catch(Exception e){ return null; }
    }
}
