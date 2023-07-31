package com.Selenium.workShop.SmadShop.steps;

import com.selenium.workShop.SmadShop.pages.MainPage;
import org.openqa.selenium.WebDriver;

public class SearchSteps {

    private  final MainPage mainPage;

    public SearchSteps(WebDriver driver){
        mainPage = new MainPage(driver);


    }

    public void searchItems(String searchTerm) {
        mainPage.search(searchTerm);
    }
}
