package Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kese_InternShip {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://test.kese.nl/new_home");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder=\"Email giriniz\"]"));
        email.sendKeys("kullanici1@gmail.com");


        WebElement sifre = driver.findElement(By.name("sifre"));
        sifre.sendKeys("1234");

        WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submit.click();

       Thread.sleep(2000);

        WebElement ilanVer = driver.findElement(By.partialLinkText("Ver"));
        ilanVer.click();

        WebElement homeExchange = driver.findElement(By.xpath("//div/div/div[1]/ul/li[1]/a"));
        homeExchange.click();

        WebElement mustakilEv = driver.findElement(By.xpath("//i[@class=\"fas fa-2x flaticon-home\"]"));
        mustakilEv.click();

        WebElement ilerle = driver.findElement(By.id("next"));
        ilerle.click();

        WebElement ilerle2 = driver.findElement(By.partialLinkText("İlerle"));
        ilerle2.click();

        WebElement ilerle3 = driver.findElement(By.partialLinkText("İlerle"));
        ilerle3.click();


        WebElement say = driver.findElement(By.xpath("//div[1]/div/div/span"));
        String baslangic = say.getText();
        System.out.println("baslangic = " + baslangic);

        for (int i = 0; i < 15; i++){
            //click the button
            WebElement bitis = driver.findElement(By.xpath("//button[@class=\"btn btn-light border py-1 px-2 ml-3\"]"));
            bitis.click();
            //wait 2 seconds
//            Thread.sleep(2000);
            //check that data is being generated correctly
            System.out.println("bitis = " + bitis.getText().indexOf(i));
        }
//        WebElement bul = driver.findElement(By.xpath("//div[1]/div/div/span"));



        driver.quit();
    }
}
