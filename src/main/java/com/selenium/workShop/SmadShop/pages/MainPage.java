package com.selenium.workShop.SmadShop.pages;

import com.selenium.workShop.SmadShop.components.SearchComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(id = "logo")
    public WebElement logo;

    private SearchComponent searchComponent;

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        searchComponent = new SearchComponent(driver);

    }

    public boolean isPageLoaded() {
        return logo.isDisplayed();
    }

    public void search(String searchTerm) {
        searchComponent.search(searchTerm);
    }
}
