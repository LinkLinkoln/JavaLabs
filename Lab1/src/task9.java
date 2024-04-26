public class task9 {
    public void task9Method () {
        double number1 = 3.14;
        double number2 = 2.5;
        double number3 = 5.0;
        double number4 = 10.0;

        boolean hasDecimalPart1 = (number1 % 1) != 0;
        boolean hasDecimalPart2 = (number2 % 1) != 0;
        boolean hasDecimalPart3 = (number3 % 1) != 0;
        boolean hasDecimalPart4 = (number4 % 1) != 0;

        System.out.println(number1 + " имеет вещественную часть? " + hasDecimalPart1);
        System.out.println(number2 + " имеет вещественную часть? " + hasDecimalPart2);
        System.out.println(number3 + " имеет вещественную часть? " + hasDecimalPart3);
        System.out.println(number4 + " имеет вещественную часть? " + hasDecimalPart4);
    }
}