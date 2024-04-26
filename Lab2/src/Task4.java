import java.util.Scanner;

public class Task4 {
    public void Task4Method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату x: ");
        double x = scanner.nextDouble();
        System.out.println("Введите координату y: ");
        double y = scanner.nextDouble();

        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "I";
        } else if (x < 0 && y > 0) {
            quadrant = "II";
        } else if (x < 0 && y < 0) {
            quadrant = "III";
        } else if (x > 0 && y < 0) {
            quadrant = "IV";
        } else if (x == 0 && y == 0) {
            quadrant = "начало координат";
        } else {
            quadrant = "на оси координат";
        }

        System.out.println("Точка находится в " + quadrant + " четверти.");
    }
}