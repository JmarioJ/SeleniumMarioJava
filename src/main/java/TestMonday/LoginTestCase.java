package TestMonday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestCase {

    @Test
    public void spellchecker() throws InterruptedException {

        WebDriver driver = TestBase.startbrowser("CHROME","https://www.facebook.com/login/");
        LoginPageElement LGPage = PageFactory.initElements(driver, LoginPageElement.class);
        LGPage.Acceptcookies();
    }


}