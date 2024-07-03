package com.joshcode;

public class Loops {
    public static void main(String[] args){
        // Loops

        // Now we want to print hello 5times
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println();

        // Now we are using loop
        System.out.println("Start of for loop");
        for (int i = 0; i <= 10; i++)// to increase at specific number we use eg (i+=2)
        {
            System.out.println("Hello" + i);
        }
        System.out.println("End of for loop");

        System.out.println();


        System.out.println("Reverse of for loop");
        for (int i = 10; i >= 0; i--){
            System.out.println("Hello" + i);
        }
        System.out.println("End of for loop");




    }
}
