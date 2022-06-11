package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.WebDriverManager;

public class UserDBSteps {
    @Then("Verifies title of the page is {string}")
    public void verifies_title_of_the_page_is(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }
}
