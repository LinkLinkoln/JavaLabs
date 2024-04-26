import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence=scanner.nextLine();

        sentence = sentence.trim();

        String[] words = sentence.split("\\s+");//пробелы
        int totalLength = 0;
        for (String word : words)
        {
            word = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
            totalLength += word.length();
        }

        int wordCount = words.length;

        double averageLength = (double) totalLength / wordCount;

        System.out.println("Средняя длина слова: " + averageLength);

    }
}
