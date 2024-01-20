package Kalc.util;

public class AdditionOperation implements Operation {
    public Complex performOperation(Complex num1, Complex num2) {
        return num1.add(num2);
    }
}