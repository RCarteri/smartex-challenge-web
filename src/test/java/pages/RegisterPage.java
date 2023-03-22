package pages;

import map.RegisterMap;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RegisterPage extends RegisterMap {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void accessLoginPage() {
        clickSignIn();
    }

    public void accessRegistrationPage() {
        clickRegistration();
    }

    public void fillForm(String fName, String lName, String email, String password) {
        getInputFirstName().sendKeys(fName);
        getInputLastName().sendKeys(lName);
        getInputEmail().sendKeys(generateEmail(email));
        getInputPassword().sendKeys(password);
        clickCbTerms();
        clickBtnSubmit();
    }

    public boolean isErrorMessageDisplayed(String errorMessage) {
        List<String> messages = List.of(errorMessage.split("/"));
        List<String> errors = new ArrayList<>();

        for (WebElement webElement : getErrorMessage())
            errors.add(webElement.getText());
        return CollectionUtils.isEqualCollection(messages, errors);
    }

    private String generateEmail(String email){
        if (email.contains("@"))
            email = RandomStringUtils.randomAlphabetic(3) + email;
        return email;
    }
}
