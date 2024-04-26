import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
        StringBuilder numbers = new StringBuilder();
        int count = 0;
        int num = 1;

        while (count < 1000) {
            String numStr = String.valueOf(num);
            numbers.append(numStr);
            count += numStr.length();
            num++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= numbers.length()) {
            char digit = numbers.charAt(n - 1);
            System.out.println("Цифра на позиции " + n + ": " + digit);
        } else {
            System.out.println("Позиция " + n + " выходит за пределы строки.");
        }
    }
}
