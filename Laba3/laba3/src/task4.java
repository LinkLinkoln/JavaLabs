import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        while(true)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            System.out.print("Если желаете продолжить, нажмите 1\n");
            int choice= scanner.nextInt();
            if(choice!=1)
            {
                System.exit(0);
            }
        }
    }

    private static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        int length = numberStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(length -1- i)) {
                return false;
            }
        }

        return true;
    }
}
