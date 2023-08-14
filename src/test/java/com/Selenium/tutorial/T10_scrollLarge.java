package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class T10_scrollLarge {

    WebDriver driver;
    private static final String SCRIPT = "arguments[0].scrollIntoView();";

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
    public void fileUploadTest() throws InterruptedException {

        driver.navigate().to("https://the-internet.herokuapp.com/large");

        WebElement table = driver.findElement(By.id("large-table"));

        waitForPageToLoad(driver);

        ((JavascriptExecutor)driver).executeScript(SCRIPT,table);
    }

    public static void waitForPageToLoad(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ExpectedCondition<Boolean> jsLoad = d -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        wait.until(jsLoad);
    }
}
