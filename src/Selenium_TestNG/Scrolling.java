package Selenium_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://amazon.com");

//        Actions actions = new Actions(driver);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();

        JavascriptExecutor jsExecutor = ((JavascriptExecutor)driver);
//        Thread.sleep(3000);
        jsExecutor.executeScript("window.scrollTo(0,500)");
    }
}
