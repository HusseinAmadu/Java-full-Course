package Testclass;

import java.util.ArrayList;

public class School extends Students {
      ArrayList<String>  students = new ArrayList<>();
      ArrayList<String> studentscourse = new ArrayList<>();

      School(String FullName, String course){
          super(FullName,course);
      }
      public void listOfNamesAndCourses(){
          this.students.add(FullName);
          this.studentscourse.add(course);
          System.out.println(this.students);
          System.out.println(this.studentscourse);

      }

    public static void stdStat(){
        System.out.println("This cannot override");
    }


    public static void main(String[] args) {
     School student1 = new School("Hussein Amadu","Science");
     student1.listOfNamesAndCourses();
        student1.listOfNamesAndCourses();


    }
}
