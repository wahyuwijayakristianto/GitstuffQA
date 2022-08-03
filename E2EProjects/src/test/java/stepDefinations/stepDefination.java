package stepDefinations;

import Academy.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

import java.io.IOException;

public class stepDefination extends Base {
    @Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() throws IOException {
        // Write code here that turns the phrase above into concrete actions
    driver = initializeDriver();
    }
    @Given("Navigate to the {string} Site")
    public void navigate_to_the_site(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(string);
    }
    @Given("Click on Login link in home page to land on Secure sign in Page")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        LandingPage l = new LandingPage(driver);

        l.getLogin().click();
    }
    @When("User enters {string} and {string} and logs in")
    public void user_enters_and_and_logs_in(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        LandingPage l = new LandingPage(driver);
        l.getUsername().sendKeys(string);
        l.getPassword().sendKeys(string2);
        l.getLogin().click();
        l.getLogout().click();
    }
    @Then("Verify that user is successfully logged in")
    public void verify_that_user_is_successfully_logged_in() {
        // Write code here that turns the phrase above into concrete actions

    }

}
