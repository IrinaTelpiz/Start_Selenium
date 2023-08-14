package com.Store;

import java.util.ArrayList;
import java.util.List;

class Shopping {

    private List<Products> products;

    public Shopping(){
        products = new ArrayList<>();
    }

    public void addProducts(Products product){
        products.add(product);
    }

    public void deleteProducts(Products product){
        products.remove(product);
    }

    public double totalPrice(){
        double total = 0.0;
        for (Products product : products){
            total += product.getPrice();
        }
        return total;
    }

    public void shoppingBasket(){
        System.out.println();

        System.out.println("In basket now: ");
        System.out.println("===========================");
        for (Products product : products){
            System.out.println(product.getProduct() + ": " + product.getProdName() + " - " + product.getPrice() + " $");
        }

        System.out.println("===========================");
        System.out.println("Total price is: " + totalPrice() + " $");
        System.out.println();
    }
}
