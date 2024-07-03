package com.joshcode;

import java.util.Arrays;

public class Rewind {
    public static void main(String[] args) {
        String[] names ={"James","Nadia","Sophia","Alex","Saleh","Kelvin"};
        searchIfNameExist(names,"hjknn,");
    }
    public static void searchIfNameExist(String[] names, String search){
        for (int i = 0; i < names.length; i++){
            if (names[i].matches(search)){
                System.out.println(names[i]);
                break;
            }
           // System.out.println("Not exist");
        }


    }


}
