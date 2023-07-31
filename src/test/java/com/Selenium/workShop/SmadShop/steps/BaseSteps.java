package com.Selenium.workShop.SmadShop.steps;

import com.selenium.workShop.SmadShop.pages.MainPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class BaseSteps {

    private final MainPage mainPage;

    public BaseSteps(WebDriver driver){
        mainPage = new MainPage(driver);
    }


    public void checkMainPageLoaded() {
        assertTrue("The main page is not loaded", mainPage.isPageLoaded());


    }
}
