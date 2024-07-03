package com.joshcode;

public class Short_Hand_Reassignment {
    public static void main(String[] args){
        int numberOne = 10;
        /*
            x += y is x = x + y
            x -= y is x = x - y
            x *= y is x = x * y
            x /= y is x = x / y
            x %= y is x = x % y
            x ^= y is x = x ^ y
         */

        numberOne += 2; // pick the current value of numberOne and add 2
        System.out.println(numberOne);
    }
}
