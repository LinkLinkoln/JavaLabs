import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        String cleanStr1 = cleanString(str1);
        String cleanStr2 = cleanString(str2);

        char[] sortedStr1 = sortString(cleanStr1);
        char[] sortedStr2 = sortString(cleanStr2);

        boolean isAnagram = Arrays.equals(sortedStr1, sortedStr2);

        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Метод для удаления пробелов и пунктуации, приведения к нижнему регистру
    private static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
    }

    private static char[] sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return charArray;
}
}
