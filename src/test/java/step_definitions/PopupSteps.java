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

    @Then("Verify {string} header is displayed")
    public void verifyHeaderIsDisplayed(String txt) {
        SeleniumUtils.waitForElementVisibility(WebDriverManager.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_TEXT, txt))));

        Assert.assertTrue(WebDriverManager.getDriver().findElement(By.xpath(
                String.format(XPATH_TEMPLATE_TEXT, txt))).isDisplayed());
    }
}
