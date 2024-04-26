import java.util.Scanner;

public class Task6 {
    public void Task6Method() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву: ");
        String input = scanner.nextLine().trim();

        if (input.length() == 1) {
            char letter = input.charAt(0);
            if (Character.isLetter(letter)) {
                if (Character.isDigit(letter)) {
                    System.out.println("Цифра");
                } else if (Character.isLowerCase(letter)) {
                    System.out.println("Латиница");
                } else if (Character.isUpperCase(letter)) {
                    System.out.println("Кириллица");
                }
            } else {
                System.out.println("Невозможно определить");
            }
        } else {
            System.out.println("Невозможно определить");
        }
    }
}