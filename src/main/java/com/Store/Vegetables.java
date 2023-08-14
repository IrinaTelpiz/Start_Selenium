package com.Store;

class Vegetables extends Products{

    public Vegetables(String prodName, double price) {
        super(prodName, price);
    }


    public String getProduct() {
        return "Vegetable";
    }
}
