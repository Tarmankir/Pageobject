package settings;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.testng.annotations.BeforeMethod;

public abstract class DriverSet {

    @BeforeMethod
    public void driverSet() {
        ChromeDriverManager.firefoxdriver().setup();
   }
}