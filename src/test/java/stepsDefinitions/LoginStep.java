package stepsDefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep extends BaseClass {
    private final LoginPage lp = new LoginPage(driver);

    @When("I fill in the login form")
    public void iFillInTheLoginForm() {
        String email = rb.getString("email");
        String password = rb.getString("password");
        lp.login(email, password);
    }
}
