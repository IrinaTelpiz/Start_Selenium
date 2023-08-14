package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class T7_modalsInteraction {

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
    public void modalTest() throws InterruptedException {

        driver.navigate().to("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");

        String currentWindow = driver.getWindowHandle();

        driver.findElement(By.cssSelector("button[data-toggle='modal']")).click();

        WebElement modal = driver.findElement(By.className("modal-content"));

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowName : windowHandles){
            if (!windowName.equals(currentWindow)){
                driver.switchTo().window(windowName);
                break;
            }
        }

        Thread.sleep(5000);
        modal.findElement(By.tagName("button")).click();
        Thread.sleep(5000);

        driver.switchTo().window(currentWindow);
        
    }
}
