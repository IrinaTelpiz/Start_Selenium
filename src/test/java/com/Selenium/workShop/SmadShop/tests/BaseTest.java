package com.Selenium.workShop.SmadShop.tests;

import com.selenium.workShop.SmadShop.driver.CustomWebDriverManager;
import com.selenium.workShop.SmadShop.utils.PropertyReader;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private  static final String URL = PropertyReader.getConfigProperty("url");
//    private  static final String URL = "http://smadshop.md/";
    private static WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Setting web driver");
        driver = CustomWebDriverManager.getDriver();
        driver.get(URL);

    }

    @After
    public void tearDown(){
        System.out.println("Closing web driver");
        CustomWebDriverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
