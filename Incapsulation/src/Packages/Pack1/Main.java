package Packages.Pack1;

import java.util.Arrays;
import static yaBobJonez.Output.*;
import static yaBobJonez.Input.*;

public class Main {
    public static void main(String[] args) {
        print(">>> 1-я арифметическая прогрессия <<<");
        double n1 = inputDouble("Введите первый элемент:");
        double d = inputDouble("Введите разницу:");
        ArithmeticProgression arProgr = new ArithmeticProgression(n1, d);
        print("Сумма первых 5-и элементов: " + arProgr.getSum(5) + System.lineSeparator());

        print(">>> 2-я арифметическая прогрессия <<<");
        double an1 = inputDouble("Введите первый элемент:");
        double ad = inputDouble("Введите разницу (отрицательную):");
        ArithmeticProgression aArProgr = new ArithmeticProgression(an1, ad);
        int as = inputInt("Введите n (индекс) искомого элемента:");
        print(as + "-й элемент это " + aArProgr.getElement(as) + System.lineSeparator());

        print(">>> Вычисление по формуле <<<");
        double x = inputDouble("Введите x:");
        Expression expr = new Expression(x);
        print("Ответ: " + expr.eval() + System.lineSeparator());

        print(">>> Сортировка <<<");
        int[] bvalues = inputIntArray("Введите числа через пробелы:");
        Arrays.sort(bvalues);
        printA("После сортировки: ");
        for(int el : bvalues) printA(el + " ");
        printA(System.lineSeparator());
    }
}
