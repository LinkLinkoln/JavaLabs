import java.util.Scanner;
public class task1 {
    public void task1Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        int x = scanner.nextInt();

        System.out.print("Введите значение y: ");
        int y = scanner.nextInt();

        int divisionResult = x / y;
        int remainder = x % y;
        double squareRoot = Math.sqrt(x);

        System.out.println("Результат целочисленного деления x на y: " + divisionResult);
        System.out.println("Остаток от деления x на y: " + remainder);
        System.out.println("Квадратный корень x: " + squareRoot);
    }
}