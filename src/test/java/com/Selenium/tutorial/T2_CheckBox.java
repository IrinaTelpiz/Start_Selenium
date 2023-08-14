package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_CheckBox {

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

        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
        driver.findElements(By.tagName("input")).get(0).click();
        Thread.sleep(5000);
        driver.findElements(By.tagName("input")).get(1).click();


    }
}
