package com.joshcode;

import java.util.ArrayList;

public class task {
    public static void main(String[] args) {
        ArrayList<String> shop = new ArrayList<>();
        shop.add("apples");
        shop.add("mangoes");
        shop.add("bananas");
        shop.add("berries");
        for (int i = 0; i < shop.size(); i++) {
            // Add your code below
            if (shop.get(i) == "mangoes"){
                shop.remove(i);
                i--;
            }

        }
        System.out.println(shop);
    }
}
