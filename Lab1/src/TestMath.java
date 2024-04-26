public class TestMath {
    public void TestTask() {
        int targetSum = 1000;

        for (int a = 1; a < targetSum / 3; a++) {
            int b = (targetSum * (targetSum - 2 * a)) / (2 * (targetSum - a));
            int c = targetSum - a - b;
            if (a * a + b * b == c * c) {
                System.out.println("Пифагорова тройка: " + a + ", " + b + ", " + c);
                break;
            }
        }
    }
}