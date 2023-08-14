package com.selenium.UI_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {

    private final WebDriver driver;

    private final By emailField = By.id("user_email_login");
    private final By passwordField = By.id("user_password");
    private final By signInBtn = By.id("user_submit");
    private final By warning1 = By.id("");
    private final By warning2 = By.id("");
    private final By warning3 = By.id("");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) throws InterruptedException {
        setEmail(email);
        Thread.sleep(3000);
        setPassword(password);
        Thread.sleep(3000);
        clickSignIn();
        Thread.sleep(3000);
    }

    private void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    private void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    private void clickSignIn(){
        driver.findElement(signInBtn).click();
    }

    public boolean isWarningDisplayed(){
        List<WebElement> warnings = driver.findElements(warning1);
        warnings.addAll(driver.findElements(warning2));
        warnings.addAll(driver.findElements(warning3));
        if (!warnings.isEmpty()) return false;
        else return true;

    }

}
