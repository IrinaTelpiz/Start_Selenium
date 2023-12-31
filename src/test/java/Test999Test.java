// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Test999Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void test999() {
    driver.get("https://999.md/ru/");
    driver.manage().window().setSize(new Dimension(1171, 912));
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.cssSelector("#header a:nth-child(1) > img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.linkText("Транспорт")).click();
    driver.findElement(By.linkText("Легковые автомобили")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.id("js-search-input")).click();
    driver.findElement(By.id("js-search-input")).sendKeys("Toyota");
    driver.findElement(By.cssSelector(".header__search__button > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".ads-list-photo:nth-child(1) > .ads-list-photo-item:nth-child(3) .favorite-toggle"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".ads-list-photo:nth-child(1) > .ads-list-photo-item:nth-child(3) img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".ads-list-photo-item:nth-child(4) img")).click();
    vars.put("win691", waitForWindow(2000));
    driver.switchTo().window(vars.get("win691").toString());
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.cssSelector(".slick-cont-part-item:nth-child(3) img"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".is-big")).click();
    driver.findElement(By.cssSelector(".slick-cont-full-item:nth-child(5) img")).click();
    driver.findElement(By.cssSelector(".slick-cont-part-item:nth-child(7) img")).click();
    driver.findElement(By.cssSelector("svg")).click();
  }
}
