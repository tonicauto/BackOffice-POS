package homepage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class HomePageElements extends UIInteractionSteps {
    public WebElementFacade getOkButton() { return $(".mat-button-wrapper"); }
}
