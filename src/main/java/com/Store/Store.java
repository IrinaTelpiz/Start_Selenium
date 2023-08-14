package com.Store;

public class Store {
    public static void main(String[] args) {

        Products tomato = new Vegetables("Tomato", 2.5);
        Products water = new Drinks("Water", 1.7);
        Products fruit = new Fruit("Watermelon", 5.6);

        Shopping basket = new Shopping();
        basket.addProducts(tomato);
        basket.addProducts(water);
        basket.addProducts(fruit);
        basket.shoppingBasket();
        basket.deleteProducts(tomato);
        basket.shoppingBasket();






    }
}
