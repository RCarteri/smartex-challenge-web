package stepsDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.ResourceBundle;

public class BaseClass {
    // to read config.properties
    public static ResourceBundle rb = ResourceBundle.getBundle("config");

    // for Logging
    public Logger logger = LogManager.getLogger(this.getClass());
    public static WebDriver driver;
}
