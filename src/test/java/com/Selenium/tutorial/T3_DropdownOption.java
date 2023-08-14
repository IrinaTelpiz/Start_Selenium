package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class T3_DropdownOption {

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

        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));

        List<WebElement> options = select.getOptions();

        for (WebElement option : options){
            System.out.println("Available options: " + option.getText());
        }

        System.out.println("Is this a multi-select: " + select.isMultiple());

        select.selectByValue("1");
        Thread.sleep(5000);
        select.selectByVisibleText("Option 2");
        Thread.sleep(5000);
        select.selectByIndex(1);
        Thread.sleep(5000);

        
    }
}
