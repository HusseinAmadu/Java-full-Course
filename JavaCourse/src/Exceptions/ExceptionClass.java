package Exceptions;

import java.io.IOException;

public class ExceptionClass {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        try {
            int result = dividend / divisor; // This will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }finally {
            {
                System.out.println("Finally");// This will print even if it throws catch
            }
        }
    }

}
