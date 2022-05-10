package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleYandex {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.yandex.ru");

        WebElement inbox = driver.findElement(By.xpath("//a[@data-statlog=\"notifications.mail.logout.mail\"]"));
        inbox.click();


        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);


        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                System.out.println(handle);
                WebElement username = driver.findElement(By.id("passp-field-login"));
                username.sendKeys("hakki");
            }
        }

        driver.quit();
    }
}