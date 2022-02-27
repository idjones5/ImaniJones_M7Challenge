package com.company;

public class Factory {

     private String name;
     private String brand;
     private String flavor;
     private String manufacturer;
     private String usdaType;
     private String locationProduced;
     private double cartSize;
     private boolean organic;

     // constructor

    Factory(String name, String brand, String flavor, String manufacturer, String usdaType, String locationProduced, double cartSize, boolean organic) {
        this.name = name;
        this.brand = brand;
        this.flavor = flavor;
        this.manufacturer = manufacturer;
        this. usdaType = usdaType;
        this.locationProduced = locationProduced;
        this.cartSize = cartSize;
        this.organic = organic;
    }


    // behaviors

    public void makeIceCream() {
        System.out.println("Swoosh. buuuuzzzz.");
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

    public String getManufacturer() {
        return manufacturer;
    }

    public String getUsdaType() {
        return usdaType;
    }

    public String getLocationProduced() {
        return locationProduced;
    }

    public double getCartSize() {
        return cartSize;
    }

    public boolean getOrganic() {
        return organic = !organic;
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

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setUsdaType(String usdaType) {
        this.usdaType = usdaType;
    }

    public void setLocationProduced(String locationProduced) {
        this.locationProduced = locationProduced;
    }

    public void setCartSize(double cartSize) {
        this.cartSize = cartSize;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }


}
