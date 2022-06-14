package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.UserMgtPage;
import utils.WebDriverManager;

import java.util.List;

public class UserMgtSteps implements CommonPage {
    UserMgtPage userMgtPage;

    public UserMgtSteps(){
        userMgtPage = new UserMgtPage();
    }

    @Then("Verify input field {string} is displayed")
    public void verify_input_field_is_displayed(String fieldName) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(
                XPATH_TEMPLATE_INPUT_FIELD, fieldName))));
    }

    @Then("Verify following input fields are displayed:")
    public void verifyFollowingInputFieldsAreDisplayed(List<String> data) {
        for(String each: data){
            Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(
                    XPATH_TEMPLATE_INPUT_FIELD, each))));
        }
    }

    @Then("Verify {string} selection is enabled")
    public void verifySelectionIsEnabled(String selectName) {
        WebElement element;

        switch (selectName.toLowerCase()){
            case "role": element = userMgtPage.selectRole;
            break;
            default: element = null;
        }

        Assert.assertTrue(WebDriverManager.isEnabled(element));
    }



}
