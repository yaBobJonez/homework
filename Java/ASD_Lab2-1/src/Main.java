import java.util.Scanner;

// Головний клас програми
public class Main {
    // f(x, y) = 3x - 2y + 5
    protected static double f(double x, double y) {
        return 3*x - 2*y + 5;
    }
    /*
     * Метод розвʼязання диференціальних рівнянь Рунге-Кутти 2-го порядку:
     * k1 = hf(xi, yi)
     * k2 = hf(xi + h/2, yi + k1/2)
     * yi+1 = y + k2
     * Джерело: https://math.libretexts.org/Workbench/Numerical_Methods_with_Applications_(Kaw)/8%3A_Ordinary_Differential_Equations/8.03%3A_Runge-Kutta_2nd-Order_Method_for_Solving_Ordinary_Differential_Equations
     */
    protected static void solveRK2(double x0, double y0, double xk, double h) {
        for (double x = x0, y = y0; x <= xk; x += h) {
            double k1 = h * f(x, y);
            double k2 = h * f(x + h/2, y + k1/2);
            System.out.printf("%9.2f | %9.2f\n", x, y);
            y = y + k2;
        }
    }

    // Точка входу програми
    public static void main(String[] args) {
        // Введення початкових умов, кінцевого значення аргументу та кроку
        double x0 = inputDouble("x0 = ");
        double y0 = inputDouble("y0 = ");
        double xk = inputDouble("xk = ");
        double h =  inputDouble("h  = ");
        // Розвʼязок диф. рівняння методом RK2
        System.out.printf("%9s | %9s\n", "x", "y(x)");
        solveRK2(x0, y0, xk, h);
        // Для перевірки через аналогічний RK4: https://planetcalc.com/8400/
    }
    // Допоміжна функція для введення дійсних чисел з клавіатури
    private static double inputDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print(prompt);
        } return sc.nextDouble();
    }
}
