package com.joshcode;

public class Else_If {
    public static void main(String[] args){
        // Else If Statements
        int age = 0;
        boolean isAdult = age >= 16;
        if (isAdult){
            System.out.println("is adult :)");
        }else if (age == 0) {
            System.out.println("Baby :)");
        }
        else if (age == 1) {
            System.out.println("toddler :)");
        } else if (age == 2) {
            System.out.println("toddler :)");
        }
        else if (age == 3) {
            System.out.println("toddler :)");
        }
        else {
            System.out.println("is not an adult :(");
        }
    }
    }

