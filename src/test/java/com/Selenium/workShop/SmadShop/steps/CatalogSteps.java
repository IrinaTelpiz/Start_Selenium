package com.Selenium.workShop.SmadShop.steps;

import com.selenium.workShop.SmadShop.Dto.ProductDto;
import com.selenium.workShop.SmadShop.components.CatalogProduct;
import com.selenium.workShop.SmadShop.components.Product;
import com.selenium.workShop.SmadShop.pages.CatalogPage;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertTrue;

public class CatalogSteps {

    private final CatalogPage catalogPage;

    public CatalogSteps(WebDriver driver){
        catalogPage = new CatalogPage(driver);
    }
    public void checkResultListPresent() {
        List<CatalogProduct> productList = catalogPage.getProductList();

//        assertTrue("The product list is empty", productList.size() > 0);
        assertThat(productList).as("The product list is empty").hasSizeGreaterThan(0);
    }

    public void checkTermIsPresentInResult(String searchTerm) {
        for (Product product : catalogPage.getProductList()) {
            assertTrue("The product name doesn't contain " + searchTerm, StringUtils.containsIgnoreCase(product.getName(),searchTerm));
        }
    }

    public int getRandomProductIndex() {
        return new Random().nextInt(catalogPage.getProductList().size());
    }

    public ProductDto getProductDetails(int productIndex) {
        return new ProductDto(catalogPage.getProductList().get(productIndex));
    }

    public void openProduct(int productIndex) {
        catalogPage.openItem(productIndex);
    }
}
