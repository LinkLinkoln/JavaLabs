public class task1
{
    public static void main(String[] args)
    {
        final int maxNumber = 10000000;
        int previousNumber = 0;
        int currentNumber = 1;

        System.out.println(previousNumber);

        while (currentNumber <= maxNumber)
        {
            System.out.println(currentNumber);

            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
        for (int i = 0; i <= maxNumber; i++)
        {

        }
    }
}
