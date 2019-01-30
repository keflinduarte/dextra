package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Contato;
import support.BaseSteps;

public class ContatoSteps extends BaseSteps {

    public static Contato contato = new Contato(driver);

    @Given("^User clicks on Blog menu button$")
    public void userClicksOnBlogMenuButton() {
        contato.clickBlogBtn();
    }

    @And("^User clicks on Testes automatizados no Android article$")
    public void userClicksOnTestesAutomatizadosNoAndroidArticle() {
        contato.clickTesteArticle();
    }

    @And("^User checks the \"([^\"]*)\" form$")
    public void userChecksTheForm(String value) throws Throwable {
        Assert.assertEquals(value, contato.checkEntreEmContato());
    }

    @And("^User clicks on Submit button$")
    public void userClicksOnSubmitButton() {
        contato.clickSubmitBtn();
    }

    @And("^User insert \"([^\"]*)\" as name$")
    public void userInsertAsName(String value) throws Throwable {
        contato.insertName(value);
    }

    @And("^User insert \"([^\"]*)\" as email$")
    public void userInsertAsEmail(String value) throws Throwable {
        contato.insertEmail(value);
    }

    @And("^User insert \"([^\"]*)\" as phone number$")
    public void userInsertAsPhoneNumber(String value) throws Throwable {
        contato.insertPhone(value);
    }

    @And("^User insert \"([^\"]*)\" as message$")
    public void userInsertAsMessage(String value) throws Throwable {
        contato.insertMessage(value);
    }

    @Then("^User checks the message \"([^\"]*)\"$")
    public void userChecksTheMessage(String value) throws Throwable {
        Assert.assertEquals(value, contato.checkRobotMessage());
    }

    @And("^User clicks on Nao sou um robo button$")
    public void userClicksOnNaoSouUmRoboButton() {
        contato.clickRobotCheck();
    }
}
