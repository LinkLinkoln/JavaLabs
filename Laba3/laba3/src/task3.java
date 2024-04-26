public class task3
{
    public static void main(String[] args) {
       final int startNumber = 10;
       final int endNumber = 1000000;

        System.out.println("Числа Армстронга в диапазоне от " + startNumber + " до " + endNumber + ":");

        for (int number = startNumber; number <= endNumber; number++)
        {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();

        int[] digits = Integer.toString(number).chars()
                .map(Character::getNumericValue)//функция преобразования
                .toArray();

        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }

        return sum == originalNumber;
    }
}
