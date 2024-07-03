package com.joshcode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        double yield = calculatePropertyYield(1300,250000);
        System.out.println(yield);

           // OR
        System.out.println();
        Scanner monthIncome = new Scanner(System.in);
        System.out.print("Enter monthlyRentalIncome: ");
        int monthlyRentalIncome = Integer.parseInt(monthIncome.nextLine());
        double annualRentalIncome = monthlyRentalIncome * 12;

        Scanner propertyPrice = new Scanner(System.in);
        System.out.print("Enter propertyPrice: ");
        double originalPropertyPrice = Double.parseDouble(propertyPrice.nextLine());
        double rentalYield = (annualRentalIncome / originalPropertyPrice) * 100;
        System.out.println("Your rental yield is: "+rentalYield+"%");
        System.out.println();


    }
    private static double calculatePropertyYield(
            double rent, double propertyPrice
    ){
       double annualRent = rent * 12;
        return (annualRent / propertyPrice) * 100;
    }
}
