package step_definitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.SeleniumUtils;
import utils.WebDriverManager;

import java.util.Map;

public class LoginSteps implements CommonPage {

    @When("User enters following credentials:")
    public void userEntersFollowingCredentials(Map<String, String> data) {
        for(String key: data.keySet()){
            SeleniumUtils.waitForElementVisibility(WebDriverManager.getDriver().findElement(By.xpath(String.format(
                    XPATH_TEMPLATE_INPUT_FIELD, key))));
            WebDriverManager.getDriver().findElement(By.xpath(String.format(
                XPATH_TEMPLATE_INPUT_FIELD, key))).sendKeys(data.get(key));
        }

    }
}
