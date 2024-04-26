public class task8 {
    public void task8Method() {
        final double speedOfSound = 343.0;
        final double timeInSeconds = 5.0;

        double distance = speedOfSound * timeInSeconds;
        String result = String.format("%.3f", distance);
        System.out.println("Расстояние до места удара молнии: " + result + " м");
    }
}