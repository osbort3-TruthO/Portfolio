package com.pluralsight;

public class Jewelery extends FixedAsset{
    private double karat;

    public Jewelery(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }
}
