package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BusinessCases;
import support.BaseSteps;

public class BusinessCasesSteps extends BaseSteps {

    public static BusinessCases businessCases = new BusinessCases(driver);

    @Given("^User clicks on Conheça nossos Cases button$")
    public void userClicksOnConheçaNossosCasesButton() {
        businessCases.clickConhecaCases();
    }

    @And("^User clicks on Carregar Mais button$")
    public void userClicksOnCarregarMaisButton() {
        businessCases.clickCarregarMais();
    }

    @When("^User clicks on App Show do Milhão$")
    public void userClicksOnAppShowDoMilhão() {
        businessCases.clickShowMilhaoCase();
    }

    @Then("^User checks the text \"([^\"]*)\"$")
    public void userChecksTheText(String value) throws Throwable {
        Assert.assertEquals(value, businessCases.checkShowMilhaoCase());
    }
}
