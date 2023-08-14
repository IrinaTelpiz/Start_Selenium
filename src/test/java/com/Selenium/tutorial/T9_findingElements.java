package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class T9_findingElements {

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
    public void searchElems() throws InterruptedException {
        driver.get("https://www.amazon.com/");

        List<WebElement> cards = driver.findElements(By.cssSelector(".a-cardui-body"));

        if (cards.size() > 0 ) cards.get(0).click();
        Thread.sleep(5000);

        WebElement someCard = driver.findElement(By.linkText("See more"));
        someCard.click();

    }
}
