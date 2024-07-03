package com.joshcode;

public class Switch_Statements {
    public static void main(String[] args) {

        // Switch Statements
     String gender = "Male";

        // Using Switch Statements
        switch (gender.toLowerCase()){
            case "Male":
                System.out.println("I am a male");
                break;
            case "Female":
                System.out.println("I am a female");
                break;
            default:
                System.out.println("I prefer not to say");


        }


    }
}
