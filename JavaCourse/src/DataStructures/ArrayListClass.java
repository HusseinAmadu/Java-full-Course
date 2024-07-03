package DataStructures;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        //Add from below
        employees.add("John Jones");
        //Add to specific index
        employees.add(1,"Petter James");
        //Get by index
        employees.get(0);
        //Print
        System.out.println(employees);
        //Size
        employees.size(); //prints 1
        //Remove by Index
        employees.remove(0);
        //Clear all Lists
        employees.clear();


    }
}
