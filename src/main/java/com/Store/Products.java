package com.Store;

abstract class Products {
    private String prodName;
    private double price;

    public Products(String prodName, double price) {
        this.prodName = prodName;
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public abstract String getProduct();

}
