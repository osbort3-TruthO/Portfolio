package com.pluralsight;

public class House extends  FixedAsset{
    private int yearBulit;
    private int squareFeet;
    private int bedroom;

    public House(String name, double marketValue, int yearBulit, int squareFeet, int bedroom) {
        super(name, marketValue);
        this.yearBulit = yearBulit;
        this.squareFeet = squareFeet;
        this.bedroom = bedroom;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }

}
