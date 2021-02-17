package settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

public abstract class DriverSet {

    @BeforeClass
    public void beforeClass() {
        WebDriverManager.firefoxdriver().setup();
    }
}