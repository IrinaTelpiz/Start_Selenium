package com.Selenium.tutorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8_fileUpload {

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
    public void fileUploadTest() throws InterruptedException {

        driver.navigate().to("https://the-internet.herokuapp.com/upload");

        WebElement fileUpload = driver.findElement(By.id("file-upload"));

        try{
            fileUpload.sendKeys("C:\\Users\\irina\\IdeaProjects\\Start_Selenium\\src\\main\\resources\\Uploaded");

            driver.findElement(By.id("file-submit")).click();

        }  finally {
            driver.quit();
        }



        
    }
}
