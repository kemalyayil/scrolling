package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dollar_converter {
    ///td[@data-order]
    @Test
    public void Test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.infodolar.com/cotizacion-dolar-blue.aspx");
        WebElement close = driver.findElement(By.id("p-close"));
        close.click();


        String dollar_price_buy = driver.findElement(By.xpath("//td[@data-order]")).getText();
        String dollar_price_sell = driver.findElement(By.xpath("(//td[@data-order])[2]")).getText();

        System.out.println("dollar_price_sell = " + dollar_price_sell);
        System.out.println("dollar_price_buy = " + dollar_price_buy);

        System.out.println("hakki = " + dollar_price_buy + dollar_price_sell);


    }
}
