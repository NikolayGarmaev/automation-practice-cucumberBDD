package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.SeleniumUtils;
import utils.WebDriverManager;

public class UserDBSteps {
    @Then("Verifies title of the page is {string}")
    public void verifies_title_of_the_page_is(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }

    @And("User switches to new window")
    public void userSwitchesToNewWindow() {
        Assert.fail();
        SeleniumUtils.switchToNextWindow();
    }
}
