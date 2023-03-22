package map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class RegisterMap extends BasePage {
    protected RegisterMap(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Sign In")
    WebElement linkSignIn;

    @FindBy(linkText = "Create a new account")
    WebElement linkCreateAccount;

    @FindBy(id = "user[first_name]")
    WebElement inputFirstName;

    @FindBy(id = "user[last_name]")
    WebElement inputLastName;

    @FindBy(id = "user[email]")
    WebElement inputEmail;

    @FindBy(id = "user[password]")
    WebElement inputPassword;

    @FindBy(id = "user[terms]")
    WebElement cbTerms;

    @FindBy(css = "button.button-primary")
    WebElement btnSubmit;

    @FindBy(css = ".form-error__list-item")
    List<WebElement> errorMessage;

    protected void clickSignIn() {
        linkSignIn.click();
    }

    protected void clickRegistration() {
        clickJS(linkCreateAccount);
    }

    public WebElement getInputFirstName() {
        return inputFirstName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void clickCbTerms() {
        clickJS(cbTerms);
    }

    public void clickBtnSubmit() {
        clickJS(btnSubmit);
    }

    public List<WebElement> getErrorMessage() {
        return errorMessage;
    }
}
