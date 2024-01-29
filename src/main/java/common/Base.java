package common;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Base extends PageObject {

    /**
     * This method performs a click by JavaScript Executor, which would normally be interrupted by
     * selenium driver click.
     * @param element The element on which the click will be performed.
     */
    public void clickByJavaExecutor(WebElementFacade element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    /**
     * This method scrolls the web page to specified web element on the page.
     * @param element The element the page will scroll to.
     */
    public void scrollToElement(WebElementFacade element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * This method will wait until an element is visible on the page.
     * @param element The element for which wait in on.
     */
    public void waitForVisibilityOfElement(WebElementFacade element) {
        waitForCondition().until(visibilityOf(element));
    }
}