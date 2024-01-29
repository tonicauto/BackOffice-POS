package authentication;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginTest {

    @Steps
    LoginPage loginPage;

    @Given("Navigate to login screen")
    public void navigateToSignInScreen() {
        loginPage.navigateToLoginScreen();
    }

    @When("I use Valid username {string} and Valid password {string}")
    public void i_use_valid_username_and_valid_password(String username, String password) {
        loginPage.login(username,password);
    }
}
