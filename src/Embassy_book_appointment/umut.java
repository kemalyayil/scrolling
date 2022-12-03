package Embassy_book_appointment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class umut {

    @Test()
    public void Test(){
        for (int i = 0; i < 10; i++) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Desktop\\sadece drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://titulosvalidez.educacion.gob.ar/validez/detitulos/noaccess.php?msj=Lamentablemente%20no%20hay%20turnos%20disponibles%20debido%20al%20alto%20nivel%20de%20demanda.%3Cbr%3EPor%20favor,%20vuelva%20a%20intentar%20en%20otro%20momento");


            String messageOriginal = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]")).getText();
            String currentMessage = "Lamentablemente no hay turnos disponibles debido al alto nivel de demanda.\n" +
                    "Por favor, vuelva a intentar en otro momento";
            Assert.assertEquals(messageOriginal, currentMessage);
            System.out.println("malesef, tekrar dene");
//
            driver.quit();
        }
    }


}
