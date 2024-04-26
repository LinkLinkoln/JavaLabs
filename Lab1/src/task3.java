import java.util.Scanner;

public class task3 {
    public void task3Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вещественное число n: ");
        double n = scanner.nextDouble();

        int roundedNumber = (int) Math.round(n);

        System.out.println("Округленное число: " + roundedNumber);
    }
}