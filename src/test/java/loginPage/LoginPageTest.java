package loginPage;

import enums.Credentials;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class LoginPageTest {

    @Test
    public void loginPageTest() {
        System.setProperty("webdriver.gecko.driver", "/home/knosov/IdeaProjects/N1/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://forum.awd.ru/ucp.php?mode=login&redirect=.%2Findex.php");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginIn(Credentials.TEST1);

        loginPage.clickLogin();
    }
}