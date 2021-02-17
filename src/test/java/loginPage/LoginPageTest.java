package loginPage;

import enums.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import settings.DriverSet;
import pages.LoginPage;

public class LoginPageTest extends DriverSet {

    WebDriver driver = new FirefoxDriver();

    @BeforeMethod
    public void driverSet() {

        driver.get("https://forum.awd.ru/ucp.php?mode=login&redirect=.%2Findex.php");
    }

    @Test
    public void loginPageTest() {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginIn(Credentials.TEST1);

        loginPage.clickLogin();

        loginPage.checkButtonExit("Выход [ IVakidov ]");
    }
}