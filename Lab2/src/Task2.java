import java.util.Scanner;

public class Task2 {
    public void Task2Method () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите время (от 0 до 24): ");
        int hours = scanner.nextInt();

        if (hours >= 0 && hours < 12) {
            System.out.println("Доброе утро!");
        } else if (hours >= 12 && hours < 18) {
            System.out.println("Добрый день!");
        } else if (hours >= 18 && hours < 24) {
            System.out.println("Добрый вечер!");
        } else {
            System.out.println("Некорректное время!");
        }
    }
}