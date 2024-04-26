import java.util.Scanner;

public class Task7 {
    public void Task7Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();

        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
            System.out.println("YES");
        }
    }
}