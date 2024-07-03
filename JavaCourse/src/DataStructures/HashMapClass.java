package DataStructures;

import java.util.HashMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,String> employees = new HashMap<>();
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
