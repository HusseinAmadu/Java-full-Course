package Lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateClass {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 ==0;
        System.out.println(isEven.test(4));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        

    }
}
