package com.joshcode;

public class Increment_And_Decrement {
    public static void main(String[] args){
        int number1 = 0;
        //Increment
        System.out.println(number1++);// print number1 which is 0, and increase by 1 when next in use.
        System.out.println(number1);// now the number1 is 1 here

        int number2 = 0;
        System.out.println(++number2);// increase the current number by 1 and print
        System.out.println(number2);// print the new update


        //Decrement
        int decrease1 = 0;
        System.out.println(decrease1--);// print decrease1 which is 0, and decrease by 1 when next in use.
        System.out.println(decrease1);// now the decrease1 is -1 here

        int decrease2 = 0;
        System.out.println(--decrease2);// decrease the current decrease2 by 1 and print
        System.out.println(decrease2);// now the decrease2 is -1 here
    }
}
