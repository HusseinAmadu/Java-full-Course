import java.util.Scanner;

public class quiz {

    public static void main(String args[]) {
        functionalInterFace  manual = (useCase) -> System.out.println("Test "+ useCase + " manually");
        functionalInterFace automation = (useCase) -> System.out.println("Test "+ useCase + " with Selenide");
        manual.test("FirstCase");
        automation.test("SecondCase");
        SimpleRec simpleRec = new SimpleRec("Hussein", 20);


    }
}
