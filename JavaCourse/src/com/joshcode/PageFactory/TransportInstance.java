package com.joshcode.PageFactory;

public class TransportInstance {
    public Transports getInstance(String str){
        if (str.toLowerCase().equals("truck")){
            return new ByCar();
        }else if(str.toLowerCase().equals("yatch")){
            return new ByShip();

        }else if (str.toLowerCase().equals("bike")){
            return new ByBike();
        }else {
            return null;
        }
    }
}
