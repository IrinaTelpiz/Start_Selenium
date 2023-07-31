package com.selenium.workShop.SmadShop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CatalogProduct extends Product {

    private final By nameLocator = By.cssSelector(".name span");
    private final By priceLocator = By.cssSelector(".price_cart");


    public CatalogProduct(WebElement productEl) {
        name = productEl.findElement(nameLocator);
        price = productEl.findElement(priceLocator);
    }

}
