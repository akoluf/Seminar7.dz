package Kalc;

import Kalc.View.Input;
import Kalc.util.Complex;
import Kalc.util.Operation;
import Kalc.util.OperationFactory;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    private static Complex previousResult = new Complex(0, 0); // переменная для хранения предыдущего результата

    public static void main(String[] args) {
        FileHandler fh;

        try {
            fh = new FileHandler("myLogFile.log", true); // the true will append the new log to the existing file
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info("My first log");

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.log(Level.INFO, "Starting the program");

        Input input = new Input();
        Complex num1 = input.readComplexNumber();
        logger.log(Level.INFO, "First number: " + num1);

        Complex num2 = input.readComplexNumber();
        logger.log(Level.INFO, "Second number: " + num2);

        Operation operation = OperationFactory.createOperation();
        Complex result = operation.performOperation(num1, num2);
        logger.log(Level.INFO, "Result: " + result);
        System.out.println(result);
        previousResult = result; // сохраняем текущий результат как предыдущий
    }
}