package Embassy_book_appointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class appointment {

    @Test(invocationCount=5)
    public void Test(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vfsvisaonline.com/Netherlands-Global-Online-Appointment_Zone3/AppScheduling/AppWelcome.aspx?P=wClNiU4hmfBtBSfTMP3wVgWTA8%2bQhVYKJGe%2fACjrucI%3d");

        WebElement makeAnAppointment = driver.findElement(By.id("plhMain_lnkSchApp"));
        makeAnAppointment.click();

        Select selectVisaType = new Select(driver.findElement(By.id("plhMain_cboVisaCategory")));
        selectVisaType.selectByValue("912");

        WebElement submit = driver.findElement(By.id("plhMain_btnSubmit"));
        submit.click();

        String messageOriginal = driver.findElement(By.id("plhMain_lblMsg")).getText();
        String currentMessage = "No hay fechas disponibles para su solicitud.";

        Assert.assertEquals(messageOriginal, currentMessage);
        System.out.println("malesef, tekrar dene");

        driver.quit();
    }


}
