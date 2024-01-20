package Kalc.util;


public class SubtractionOperation implements Operation {
    public Complex performOperation(Complex num1, Complex num2) {
        return num1.subtract(num2);
    }
}