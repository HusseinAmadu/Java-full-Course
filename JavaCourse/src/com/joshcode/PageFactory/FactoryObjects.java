package com.joshcode.PageFactory;

public class FactoryObjects {
    public static void main(String[] args) {
     TransportInstance transportInstance = new TransportInstance();
     Transports transports = transportInstance.getInstance("jhblrendf");
     transports.delivery();
    }
}
