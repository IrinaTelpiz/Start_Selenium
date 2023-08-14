package com.Selenium.Test;

import com.selenium.UI_Test.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DarwinTest {

    private static final String URL = "https://darwin.md/";
    private static final String EMAIL = "test@test.com";
    private static final String PASSWORD = "test223";

    WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Setting web driver");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

    }

    @After
    public void tearDown(){
        System.out.println("Closing web driver");
        driver.quit();
    }

    @Test
    public void clickOnRegistration() throws InterruptedException {

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*span[contains(text(), 'Caută produse')]")).sendKeys("iphone");
//        WebElement btn = driver.findElement(By.id("reg-link-header"));
//        btn.click();

    }
//
//    @Test
//    public void loginTest(){
//
//        driver.findElement(By.id("user_email_login")).sendKeys(EMAIL);
//        driver.findElement(By.id("user_password")).sendKeys(PASSWORD);
//        driver.findElement(By.id("user_submit")).click();
//    }

    @Test
    public void loginTestPOM() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(EMAIL,PASSWORD);
    }


}
