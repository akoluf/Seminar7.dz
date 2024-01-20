package Kalc.View;

import Kalc.util.Complex;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public Complex readComplexNumber() {
        System.out.println("Введите число (действительная и мнимая часть через пробел):");
        double real = scanner.nextDouble();
        double imaginary = scanner.nextDouble();
        return new Complex(real, imaginary);
    }
}