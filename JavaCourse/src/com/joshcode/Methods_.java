package com.joshcode;

import java.util.Arrays;

public class Methods_ {
    public static void main(String[] args) {
        //Methods
        char[] letters = {'A','A','B','C','D','D','D'};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }
    public static int countOccurrences(char[] letters, char searchLetter){
        int count = 0;
       for (char letter : letters){
          if (letter == searchLetter){
              count++;
          }
       }
        return count;
    }
}
