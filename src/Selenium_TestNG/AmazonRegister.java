package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonRegister {

    @Test
    public void Test(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://amazon.com");

    WebElement hoverOverSignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    Actions actions = new Actions(driver);
    actions.moveToElement(hoverOverSignIn).perform();

    WebElement startHere = driver.findElement(By.partialLinkText("Start"));
    startHere.click();


    WebElement yourNameInput = driver.findElement(By.id("ap_customer_name"));
    yourNameInput.sendKeys("cengiz");

    WebElement emailOrPhone = driver.findElement(By.id("ap_email"));
    emailOrPhone.sendKeys("cengiz@cengiz.com");

    WebElement password = driver.findElement(By.id("ap_password"));
    password.sendKeys("12345cengiz");

    WebElement reEnterPassword = driver.findElement(By.id("ap_password_check"));
    reEnterPassword.sendKeys("12345cengiz");

    WebElement continueButton = driver.findElement(By.id("continue"));
    continueButton.click();


    WebElement puzzle = driver.findElement(By.xpath("//span[@class='a-size-large']"));
    String expected = "Solve this puzzle to protect your account";
    String actual = puzzle.getText();
    System.out.println(actual);

    Assert.assertEquals(expected,actual);









}
}
