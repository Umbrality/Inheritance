package org.horizoncolumbus.hs;

public class Car extends Vehicle {
    String model = "";

    Car(String brand, String model){
        super(brand);
        this.model = model;
    }

    public void view(){
        System.out.println(brand);
        System.out.println(model);
    }
}
