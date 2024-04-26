import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.print("Введите целое положительное число: ");
            int number = scanner.nextInt();

            int reversedNumber = reverseNumber(number);

            System.out.println("Перевернутое число: " + reversedNumber);

            System.out.print("Если желаете продолжить, нажмите 1\n");
            int choice= scanner.nextInt();
            if(choice!=1)
            {
                System.exit(0);
            }
        }
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0)
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }
}
