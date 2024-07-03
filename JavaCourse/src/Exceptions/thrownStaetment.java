package Exceptions;

public class thrownStaetment {
    public static void main(String[] args) throws customExceptionClass {
        invalidAge(12);
    }
    public static void invalidAge(int age) throws customExceptionClass {

     if(age < 18){
         throw new customExceptionClass("Sorry not qualify");
     }
        System.out.println("qualify");
    }
}
