import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size=scanner.nextInt();
        int[][] array=InputArray(size);
        OutputArray(array);
        int min = FindMinElement(array);
        int max = FindMaxElement(array);

        System.out.println("Наименьший элемент: " + min);
        System.out.println("Наибольший элемент: " + max);

        FindIndicesOfMinMaxElements(array, min, max);
    }
    static int[][] InputArray(int size)
    {
        if(size < 0){
            Scanner scanner = new Scanner(System.in);
            return InputArray(scanner.nextInt());
        }
        int[][] array=new int[size][size];
        Random rnd=new Random();
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++) {
                array[i][j] = rnd.nextInt(0, 10);
            }
        }
        return array;
    }
    static int FindMinElement( int[][] array){
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }
    private static int FindMaxElement(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        return max;
    }
    static void OutputArray(int[][]array)
    {
        for(int i=0;i<array.length;i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void FindIndicesOfMinMaxElements(int[][] array, int min, int max) {
        System.out.println("Индексы строк и столбцов для минимального элемента (" + min + "):");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == min) {
                    System.out.println("Строка: " + (i+1) + ", Столбец: " +(j+1));
                }
            }
        }

        System.out.println("Индексы строк и столбцов для максимального элемента (" + max + "):");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    System.out.println("Строка: " + (i+1) + ", Столбец: " + (j+1));
                }
            }
        }
    }
}
