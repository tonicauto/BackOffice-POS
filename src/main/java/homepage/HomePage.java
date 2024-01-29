package homepage;

import common.Base;

public class HomePage extends Base {

    HomePageElements homePageElements;
    public void clickOnOkButton(){
        waitForVisibilityOfElement((homePageElements.getOkButton()));
        clickByJavaExecutor(homePageElements.getOkButton());
    }
}
