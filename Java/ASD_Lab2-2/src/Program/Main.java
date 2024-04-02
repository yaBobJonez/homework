package Program;

import DataStructures.Events;
import DataStructures.FSM;
import DataStructures.States;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Основний клас програми
public class Main {
    // Точка входу програми
    public static void main(String[] args) {
        // Обробка аргументу `gen`, який генерує текстовий файл і завершує роботу програми
        if (args.length > 0 && args[0].equals("gen")) {
            DataGenerator.writeTests(10, 10);
            return;
        }

        // Створення скінченного автомата з таблицею переходів
        FSM machine = new FSM()
                .with(States.Q0, Events.BtoY,       States.F)
                .with(States.Q0, Events.Caret,      States.Q1)
                .with(States.Q0, Events.Asterisk,   States.F)
                .with(States.Q0, Events.A,          States.F)
                .with(States.Q0, Events.Z,          States.F)
                .with(States.Q0, Events.Digit,      States.F)
                .with(States.Q0, Events.Etc,        States.F)

                .with(States.Q1, Events.BtoY,       States.Q2)
                .with(States.Q1, Events.Caret,      States.F)
                .with(States.Q1, Events.Asterisk,   States.F)
                .with(States.Q1, Events.A,          States.Q2)
                .with(States.Q1, Events.Z,          States.Q2)
                .with(States.Q1, Events.Digit,      States.F)
                .with(States.Q1, Events.Etc,        States.F)

                .with(States.Q2, Events.BtoY,       States.Q2)
                .with(States.Q2, Events.Caret,      States.Q3)
                .with(States.Q2, Events.Asterisk,   States.F)
                .with(States.Q2, Events.A,          States.Q2)
                .with(States.Q2, Events.Z,          States.Q2)
                .with(States.Q2, Events.Digit,      States.F)
                .with(States.Q2, Events.Etc,        States.F)

                .with(States.Q3, Events.BtoY,       States.F)
                .with(States.Q3, Events.Caret,      States.F)
                .with(States.Q3, Events.Asterisk,   States.Q4)
                .with(States.Q3, Events.A,          States.F)
                .with(States.Q3, Events.Z,          States.F)
                .with(States.Q3, Events.Digit,      States.F)
                .with(States.Q3, Events.Etc,        States.F)

                .with(States.Q4, Events.BtoY,       States.F)
                .with(States.Q4, Events.Caret,      States.Q5)
                .with(States.Q4, Events.Asterisk,   States.F)
                .with(States.Q4, Events.A,          States.F)
                .with(States.Q4, Events.Z,          States.F)
                .with(States.Q4, Events.Digit,      States.F)
                .with(States.Q4, Events.Etc,        States.F)

                .with(States.Q5, Events.BtoY,       States.Q6)
                .with(States.Q5, Events.Caret,      States.F)
                .with(States.Q5, Events.Asterisk,   States.Q6)
                .with(States.Q5, Events.A,          States.F)
                .with(States.Q5, Events.Z,          States.F)
                .with(States.Q5, Events.Digit,      States.F)
                .with(States.Q5, Events.Etc,        States.Q6)

                .with(States.Q6, Events.BtoY,       States.Q6)
                .with(States.Q6, Events.Caret,      States.S)
                .with(States.Q6, Events.Asterisk,   States.Q6)
                .with(States.Q6, Events.A,          States.F)
                .with(States.Q6, Events.Z,          States.F)
                .with(States.Q6, Events.Digit,      States.F)
                .with(States.Q6, Events.Etc,        States.Q6);

        // Читання даних з файлу та їх поділ регулярним виразом на слова
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.printf("%20s | %s%n", "Слово", "Підходить");
                String[] words = line.split("[{}!]");
                // Для кожного слова робиться перевірка на правильність скінченним автоматом
                for (String word : words)
                    System.out.printf("%20s | %b%n", word, machine.match(word));
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Не вдалося прочитати файл!");
        }
    }
}
