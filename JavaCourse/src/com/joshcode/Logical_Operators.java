package com.joshcode;

public class Logical_Operators {
    public static void main(String[] args){
        // Logical Operators
        /*
           && - All Expression must be true
           || - At least one must be true
           ! - Using isNot
         */
        boolean isAdult = false;
        boolean isStudent = true;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println(!isAdult && isStudent);
        System.out.println(10 > 8 || 2 <= 2);
    }
}
