package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PopupSteps {

    @When("User opens Pop-Up page")
    public void userOpensPopUpPage() {
        System.out.println("open pop up page");
    }


    @And("User clicks on Message button")
    public void userClicksOnMessageButton() {
        System.out.println("click Message button");
    }

    @Then("Verify New Message header is displayed")
    public void verifyNewMessageHeaderIsDisplayed() {
        System.out.println("Verified the header");
    }

    @When("User click on BMI Calculator button")
    public void user_click_on_bmi_calculator_button() {
        System.out.println("Clicked BMI button");
    }
    @Then("Verify BMI Calculator header is displayed")
    public void verify_bmi_calculator_header_is_displayed() {
        System.out.println("Verified BMI header");
        Assert.fail();
    }
}
