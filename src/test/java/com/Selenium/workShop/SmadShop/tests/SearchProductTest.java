package com.Selenium.workShop.SmadShop.tests;

import com.Selenium.workShop.SmadShop.steps.*;
import com.selenium.workShop.SmadShop.Dto.ProductDto;
import com.selenium.workShop.SmadShop.utils.PropertyReader;
import org.junit.Before;
import org.junit.Test;

public class SearchProductTest extends BaseTest {

    private BaseSteps baseSteps;
    private SearchSteps searchSteps;
    private CatalogSteps catalogSteps;
    private ProductDetailsSteps productDetailsSteps;
    private CheckDetailsSteps checkDetailsSteps;


//    1. Navigate to smadshop
//    2. Check page loaded
//    3. Search a product
//    4. Check the list of items contain the search term
//    5. Save the product data
//    6. Open the product page
//    7. Check the data is the same as on search page

    @Before
    public void setUpSteps(){
        baseSteps = new BaseSteps(getDriver());
        searchSteps = new SearchSteps(getDriver());
        catalogSteps = new CatalogSteps(getDriver());
        productDetailsSteps = new ProductDetailsSteps(getDriver());
        checkDetailsSteps = new CheckDetailsSteps();
    }

    @Test
    public void SearchProductTest() {

        final String searchTerm = PropertyReader.getConfigProperty("product");

        baseSteps.checkMainPageLoaded();
        searchSteps.searchItems(searchTerm);
        catalogSteps.checkResultListPresent();
        catalogSteps.checkTermIsPresentInResult(searchTerm);

        final int productIndex = catalogSteps.getRandomProductIndex();
        final ProductDto catalogProduct = catalogSteps.getProductDetails(productIndex);
        catalogSteps.openProduct(productIndex);

        productDetailsSteps.checkProductPageLoaded();
        final ProductDto detailedProduct = productDetailsSteps.getProductDetails();
        
        checkDetailsSteps.checkProductMatch(catalogProduct,detailedProduct);



    }
}
