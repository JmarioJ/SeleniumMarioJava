package Onlyme;


import TestMonday.LoginPageElement;
import TestMonday.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class onlyme {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        // WebDriver driver=new ChromeDriver();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void spellchecker() throws InterruptedException {
        driver.get("https://www.google.com/search?q=traduttore");
        WebElement cookies = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        cookies.click();
        WebElement word = driver.findElement(By.xpath("//textarea[@id='tw-source-text-ta']"));
        word.sendKeys("meat");

        Thread.sleep(3000);


    }

@AfterTest
    public void close(){
        driver.quit();
}
}










