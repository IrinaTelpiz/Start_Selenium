package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class T1_addRemoveElements {

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
    public void checkButtonName(){
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement btn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        assertEquals("Button has been renamed","Add Element", btn.getText());

    }
}
