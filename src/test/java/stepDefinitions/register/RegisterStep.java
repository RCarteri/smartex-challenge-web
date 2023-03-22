package stepDefinitions.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import pages.sections.HeaderSection;

public class RegisterStep extends BaseClass {
    private final RegisterPage rp = new RegisterPage(driver);

    @And("I access the login page")
    public void iAccessTheLoginPage() {
        rp.accessLoginPage();
    }

    @And("I access the registration page")
    public void iAccessTheRegistrationPage() {
        rp.accessRegistrationPage();
    }

    @When("I fill in the form to create a new user with the data first name {string}, last name {string}, email {string} and password {string}")
    public void iFillInTheFormToCreateANewUserWithTheDataFirstNameLastNameEmailAndPassword(String fName, String lName, String email, String password) {
        rp.fillForm(fName, lName, email, password);
    }

    @Then("the item My Dashboard should appear in the header of the page")
    public void theItemMyDashboardShouldAppearInTheHeaderOfThePage() {
        boolean btnMyDashboardDisplayed = new HeaderSection(driver).isBtnMyDashboardDisplayed();
        Assert.assertTrue(btnMyDashboardDisplayed);
    }

    @Then("the error message {string} should appear in the page")
    public void theErrorMessageShouldAppearInThePage(String errorMessage) {
        Assert.assertTrue(rp.isErrorMessageDisplayed(errorMessage));
    }
}
