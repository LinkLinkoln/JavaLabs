import java.util.Arrays;
import java.util.Scanner;

public class Task4
{
    public static void main(String[] args) {
        // Ввод строки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isDigit(ch)) {
                result.append('_');
            } else {
                result.append(ch);
            }
        }

        System.out.println("Результат: " + result.toString());
    }
}

