public class task7 {
    public void task7Method() {
        double initialDeposit = 1000.0;
        double annualInterestRate = 0.05;

        double finalDeposit = initialDeposit * (1 + annualInterestRate) * (1 + annualInterestRate);

        System.out.println("Сумма вклада через два года: " + finalDeposit);
    }
}