package com.joshcode;

public class Arrays {
    public static void main(String[] args){
       // Arrays
       int[] numbers = new int[3];
       numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println();

        // or


        int[] numbers2 = {0,5,6,8,9};
        System.out.println(java.util.Arrays.toString(numbers2));
        System.out.println(numbers2.length);
        //Updates item in array
        numbers2[1] = 55;
        System.out.println(java.util.Arrays.toString(numbers2));
        System.out.println();


        double[] numbers3 = {0,5,6,8,9};
        System.out.println(java.util.Arrays.toString(numbers3));
        System.out.println();

        String[] names = {"john","Kelvin"};
        System.out.println(java.util.Arrays.toString(names));


    }
}
