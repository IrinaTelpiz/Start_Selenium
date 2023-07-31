package com.selenium.workShop.SmadShop.components;

import org.openqa.selenium.WebElement;

import static com.selenium.workShop.SmadShop.utils.RegexParser.parseInteger;

public abstract class Product {

    protected WebElement name;
    protected WebElement price;


    protected  WebElement getNameEl(){
        return name;
    }
    protected  WebElement getPriceEl(){
        return  price;
    }

    public String getName() {
        return getNameEl().getText();
    }

    public int getPrice() {
        return parseInteger(getPriceEl().getText());
    }
}
