package Kalc.util;

public class DivisionOperation implements Operation {
    public Complex performOperation(Complex num1, Complex num2) {
        if (!num2.equals(Complex.ZERO)) {
            return num1.divide(num2);
        } else {
            System.out.println("Ошибка: Деление на ноль!");
            return null;
        }
    }
}