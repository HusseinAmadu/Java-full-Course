package com.joshcode;

public class Main {
       double sell;


    public Main(int sell){
        System.out.println("hi");
        this.sell = sell;
    }
    public void cal(double price){
        double pricetotal = price + sell;
        sell = pricetotal;
        System.out.println(sell);

    }

    public static void main(String[] args) {
        // single line comment
        /*
        Multi line comment
         */
        double productType = 34.4;
        double price = 6;
        System.out.println("Hello Java 🎉");
        System.out.println(10 + 10);
        Main main3 = new Main(3);
        main3.cal(3);
        System.out.println("This store sells " + productType + " at a price of "+ price + ".");
        System.out.println("hnc; \n ojwei");

        String course = "maths";
        switch (course){
            case "maths":
                System.out.println("maths");
                break;
            default:
                System.out.println("no course");
        }


    }


}