package Embassy_book_appointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class appointment_istanbul {

    @Test()
    public void Test(){
        for (int i = 0; i < 3; i++) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.vfsvisaonline.com/Netherlands-Global-Online-Appointment_Zone2/AppScheduling/AppWelcome.aspx?P=Y83R%2fPGUiM5WxqKHxt0UdFBIUihbM+84UtpqC9pe4gU%3d");

            WebElement makeAnAppointment = driver.findElement(By.id("plhMain_lnkSchApp"));
            makeAnAppointment.click();

            Select selectEmbassyIstanbul = new Select(driver.findElement(By.id("plhMain_cboVAC")));
            selectEmbassyIstanbul.selectByValue("93");

            WebElement submitButton = driver.findElement(By.id("plhMain_btnSubmit"));
            submitButton.click();

            WebElement numberOfTheApplicants = driver.findElement(By.id("plhMain_tbxNumOfApplicants"));
            numberOfTheApplicants.clear();
            numberOfTheApplicants.sendKeys("4");

            Select selectVisaType = new Select(driver.findElement(By.id("plhMain_cboVisaCategory")));
            selectVisaType.selectByValue("8");

            WebElement continueButton = driver.findElement(By.id("plhMain_btnSubmit"));
            continueButton.click();

//            Select unvanSec = new Select(driver.findElement(By.id("plhMain_repAppVisaDetails_cboTitle_0")));
//            unvanSec.selectByValue("MR.");
//            WebElement givenName = driver.findElement(By.id("plhMain_repAppVisaDetails_tbxFName_0"));
//            givenName.sendKeys("hakki");
//            WebElement surname= driver.findElement(By.id("plhMain_repAppVisaDetails_tbxLName_0"));
//            surname.sendKeys("karadayi");
//            WebElement phoneNumber= driver.findElement(By.id("plhMain_repAppVisaDetails_tbxContactNumber_0"));
//            phoneNumber.sendKeys("905051234568");
//            WebElement emailAdress = driver.findElement(By.id("plhMain_repAppVisaDetails_tbxEmailAddress_0"));
//            emailAdress.sendKeys("aa@gmail.com");
//            Select plsSelectConfirm = new Select(driver.findElement(By.id("plhMain_cboConfirmation")));
//            plsSelectConfirm.selectByValue("1");
//            WebElement submit = driver.findElement(By.id("plhMain_btnSubmit"));
//            submit.click();


            String messageOriginal = driver.findElement(By.id("plhMain_lblMsg")).getText();
            String currentMessage = "No date(s) available for appointment.";

            Assert.assertEquals(messageOriginal, currentMessage);

            driver.quit();
        }
    }


}
