package com.joshcode;

import java.util.Arrays;

public class Zero_And_Null_Values_For_Arrays {
    public static void main(String[] args){
        // Arrays null values
        int[] numbers = new int[3];
        numbers[0] = 2;
        System.out.println(Arrays.toString(numbers));
        // default unassigned value for integer in Arrays is Zero 0 = [2,0,0]

        // To change the default value
        Arrays.fill(numbers,-1); // Now we say fill all unassigned values as -1
        numbers[0] = 2;
        System.out.println(Arrays.toString(numbers)); // [2,-1,-1]


        // For Strings default unassigned values are stored as null
        String[] names = new String[3];
        Arrays.fill(names,"foo");
        names[1] = "John";
        System.out.println(Arrays.toString(names));

    }
}
