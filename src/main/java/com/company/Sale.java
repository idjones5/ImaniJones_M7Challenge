package com.company;

public class Sale {

    private String name;
    private String brand;
    private String flavor;
    private String usdaType;
    private double price;
    private double cartSize;
    private boolean organic;


    // constructor

    Sale(String name, String brand, String flavor, String usdaType, double price, double cartSize, boolean organic) {
        this.name = name;
        this.brand = brand;
        this.flavor = flavor;
        this.usdaType = usdaType;
        this.price = price;
        this.cartSize = cartSize;
        this.organic = organic;
    }

    // behaviors

    public void sellIceCream() {
        System.out.println("Cha-Chinnnng!");
    }

    // getters

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getUsdaType() {
        return usdaType;
    }

    public double getPrice() {
        return price;
    }

    public double getCartSize() {
        return cartSize;
    }

    public boolean getOrganic() {
        return organic;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setUsdaType(String usdaType) {
        this.usdaType = usdaType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCartSize(double cartSize) {
        this.cartSize = cartSize;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }
}
