package com.joshcode;

public class Ternary_Operators {
    public static void main(String[] args) {
        // Ternary Operators

        int age = 15;
        if (age >= 18){
            System.out.println("Hooray.... I am an adult🎉");
        }else {
            System.out.println("I am not an adult");
        }

        // Using Ternary
        String message = age >= 18 ? "Hooray.... I am an adult🎉" : "I am not an adult";
        System.out.println(message);
    }
}
