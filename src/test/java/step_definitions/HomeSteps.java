package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ConfigReader;
import utils.WebDriverManager;

public class HomeSteps {
    @Then("Verify all links are displayed")
    public void verify_all_links_are_displayed() {
        System.out.println("verified all links are displayed");
        new WebDriverManager().setUp();
        
    }


}
