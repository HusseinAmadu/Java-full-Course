package Enums.CoffeeShop;

import Enums.CoffeeShop.CoffeeType;

public class RequestCoffee {
    public static void main(String[] args) {
        CoffeeType coffeeType1 = CoffeeType.ESPRESSO;
        prepareCoffee(coffeeType1);
        coffeeType1.enumMethod();

    }
    public static void prepareCoffee(CoffeeType coffeeTypee){
        switch (coffeeTypee){
            case ESPRESSO:
                System.out.println("Grind and brew a shot of espresso.");
                break;
            case LATTE:
                System.out.println("Steam milk and add it to a shot of espresso.");
                break;
            case CAPPUCCINO:
                System.out.println("Prepare a shot of espresso and add equal parts of steamed milk and milk foam.");
                break;
            default:
                System.out.println("We don't serve that type of coffee");
        }


    }
}
