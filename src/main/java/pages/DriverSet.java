package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class DriverSet {

    public abstract void driverSet() {
        System.setProperty();
        WebDriver driver = new FirefoxDriver();
        driver.get();
    }
}