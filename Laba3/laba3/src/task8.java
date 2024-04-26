import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();

            int countDigits = countDigits(number);
            int sumDigits = sumDigits(number);

            System.out.println("Количество цифр: " + countDigits);
            System.out.println("Сумма цифр: " + sumDigits);

            System.out.print("Если желаете продолжить, нажмите 1\n");
            int choice= scanner.nextInt();
            if(choice!=1)
            {
                System.exit(0);
            }
        }
    }

    private static int countDigits(int number) {
        int count = 0;

        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    private static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
