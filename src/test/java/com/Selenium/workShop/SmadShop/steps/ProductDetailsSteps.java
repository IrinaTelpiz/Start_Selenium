package com.Selenium.workShop.SmadShop.steps;

import com.selenium.workShop.SmadShop.Dto.ProductDto;
import com.selenium.workShop.SmadShop.pages.ProductPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class ProductDetailsSteps {

    private final ProductPage productPage;

    public ProductDetailsSteps(WebDriver driver){
        productPage = new ProductPage(driver);
    }
    public void checkProductPageLoaded() {
        assertTrue("The product page is not loaded", productPage.isPageLoaded());

    }

    public ProductDto getProductDetails() {
       return new ProductDto(productPage.getProduct());
    }
}
