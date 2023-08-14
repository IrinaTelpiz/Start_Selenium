package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_KeyPresses {

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

        driver.navigate().to("https://the-internet.herokuapp.com/key_presses");

        WebElement target = driver.findElement(By.id("target"));

        target.sendKeys(Keys.LEFT);
        Thread.sleep(5000);
        target.sendKeys("hello");
        Thread.sleep(5000);
        target.sendKeys(Keys.chord(Keys.CONTROL, "A"));
        Thread.sleep(5000);
        target.sendKeys(Keys.chord(Keys.CONTROL, "X"));
        Thread.sleep(5000);
        target.sendKeys(Keys.chord(Keys.CONTROL, "V"));
        Thread.sleep(5000);






        
    }
}
