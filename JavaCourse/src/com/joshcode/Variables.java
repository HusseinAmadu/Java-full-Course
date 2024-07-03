package com.joshcode;

import java.util.Date;

public class Variables {
    public static void main(String[] args){
        // primitives are used to store values
        int number1 = 20;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);

        int number = 20;
        double pi = 20.34;
        boolean isMale = false;
        String name = "k";
        System.out.println(name.toUpperCase());

        // Reference Type are more complex. NB These are built-in Data Types
        Date date = new Date();
        System.out.println(date);
        String schools = new String("AMK");
    }
}
