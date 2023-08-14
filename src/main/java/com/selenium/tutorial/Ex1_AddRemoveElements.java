package com.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_AddRemoveElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//        Thread.sleep(5000);
//        WebElement btn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
//        System.out.println(btn.getText());
//        btn.click();
//        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.quit();


    }
}
