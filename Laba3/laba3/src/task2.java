public class task2
{
    public static void main(String[] args)
    {
       final int startNumber = 2;
       final int endNumber = 1000000;

        System.out.println("Простые числа в диапазоне от " + startNumber + " до " + endNumber + ":");

        for (int number = startNumber; number <= endNumber; number++)
        {
            if (isPrime(number))
            {
                System.out.println(number);
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number < 2)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
