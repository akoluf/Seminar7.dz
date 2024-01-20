package Kalc.util;

public class MultiplicationOperation implements Operation {
    public Complex performOperation(Complex num1, Complex num2) {
        return num1.multiply(num2);
    }
}