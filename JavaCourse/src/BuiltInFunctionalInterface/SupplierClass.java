package BuiltInFunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierClass {
    public static void main(String[] args) {
        Supplier<Integer> random = (Supplier<Integer>) new Random();
    }
}
