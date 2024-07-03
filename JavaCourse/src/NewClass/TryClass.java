package NewClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TryClass {
    int userAge;
    public TryClass(int userAge1){
        this.userAge = userAge1;
    }
    public TryClass(){
       this(20);
    }
    public void getAge()
    {
        System.out.println(this.userAge);
    }
    public static void getAAge( ){
        System.out.println("This is static");
    }
    public static void main(String[] args) {
        TryClass tryClass = new TryClass();
        tryClass.getAge();
        getAAge();
    }

}
