package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {


    @Then("Verify PHP Travels link is displayed")
    public void verifyPHPTravelsLinkIsDisplayed() {
        Assert.assertTrue(HomePage.getPage().phpLink.isDisplayed());
    }

    @Given("User opens {string} page")
    public void userOpensPage(String pageName) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, pageName))).click();
    }

}
