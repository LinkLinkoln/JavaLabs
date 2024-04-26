import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size=scanner.nextInt();
        int[] array= InputArray(size, scanner);
        boolean allEqual = checkAllEqual(array);

        if (allEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    public static int[] InputArray(int size, Scanner scanner)
    {
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Введите "+(i+1)+" элемент массива: ");
            array[i]=scanner.nextInt();
        }
        return array;
    }
    private static boolean checkAllEqual(int[] array) {

        boolean a = false;
        if (array.length == 0) {
            a = true;
        }

        if (array.length > 0){
            int firstElement = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] != firstElement) {
                    a = false;
                }
            }
        }

        return a;
    }

}
