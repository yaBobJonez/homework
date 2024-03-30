package Program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DataGenerator {
    private static Random rng = new Random();
    private static char[] charset = "AZBCDEFGHIJKLMNOPQRSTUVWXY@+#$%&*".toCharArray();
    private static char[] separators = {'{', '}', '!'};

    public static void writeTests(int correct, int wrong) {
        try (BufferedWriter file = new BufferedWriter(new FileWriter("data.txt"))) {
            for (int i = 1; i <= correct; i++) {
                file.write(generateCorrect());
                if (i != correct) file.write(separators[rng.nextInt(separators.length)]);
            } file.write("\n");
            for (int i = 1; i <= wrong; i++) {
                file.write(generateWrong());
                if (i != correct) file.write(separators[rng.nextInt(separators.length)]);
            } file.write("\n");
        } catch (IOException e) {
            System.err.println("Помилка запису до файлу!");
        }
    }

    private static String generateCorrect() {
        StringBuilder sb = new StringBuilder("^");
        int lettersFirst = rng.nextInt(1, 8);
        for (int i = 0; i < lettersFirst; i++)
            sb.append( charset[rng.nextInt(0, charset.length-7)] );
        sb.append("^*^");
        int lettersSecond = rng.nextInt(1, 8);
        for (int i = 0; i < lettersSecond; i++)
            sb.append( charset[rng.nextInt(2, charset.length)] );
        sb.append("^");
        return sb.toString();
    }
    private static String generateWrong() {
        StringBuilder sb = new StringBuilder(chance(66)? "^" : "");
        int firstPart = rng.nextInt(0, 7);
        boolean leaveMiddle = chance(15);
        for (int i = 0; i < firstPart; i++)
            sb.append( charset[rng.nextInt(leaveMiddle? 26 : 0, charset.length)] );
        sb.append(chance(70)? "^" : "");
        sb.append(chance(80)? "*" : "");
        sb.append(leaveMiddle? "^" : "");
        int secondPart = rng.nextInt(0, 7);
        for (int i = 0; i < secondPart; i++)
            sb.append( charset[rng.nextInt(charset.length)] );
        sb.append(chance(66)? "^" : "");
        return sb.toString();
    }
    private static boolean chance(int p) {
        return rng.nextInt(100) < p;
    }
}
