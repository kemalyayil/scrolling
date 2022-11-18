package Selenium_TestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EnterTabETCBasma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://vamospanish.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollBy(0,2500)");
        WebElement registerNow = driver.findElement(By.xpath("//*[@id=\"genesis-content\"]/article/div/div[1]/div[12]/div/div[2]/div/div[1]/div/div[4]/div/div/a"));
        registerNow.click();


//        WebElement subject = driver.findElement(By.id("subjectsInput"));
//        subject.sendKeys("English");
//        subject.sendKeys(Keys.TAB);
    }
}
