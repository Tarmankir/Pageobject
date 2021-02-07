import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "input[aria-label='E-mail или мобильный телефон']")
    private WebElement Login;

    @FindBy(css = "input[aria-label='Пароль']")
    private WebElement Pass;

    @FindBy(css = "button[aria-label='Войти']")
    private WebElement Button;

    public LoginPage typeLogin(String login){
        Login.sendKeys(login);
        return this;
    }

    public LoginPage typePass(String pass){
        Pass.sendKeys(pass);
        return this;
    }

    public void clickLogin(){
        Button.click();
    }

}