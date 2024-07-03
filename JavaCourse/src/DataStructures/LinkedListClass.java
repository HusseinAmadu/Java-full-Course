package DataStructures;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();
        //Add element from below
        employees.add("John Jones");
        //Add at specific index
        employees.add(1,"Peter James");
        //Add at first index
        employees.addFirst("Mark Potter");
        //Get by index
        employees.get(1);
        System.out.println(employees);
        //Remove from below
        employees.remove();
//        for (String i : employees){
//            System.out.println(i);
//        }
    }
}
