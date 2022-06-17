package Thursday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirstcalss {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://it-it.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(7000);
        WebElement cookies =driver.findElement(By.xpath("//button[contains(text(),'Consenti cookie essenziali e facoltativi')]"));
        cookies.click();
        //System.out.println("");out
    }
}
