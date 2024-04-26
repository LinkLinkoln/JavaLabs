public interface MoneyOperations
{
    Money add(Money other);

    Money subtract(Money other);

    Money divide(int divisor);

    Money multiply(double multiplier);

    boolean isEqual(Money other);

    boolean isGreaterThan(Money other);

    boolean isLessThan(Money other);
}
