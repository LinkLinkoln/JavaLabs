public class task10 {
    public void task10Method() {
        final int height = 170;
        final int weight = 70;

        int idealWeight = height - 110;

        int weightDifference = idealWeight - weight;

        if (weightDifference > 0) {
            System.out.println("Вам нужно набрать " + weightDifference + " кг для достижения идеального веса.");
        } else if (weightDifference < 0) {
            System.out.println("Вам нужно сбросить " + Math.abs(weightDifference) + " кг для достижения идеального веса.");
        } else {
            System.out.println("Ваш вес уже является идеальным.");
        }
    }
}