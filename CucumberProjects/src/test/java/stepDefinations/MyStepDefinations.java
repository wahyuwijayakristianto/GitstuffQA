package stepDefinations;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinations {

        @Given("^User is on NetBanking landing page$")
        public void user_is_on_netbanking_landing_page() throws Throwable {
                System.out.println("navigated to login url");

        }

        @When("^User login into application with username and password$")
        public void user_login_into_application_with_username_and_password() throws Throwable {
                System.out.println("Logged in success");
        }
        @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
        public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
                System.out.println(strArg1);
                System.out.println(strArg2);
        }

        @Then("^Home page is populated$")
        public void home_page_is_populated() throws Throwable {
                System.out.println("Validate homepage");
        }

        @And("^Cards displayed are \"true\"$")
        public void cards_displayed_are_true() throws Throwable {
                System.out.println("validate cards true");

        }
        @And("^Cards displayed are \"false\"$")
        public void cards_displayed_are_false() throws Throwable {
                System.out.println("validate cards false");
        }

}
