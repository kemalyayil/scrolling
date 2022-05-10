package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class techno {
    //https://campus.techno.study/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://campus.techno.study/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("mat-input-0"));
        username.sendKeys("kemalyayil@gmail.com");

        WebElement password = driver.findElement(By.id("mat-input-1"));
        password.sendKeys("566737ky");
        password.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        WebElement newMessageIcon = driver.findElement(By.xpath("(//button[@class=\"mat-focus-indicator mat-tooltip-trigger mat-button mat-icon-button mat-button-base\"])[2]"));
        newMessageIcon.click();

       }
}