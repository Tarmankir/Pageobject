import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/knosov/IdeaProjects/N1/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.rabota.ru/passport/sign-in/");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.typeLogin("artol@bk.ru");

        loginPage.typePass("test");

        loginPage.clickLogin();
    }
}