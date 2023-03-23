package pages;

import map.LoginMap;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginMap {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        getInputEmail().sendKeys(email);
        getInputPassword().sendKeys(password);
        clickBtnSignIn();
    }
}
