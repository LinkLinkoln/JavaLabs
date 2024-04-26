public class Money implements MoneyOperations {
    private long rubles;
    private byte kopeks;

    public Money(long rubles, byte kopeks) {
        this.rubles = rubles;
        this.kopeks = kopeks;
    }

    @Override
    public Money add(Money other) {
        long totalRubles = this.rubles + other.rubles;
        int totalKopeks = this.kopeks + other.kopeks;

        int a = totalKopeks / 100;
        for (int i = 0; i < a; i++){
            if (totalKopeks >= 100) {
                totalRubles += 1;
                totalKopeks -= 100;
            }
        }


        return new Money(totalRubles, (byte) totalKopeks);
    }

    @Override
    public Money subtract(Money other) {
        long totalRubles = this.rubles - other.rubles;
        int totalKopeks = this.kopeks - other.kopeks;

        if (totalKopeks < 0) {
            totalRubles -= 1;
            totalKopeks += 100;
        }

        return new Money(totalRubles, (byte) totalKopeks);
    }

    @Override
    public Money divide(int divisor) {
        long totalRubles = this.rubles / divisor;
        int totalKopeks = (int) ((this.rubles % divisor) * 100 + this.kopeks) / divisor;

        return new Money(totalRubles, (byte) totalKopeks);
    }

    @Override
    public Money multiply(double multiplier) {
        double totalAmount = (this.rubles + (double) this.kopeks / 100) * multiplier;
        long totalRubles = (long) totalAmount;
        int totalKopeks = (int) ((totalAmount - totalRubles) * 100);

        return new Money(totalRubles, (byte) totalKopeks);
    }

    @Override
    public boolean isEqual(Money other) {
        return this.rubles == other.rubles && this.kopeks == other.kopeks;
    }

    @Override
    public boolean isGreaterThan(Money other) {
        boolean a = false;
        if (this.rubles > other.rubles) {
            a = true;
        } else if (this.rubles == other.rubles && this.kopeks > other.kopeks) {
            a = false;
        }

        return a;
    }

    @Override
    public boolean isLessThan(Money other) {
        if (this.rubles < other.rubles) {
            return true;
        } else if (this.rubles == other.rubles && this.kopeks < other.kopeks) {
            return true;
        }

        return false;
    }
    public String ToString()
    {
        return rubles + "," + kopeks;
    }

}
