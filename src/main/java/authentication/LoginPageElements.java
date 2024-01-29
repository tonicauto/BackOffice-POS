package authentication;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class LoginPageElements extends UIInteractionSteps {
    public WebElementFacade getLoginUserNameField() { return $("#exampleInputEmail1"); }

    public WebElementFacade getLoginPasswordField() { return $("#exampleInputPassword1"); }

    public WebElementFacade getLoginSignInButton() { return $(".mat-button-wrapper"); }
}
