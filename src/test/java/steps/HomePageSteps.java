package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;
import support.BaseSteps;

public class HomePageSteps extends BaseSteps {

    public static HomePage homePage = new HomePage(driver);

    @Given("^User access the Dextra website$")
    public void userAccessTheDextraWebsite() {
        homePage.openPage();
    }

    @Given("^User clicks on Search icon button$")
    public void userClicksOnSearchIconButton() {
        homePage.clickSeachIcon();
    }

    @And("^User enters \"([^\"]*)\" on search field$")
    public void userEntersOnSearchField(String value) throws Throwable {
        homePage.enterSearchText(value);
    }

    @And("^User press Enter key$")
    public void userPressEnterKey() {
        homePage.pressEnterkey();
    }
}
