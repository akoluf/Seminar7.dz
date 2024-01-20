package Kalc.util;


import java.util.Scanner;
public class OperationFactory {
    public static Operation createOperation() {
        System.out.println("Введите операцию (+, -, *, /):");
        char operation = new Scanner(System.in).next().charAt(0);

        switch(operation) {
            case '+':
                return new AdditionOperation();
            case '-':
                return new SubtractionOperation();
            case '*':
                return new MultiplicationOperation();
            case '/':
                return new DivisionOperation();
            default:
                System.out.println("Ошибка: Неверная операция!");
                return null;
        }
    }
}