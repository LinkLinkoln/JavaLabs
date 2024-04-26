import java.util.Scanner;

public class Task10 {
    public void Task10Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите шестизначное число: ");
        int number = scanner.nextInt();
        int sumFirstThreeDigits = 0;
        int sumLastThreeDigits = 0;

        int temp = number;
        for (int i = 0; i < 3; i++) {
            sumLastThreeDigits += temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < 3; i++) {
            sumFirstThreeDigits += temp % 10;
            temp /= 10;
        }

        if (sumFirstThreeDigits == sumLastThreeDigits) {
            System.out.println("Да, это счастливый билет.");
        } else {
            System.out.println("Нет, это не счастливый билет.");
        }
    }
}