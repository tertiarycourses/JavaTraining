package com.tertiaryinfotech;

public class Property {

    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;

    public Property(double askingPrice, String propertyType, double lotSize) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = 0;
        this.numBeds = 0;
    }

    public Property(double askingPrice, String propertyType, double lotSize,
                    int numBaths, int numBeds) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }

    public String toString() {
        return "Asking price: $" + this.askingPrice +
                "\nProperty Type: " + this.propertyType +
                "\nLot Size: " + this.lotSize +
                "\nNumber of baths: " + this.numBaths +
                "\nNumber of bedrooms: " + this.numBeds;
    }

    public void setAskingPrice(double newValue) {
        this.askingPrice = newValue;
    }
}
