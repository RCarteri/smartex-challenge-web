package stepDefinitions.register;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ResourceBundle;

public class Hooks extends BaseClass{
    @Before
    public void setup() {
        rb = ResourceBundle.getBundle("config");
        logger = LogManager.getLogger(this.getClass());

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(rb.getString("url"));
        driver.manage().window().maximize();
    }

    @After
    public void teadDown() {
        driver.quit();
    }
}
