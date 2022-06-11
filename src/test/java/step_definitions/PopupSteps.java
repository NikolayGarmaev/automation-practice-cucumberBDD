package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.PopupPage;
import pages.UserMgtPage;
import utils.SeleniumUtils;

public class PopupSteps {

    @And("User clicks on {string} button")
    public void userClicksOnButton(String btn) {
        switch (btn.toLowerCase()) {
            case "message":
                PopupPage.getPage().messageBtn.click();
                break;
            case "bmi calculator":
                PopupPage.getPage().bmiCalculatorBtn.click();
                break;
            case "access db":
                UserMgtPage.getPage().accessDbBtn.click();
                break;
            default:
                System.out.println("Invalid button name");
        }
    }

    @Then("Verify New Message header is displayed")
    public void verifyNewMessageHeaderIsDisplayed() {
        SeleniumUtils.waitForElementVisibility(PopupPage.getPage().messageHeaderTxt);
        Assert.assertTrue(PopupPage.getPage().messageHeaderTxt.isDisplayed());
    }


    @Then("Verify BMI Calculator header is displayed")
    public void verify_bmi_calculator_header_is_displayed() {
        SeleniumUtils.sleep(1000L);
        Assert.assertFalse(PopupPage.getPage().getBmiCalculatorHeaderTxt.isDisplayed());

    }


}
