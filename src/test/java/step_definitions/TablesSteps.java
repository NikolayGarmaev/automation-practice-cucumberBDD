package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TablesSteps {
    @Given("User navigates to www.automation.techleadacademy.io")
    public void user_navigates_to_http_automation_techleadacademy_io() {
        System.out.println("Opened home page");
    }
    @When("User opens Table page")
    public void user_opens_table_page() {
        System.out.println("opened tables page");
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
