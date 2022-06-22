package Trenitalia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Biglietti {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void acquisition() throws InterruptedException {
        driver.get("https://www.trenitalia.com/it/informazioni/acquisti_online.html");
        WebElement cookies = driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']"));
        cookies.click();
        WebElement andata = driver.findElement(By.xpath("//input[@id='biglietti_fromNew']"));
        andata.sendKeys("Napoli Centrale");
        WebElement ritorno = driver.findElement(By.xpath("//input[@id='biglietti_toNew']"));
        ritorno.sendKeys("Milano Centrale");
        WebElement andataritorno = driver.findElement(By.xpath("//span[@id='biglietti_ar_circular']"));
        andataritorno.click();
        WebElement returnDateVISIBLE = driver.findElement(By.xpath("//input[@id='biglietti_data_aVISIBLE']"));
        returnDateVISIBLE.click();
        WebElement dataritorno = driver.findElement(By.xpath("(//a[contains(text(),'30')])[1]"));
        dataritorno.click();
        WebElement bttCerca = driver.findElement(By.xpath("//button[@class='btn btn-cerca']"));
        bttCerca.click();

        Thread.sleep(10000);

        //Go
        WebElement info = driver.findElement(By.xpath("(//span[@class='icon-3 text-gray icon-collapse arrow-height'])[1]"));
        info.click();
        WebElement prezzobigliettoA = driver.findElement(By.xpath("(//div[@class=au-target col col-body rounded-bottom cursor-pointer active ml-0'])[1]"));
        prezzobigliettoA.click();

        //Back
        WebElement Vaialritorno = driver.findElement(By.xpath("//div[contains(text(),'Vai al ritorno')]"));
        Vaialritorno.click();

        //popup

        //if(driver.findElement(By.xpath("//div/body3[@class='center au-target'])[1]")){

           // WebElement proseguo = driver.findElement(By.xpath("//div[contains(text(),'PROSEGUO SENZA CAMBIARE')]"));
           //proseguo.click();

      //  }
  // else{
            //system.out.println("element not present -- so it entered the else loop");
           // WebElement = driver.

        //}
        WebElement senzacambiare = driver.findElement(By.xpath("(//button[contains(text(),'PROSEGUO SENZA CAMBIARE')])[1]"));
        senzacambiare.click();

        //bigliettoritorno
        WebElement info2 = driver.findElement(By.xpath("(//span[@class='icon-3 text-gray icon-collapse arrow-height'])[2]"));
        info2.click();

        WebElement prezzobigliettoR = driver.findElement(By.xpath("(//div[contains(text(),'103,00€')])[1]"));
        prezzobigliettoR.click();

        WebElement continua2 = driver.findElement(By.xpath("//div[contains(text(),'Continua')]"));
        continua2.click();

        WebElement senzacambiare2 = driver.findElement(By.xpath("(//button[contains(text(),'PROSEGUO SENZA CAMBIARE')])[1]"));
        senzacambiare2.click();

        WebElement senzalogin = driver.findElement(By.xpath("//button[contains(text(),'CONTINUA SENZA LOGIN')]"));
        senzalogin.click();


        //Thread.sleep(10000);

    }

    @AfterTest
    public void close(){
        driver.quit();
    }


}

