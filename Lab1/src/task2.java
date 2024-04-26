import java.util.Scanner;

public class task2 {
    public void task2Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число n: ");
        int n = scanner.nextInt();

        if (n <= 100 || n >= 999) {
            System.out.println("Введенное число не является трехзначным.");
            return;
        }

        int digit1 = n / 100;
        int digit2 = (n / 10) % 10;
        int digit3 = n % 10;

        int sum = digit1 + digit2 + digit3;

        System.out.println("Сумма цифр числа " + n + ": " + sum);
    }
}