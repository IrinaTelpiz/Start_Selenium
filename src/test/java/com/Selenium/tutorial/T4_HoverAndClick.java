package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class T4_HoverAndClick {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void checkboxTest() throws InterruptedException {

        driver.navigate().to("https://the-internet.herokuapp.com/hovers");

        List<WebElement> avatars = driver.findElements(By.className("figure"));

        Actions action = new Actions(driver);
        action.moveToElement(avatars.get(1)).perform();

        Thread.sleep(5000);
        driver.findElement(By.linkText("View profile")).click();
        Thread.sleep(5000);






        
    }
}
