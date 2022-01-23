import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.sql.Driver;
import java.util.List;

public class CompareToMethodu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://booking.com");

        // asagidaki list in locator i hata verecek, cunku ondan once search kisimlari eksik
        List<WebElement> priceList = driver.findElements(By.xpath("//span[@class=\"fde444d7ef _e885fdc12\"]"));

        boolean ifLowerToHigher = false;
        for (int i = 1; i < priceList.size(); i++) {
            WebElement previousElement = priceList.get(i-1);
            WebElement currentElement = priceList.get(i);
            if (previousElement.getText().compareTo(currentElement.getText()) < 0){     // if strings are same = 0, if earlier -1, if later 1 values will be returned
                ifLowerToHigher = true;
            }
        }
        System.out.println("Result if it is ordered? : " + ifLowerToHigher);

        Assert.assertEquals(true,ifLowerToHigher);
    }

}
