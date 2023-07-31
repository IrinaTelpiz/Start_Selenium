package com.Selenium.workShop.SmadShop;

import com.selenium.workShop.SmadShop.components.CatalogProduct;
import com.selenium.workShop.SmadShop.components.DetailedProduct;
import com.selenium.workShop.SmadShop.components.Product;
import com.selenium.workShop.SmadShop.pages.CatalogPage;
import com.selenium.workShop.SmadShop.pages.MainPage;
import com.selenium.workShop.SmadShop.pages.ProductPage;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class DraftSearchProductTest {

    WebDriver driver;

    private MainPage mainPage;
    private CatalogPage catalogPage;
    private ProductPage productPage;
    private static final String URL = "https://smadshop.md/";



//    1. Navigate to smadshop
//    2. Check page loaded
//    3. Search a product
//    4. Check the list of items contain the search term
//    5. Save the product data
//    6. Open the product page
//    7. Check the data is the same as on search page

    @Before
    public void setUp(){
        System.out.println("Setting web driver");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

    }

    @After
    public void tearDown(){
        System.out.println("Closing web driver");
        driver.quit();
    }

    @Test
    public void SearchProductTest() throws InterruptedException {

        final String searchTerm = "samsung";

        mainPage = new MainPage(driver);

        assertTrue("The main page is not loaded", mainPage.isPageLoaded());

        mainPage.search(searchTerm);

        catalogPage = new CatalogPage(driver);

        List<CatalogProduct> productList = catalogPage.getProductList();

        assertTrue("The product list is empty", productList.size() > 0);

        for (Product product : productList) {
            assertTrue("The product name doesn't contain " + searchTerm, StringUtils.containsIgnoreCase(product.getName(),searchTerm));
        }

        CatalogProduct firstProduct = productList.get(0);
        String firstProductName = firstProduct.getName();
        int firstProductPrice = firstProduct.getPrice();
        catalogPage.openItem(0);

        productPage = new ProductPage(driver);

        assertTrue("The product page is not loaded", productPage.isPageLoaded());

        DetailedProduct actualProduct = productPage.getProduct();
        String actualProductName = actualProduct.getName();
        int actualProductPrice = actualProduct.getPrice();

        assertTrue("The product name is different", actualProductName.equals(firstProductName));
        assertTrue("The product price is different", actualProductPrice == firstProductPrice);

    }
}
