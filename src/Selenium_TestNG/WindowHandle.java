package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/browser-windows");

       driver.findElement(By.id("tabButton")).click();
//      driver.findElement(By.id("windowButton")).click();
//        driver.findElement(By.id("messageWindowButton")).click();

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);
        System.out.println(driver.findElement(By.className("main-header")).getText());
        System.out.println();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                System.out.println(handle);
                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
                System.out.println();
                driver.close();
            }
        }

        driver.switchTo().window(mainWindowHandle);
        System.out.println(mainWindowHandle);
        System.out.println(driver.findElement(By.className("main-header")).getText());
        System.out.println();

        driver.quit();
    }
}