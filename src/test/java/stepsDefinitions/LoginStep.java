package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.sections.HeaderSection;

public class LoginStep extends BaseClass {
    private final LoginPage lp = new LoginPage(driver);

    @And("I access the login page")
    public void iAccessTheLoginPage() {
        logger.info("Accessing login page");
        HeaderSection hs = new HeaderSection(driver);
        hs.accessLoginPage();
    }

    @When("I fill in the login form")
    public void iFillInTheLoginForm() {
        logger.info("Filling out the form");
        String email = rb.getString("email");
        String password = rb.getString("password");
        lp.login(email, password);
    }

    @When("I fill in the login form with the data email {string} and password {string}")
    public void iFillInTheLoginFormWithTheDataEmailAndPassword(String email, String password) {
        logger.info("Filling out the form");
        lp.login(email, password);
    }
}
