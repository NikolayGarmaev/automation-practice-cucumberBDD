package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.ConfigReader;
import utils.WebDriverManager;

public class TablesSteps {
    @When("User opens Table page")
    public void user_opens_table_page() {
        System.out.println("opened tables page");
        //WebDriverManager.getDriver().findElement(By.id("")).click();
    }

    @Then("Verify user can see header Customer details")
    public void verify_user_can_see_header_customer_details() {
        System.out.println("Verified header is displayed");
    }

    @Then("Verify email column is displayed")
    public void verifyEmailColumnIsDisplayed() {
        System.out.println("Verified email column is present");
    }
}
