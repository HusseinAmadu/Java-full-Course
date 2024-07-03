package DataStructures;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<String,String> employees = new TreeMap<>();
        //Add Element
        employees.put("id 1","James Potter");
        employees.put("id 2","Martins Hacker");
        //Get by Key
        employees.get("id 1");
        //Print all values
        for (String i : employees.values()){
            System.out.println(i);
        }

    }
}
