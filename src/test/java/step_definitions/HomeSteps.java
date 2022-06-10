package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utils.ConfigReader;
import utils.WebDriverManager;

public class HomeSteps {


    @Given("User navigates to www.automation.techleadacademy.io")
    public void user_navigates_to_http_automation_techleadacademy_io() {
        WebDriverManager.getDriver().get(ConfigReader.readProperty("url"));
    }

    @Then("Verify PHP Travels link is displayed")
    public void verifyPHPTravelsLinkIsDisplayed() {
        Assert.assertTrue(HomePage.getPage().phpLink.isDisplayed());
    }

    @And("Closes driver")
    public void closesDriver() {
        WebDriverManager.getDriver().close();
    }
}
