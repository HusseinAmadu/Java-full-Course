package com.joshcode;

public class Arithmetic_Operators {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 3;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);

        // BODMAS
        // B - Brackets
        // O - Order (Powers/indices or root)
        // D - Division
        // M - Multiplication
        // A - Addition
        // S - Subtraction

        System.out.println((2+2)*(3/1)*2);
        System.out.println();


        // Math Package
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(3.6,10.11));
        System.out.println(Math.min(6,8));
        System.out.println((int) Math.pow(5.0,2.0));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.PI);



    }
}
