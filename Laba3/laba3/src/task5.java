public class task5 {
    public static void main(String[] args) {
        int count = 0;

        for (int number = 10000000; number <= 99999999; number++) {
            if (hasUniqueDigits(number) && number % 12345 == 0) {
                System.out.println(number);
                count++;
            }
        }

        System.out.println("Общее количество найденных чисел: " + count);
    }

    private static boolean hasUniqueDigits(int number) {
        boolean[] digits = new boolean[10];

            while (number > 0)
            {
                int digit = number % 10;

                if (digits[digit])
                {
                    return false;
                }

                digits[digit] = true;
                number /= 10;
            }

        while (number > 0)
        {
            int digit = number % 10;

            if (digits[digit])
            {
                return false;
            }

            digits[digit] = true;
            number /= 10;
        }

        return true;
    }
}
