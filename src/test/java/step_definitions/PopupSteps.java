package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.PopupPage;
import utils.SeleniumUtils;

public class PopupSteps {

    @When("User opens Pop-Up page")
    public void userOpensPopUpPage() {
        HomePage.getPage().popUpBtn.click();
    }


    @And("User clicks on Message button")
    public void userClicksOnMessageButton() {
        PopupPage.getPage().messageBtn.click();
    }

    @Then("Verify New Message header is displayed")
    public void verifyNewMessageHeaderIsDisplayed() {
        SeleniumUtils.waitForElementVisibility(PopupPage.getPage().messageHeaderTxt);
        Assert.assertTrue(PopupPage.getPage().messageHeaderTxt.isDisplayed());
    }

    @When("User click on BMI Calculator button")
    public void user_click_on_bmi_calculator_button() {
        PopupPage.getPage().bmiCalculatorBtn.click();
    }
    @Then("Verify BMI Calculator header is displayed")
    public void verify_bmi_calculator_header_is_displayed() {
        SeleniumUtils.sleep(1000L);
        Assert.assertTrue(PopupPage.getPage().getBmiCalculatorHeaderTxt.isDisplayed());
    }
}
