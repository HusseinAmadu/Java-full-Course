package Lambdas;

import java.util.function.Function;

public class FunctionClass {
    public static void main(String[] args) {
        Function<String,Integer> stringLength = l -> l.length();
        System.out.println(stringLength.apply("Hello"));
    }
}
