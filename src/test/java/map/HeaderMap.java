package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HeaderMap extends BasePage {
    public HeaderMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "My Dashboard")
    WebElement btnMyDashboard;

    public WebElement getBtnMyDashboard() {
        return btnMyDashboard;
    }
}
