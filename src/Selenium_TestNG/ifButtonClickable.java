package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ifButtonClickable {
    @Test
    public void Test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://test.kese.nl/forgot_password");

        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        boolean enabled = button.isEnabled();
        System.out.println("enabled = " + enabled);
    }
}
