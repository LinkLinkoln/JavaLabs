import java.util.Arrays;
import java.util.Comparator;

public class Task3
{
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void sortReverseAlphabetical(String[] arr) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER.reversed());
        //компаратор, который используется для сравнения строк без учета регистра при сортировке
    }

    public static void sortByWordCount(String[] arr) {
        Arrays.sort(arr, Comparator.comparingInt(s -> s.split(" ").length));
    }

    public static void main(String[] args) {
        String[] strings = {"hello world", "Java language", "openComputer", "programming"};

        System.out.println("Исходный массив:");
        printArray(strings);

        sortReverseAlphabetical(strings);
        System.out.println("Массив, отсортированный в обратном алфавитном порядке:");
        printArray(strings);

        sortByWordCount(strings);
        System.out.println("Массив, отсортированный по количеству слов в строке:");
        printArray(strings);
    }
}

