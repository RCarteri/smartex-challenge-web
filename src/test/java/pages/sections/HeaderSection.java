package pages.sections;

import map.HeaderMap;
import org.openqa.selenium.WebDriver;

public class HeaderSection extends HeaderMap {
    public HeaderSection(WebDriver driver) {
        super(driver);
    }

    public boolean isBtnMyDashboardDisplayed(){
        return getBtnMyDashboard().isDisplayed();
    }

    public void accessLoginPage() {
        clickSignIn();
    }
}
