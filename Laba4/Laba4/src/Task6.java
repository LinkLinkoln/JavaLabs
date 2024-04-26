import java.util.Random;
import java.util.Scanner;

public class Task6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size=scanner.nextInt();
        int[] array=new int[size];
        Random rnd=new Random();
        for(int i=0;i<array.length;i++)
        {
            array[i]= rnd.nextInt(-70,50);
        }
        OutputArray(array);
        int min=FindMinElement(array);
        System.out.println();
        System.out.printf("Минимальный элемент: %s",min);
        int max=FindMaxElement(array);
        System.out.println();
        System.out.printf("Максимальный элемент: %s",max);
    }

    static int FindMinElement(int[]array)
    {
        int min=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        return min;
    }
    static int FindMaxElement(int[]array)
    {
        int max=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        return max;
    }
    static void OutputArray(int[]array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

}
