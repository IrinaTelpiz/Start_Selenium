package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class T6_Allerts {

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

        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        if (buttons.size() == 3){
            buttons.get(2).click();
            Thread.sleep(5000);
        }

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());
        Thread.sleep(5000);

        alert.sendKeys("Hello there!");
        Thread.sleep(5000);
        alert.accept();
        Thread.sleep(5000);


        
    }
}
