import java.util.Scanner;
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        scanner.close();

        int result = checkBrackets(input);

        switch (result) {
            case 0:
                System.out.println("Правильная строка");
                break;
            case 1:
                System.out.println("Ошибка: отсутствие (");
                break;
            case 2:
                System.out.println("Ошибка: отсутствие )");
                break;
            case 3:
                System.out.println("Ошибка: отсутствие [");
                break;
            case 4:
                System.out.println("Ошибка: отсутствие ]");
                break;
            case 5:
                System.out.println("Ошибка: неправильный порядок скобок");
                break;
            default:
                System.out.println("Непредвиденная ошибка");
                break;
        }
    }

    public static int checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[')
            {
                stack.push(c);
            }
            else if (c == ')')
            {
                if (stack.isEmpty())
                {
                    return 1; // Ошибка: отсутствие (
                }
                if (stack.peek() == '(')
                {
                    stack.pop();
                } else
                {
                    return 5; // Ошибка: неправильный порядок скобок
                }
            } else if (c == ']')
            {
                if (stack.isEmpty()) {
                    return 3; // Ошибка: отсутствие [
                }
                if (stack.peek() == '[')
                {
                    stack.pop();
                } else {
                    return 5; // Ошибка: неправильный порядок скобок
                }
            }
        }
        if (!stack.isEmpty()) {
            if (stack.contains('('))
            {
                return 2; // Ошибка: отсутствие )
            } else
            {
                return 4; // Ошибка: отсутствие ]
            }
        }

        return 0; // Правильная строка
    }
}