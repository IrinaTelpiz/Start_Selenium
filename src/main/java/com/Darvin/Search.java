package com.Darvin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

    private final WebDriver driver;

    private final By emailField = By.id("user_email_login");
    private final By passwordField = By.id("user_password");
    private final By signInBtn = By.id("user_submit");


    public Search(WebDriver driver) {
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

}
