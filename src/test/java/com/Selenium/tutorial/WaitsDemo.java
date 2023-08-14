package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitsDemo {

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
    public void testImplicitWait() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
        WebElement element = driver.findElement(By.name("q"));
        element.click();

    }

    @Test
    public void testExplicitWait(){
        driver.get("https://www.google.com/");
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(15000));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("q")));
    }

    @Test
    public void testFluentWait(){
        driver.get("https://www.google.com/");
        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
        WebElement element = wait.until(driver -> {
           return driver.findElement(By.name("q"));
        });
    }

    @Test
    public void testNoWait(){
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.click();
    }
}
