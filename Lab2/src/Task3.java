import java.util.Scanner;

public class Task3 {
    public void Task3Method() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное (1-кошка, 2-собака, ...): ");
        int animalNumber = scanner.nextInt();

        String sound;
        switch (animalNumber) {
            case 1:
                sound = "Мяу-мяу";
                break;
            case 2:
                sound = "Гав-гав";
                break;
            case 3:
                sound = "Хрю-хрю";
                break;
            case 4:
                sound = "Му-му";
                break;
            case 5:
                sound = "Кря-кря";
                break;
            // Добавьте остальные звуки для других животных
            default:
                sound = "Некорректный выбор";
                break;
        }

        System.out.println("Звук: " + sound);
    }
}