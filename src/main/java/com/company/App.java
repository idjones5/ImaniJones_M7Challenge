package com.company;

public class App {

    public Factory makeFactoryIceCream() {
        Factory factory = new Factory("Chunky-monkey", "benny's","chocolate-peanut", "USA foods", "ice-cream", "USA", 8.0, false);
                return factory;
    }


    public Sale makeSaleIceCream() {
        Sale sale = new Sale("tooChoo","tooChooBrands", "double-chocolate-mint", "ice-cream", 14.00, 8.0, false);
                return sale;
    }

}
