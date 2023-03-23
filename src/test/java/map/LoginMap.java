package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginMap extends BasePage {
    public LoginMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user[email]")
    WebElement inputEmail;

    @FindBy(id = "user[password]")
    WebElement inputPassword;

    @FindBy(css = "button.button-primary")
    WebElement btnSignIn;

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void clickBtnSignIn() {
        clickJS(btnSignIn);
    }
}
