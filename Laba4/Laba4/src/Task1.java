import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку текста: ");
        String text = scanner.nextLine();

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        int count = 0;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                count++;
                builder.append(i).append(", ");
            }
        }
        if (count > 0) {
            // Удаление последней запятой и пробела из индексов
            builder.delete(builder.length()-2, builder.length());
            System.out.println("Индексы: " + builder);
            System.out.println("Количество совпадений: " + count);
        } else {
            System.out.println("Совпадений не найдено.");
        }
    }
}
