public class ComplexNumber implements ComplexOperations {
    private double realPart;
    private double imaginaryPart;
    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = (double) realPart;
        this.imaginaryPart = (double) imaginaryPart;
    }

    @Override
    public boolean equals(ComplexNumber other) {
        return this.realPart == other.realPart && this.imaginaryPart == other.imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        double real = this.realPart + other.realPart;
        double imaginary = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber other) {
        double real = this.realPart - other.realPart;
        double imaginary = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        double real = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double imaginary = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(real, imaginary);
    }
}
