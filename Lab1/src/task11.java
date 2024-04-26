public class task11 {
    public void task11Method() {
        int secondsLeft = 1000000;

        int days = secondsLeft / (24 * 60 * 60);
        secondsLeft %= 24 * 60 * 60;

        int hours = secondsLeft / (60 * 60);
        secondsLeft %= 60 * 60;

        int minutes = secondsLeft / 60;
        secondsLeft %= 60;

        System.out.println(days + " дней, " + hours + " часов, " + minutes + " минут и " + secondsLeft + " секунд");
    }
}