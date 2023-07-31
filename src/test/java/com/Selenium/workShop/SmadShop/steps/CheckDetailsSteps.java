package com.Selenium.workShop.SmadShop.steps;

import com.selenium.workShop.SmadShop.Dto.ProductDto;

import static org.junit.Assert.assertEquals;

public class CheckDetailsSteps {

    public void checkProductMatch(ProductDto catalogProduct, ProductDto detailedProduct) {
        assertEquals("Catalog product data is not equal to product data from details page.", catalogProduct,detailedProduct);
    }
}
