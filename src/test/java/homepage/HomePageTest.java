package homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HomePageTest {

    @Steps
    HomePage homePage;

    @Then("Click on Ok button")
    public void clickOnOkButton() {
        homePage.clickOnOkButton();
    }
}

