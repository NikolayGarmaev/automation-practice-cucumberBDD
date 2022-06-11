package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.TablesPage;
import pages.UserMgtPage;

public class HomeSteps {


    @Then("Verify PHP Travels link is displayed")
    public void verifyPHPTravelsLinkIsDisplayed() {
        Assert.assertTrue(HomePage.getPage().phpLink.isDisplayed());
    }

    @Given("User opens {string} page")
    public void userOpensPage(String pageName) {
        switch (pageName.toLowerCase()) {
            case "pop-up":
                HomePage.getPage().popUpBtn.click();
                break;
            case "table":
                TablesPage.getPage().tablesBtn.click();
                break;
            case "user-mgt":
                UserMgtPage.getPage().userMgtBtn.click();
                break;
            default:
                System.out.println("Invalid page name");
        }
    }

}
