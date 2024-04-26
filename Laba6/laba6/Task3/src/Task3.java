public class Task3 {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2.5, 3.7);
        ComplexNumber z2 = new ComplexNumber(1.8, 2.1);

        // Сравнение чисел
        boolean isEqual = z1.equals(z2);
        System.out.println("Числа z1 и z2 равны: " + isEqual);

        // Сложение чисел
        ComplexNumber sum = z1.add(z2);
        System.out.println("Сумма чисел z1 и z2: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "j");

        // Вычитание чисел
        ComplexNumber difference = z1.subtract(z2);
        System.out.println("Разность чисел z1 и z2: " + difference.getRealPart() + " + " + difference.getImaginaryPart() + "j");

        // Умножение чисел
        ComplexNumber product = z1.multiply(z2);
        System.out.println("Произведение чисел z1 и z2: " + product.getRealPart() + " + " + product.getImaginaryPart() + "j");
    }
}
