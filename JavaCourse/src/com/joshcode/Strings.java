package com.joshcode;

public class Strings {
    public static void main(String[] args){
       //Strings
        /*

             Concatenate
        String josh = "Josh";
        String code = "code";
        String brand = josh + code;
        System.out.println(brand);
         */
        String josh = "Josh";
        String code = "code";
        String brand = josh + code;

        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(0,4));
        System.out.println(brand.contains("code"));
        System.out.println(brand.charAt(2));
        System.out.println(" ".isEmpty());// is false because it counts the space
        System.out.println(" ".isBlank());
        System.out.println(" a ".isBlank());
        System.out.println(" a ");
        System.out.println(" a ".trim());
    }
}
