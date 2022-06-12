package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import pages.PopupPage;
import pages.UserMgtPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

public class PopupSteps implements CommonPage {

    @And("User clicks on {string} button")
    public void userClicksOnButton(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))).click();
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
