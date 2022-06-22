package TestMonday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElement {
    // WebElement cookies =driver.findElement(By.xpath("//button[contains(text(),'Consenti cookie essenziali e facoltativi')]"));
    //  cookies.click();
WebDriver driver;
public LoginPageElement(WebDriver driver1){this.driver = driver1;}
    @FindBy(xpath = "//button[contains(text(),'Consenti cookie essenziali e facoltativi')]")

    WebElement cookies;

    public void Acceptcookies() {
        cookies.click();

    }
}

