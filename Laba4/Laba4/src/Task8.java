import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size=scanner.nextInt();
        System.out.print("Введите верхнюю границу массива: ");
        int board=scanner.nextInt();
        if(board>2)
        {
            int[] array=InputArray(size, board);
            System.out.print("Исходный массив: ");
            OutputArray(array);
            int[] array2=FixedArray(array);
            System.out.print("Исправленный массив: ");
            OutputArray(array2);

        }
        else
        {
            System.out.print("Верхняя граница массива не может быть меньше нижней: ");
        }
    }
    static int[] InputArray(int size,int board)
    {
        int[] array=new int[size];
        Random rnd=new Random();
        for(int i=0;i<array.length;i++)
        {
            array[i]= rnd.nextInt(-2,board);
        }
        return array;
    }
    static void OutputArray(int[]array)
    {
        for (int element:array) {
            System.out.print(element+" ");
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    static int[] FixedArray(int[]array)
    {
        int[] array2= Arrays.copyOf(array, array.length);
        for(int i=0;i<array2.length;i++)
        {
            if(array2[i]<-1)
            {
                array2[i] = (int) Math.pow( array2[i], 2);
            }
        }
        return array2;
    }

}
