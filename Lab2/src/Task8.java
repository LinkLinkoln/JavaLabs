import java.util.Scanner;

public class Task8 {
    public void Task8Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты начала отрезка: ");
        int start = scanner.nextInt();

        System.out.print("Введите координаты конца отрезка: ");
        int end = scanner.nextInt();

        if (start < end) {
            System.out.println("Это подъем.");
        } else if (start > end) {
            System.out.println("Это спуск.");
        } else {
            System.out.println("Это ровная дорога.");
        }
    }
}