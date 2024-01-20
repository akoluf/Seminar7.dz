package Kalc.util;

public class Complex {
    public static final Complex ZERO = new Complex(0, 0);

    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double real = this.real * other.real - this.imaginary * other.imaginary;
        double imaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double real = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(real, imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public boolean equals(Complex other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }
}