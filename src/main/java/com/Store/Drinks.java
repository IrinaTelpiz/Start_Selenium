package com.Store;

class Drinks extends Products{

    public Drinks(String prodName, double price) {
        super(prodName, price);
    }

    public String getProduct() {
        return "Drink";
    }
}
