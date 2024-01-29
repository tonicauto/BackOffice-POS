package authentication;

import common.Base;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import org.openqa.selenium.StaleElementReferenceException;

public class LoginPage extends Base {
    LoginPageElements loginPageElements;

    @Step("Navigate to Login Page")
    public void navigateToLoginScreen() {
        open();
    }

    @Step("Login with a valid username and a valid password")
    public void login(String username, String password) {
        waitForVisibilityOfElement(loginPageElements.getLoginUserNameField());
        loginPageElements.getLoginUserNameField().sendKeys(username);
        loginPageElements.getLoginPasswordField().sendKeys(password);
        loginPageElements.getLoginSignInButton().click();
    }
}