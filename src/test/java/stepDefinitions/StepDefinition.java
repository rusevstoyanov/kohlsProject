package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.PendingException;


public class StepDefinition {

    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {

    }

    @When("^User click on account button dropdown should displayed$")
    public void user_click_on_account_button_dropdown_should_displayed() throws Throwable {

    }

    @Then("^User click on account button dropdown should displayed on create account$")
    public void user_click_on_account_button_dropdown_should_displayed_on_create_account() throws Throwable {
        throw new PendingException();
    }
        @And("^Create account page should open$")
    public void create_account_page_should_open() throws Throwable {

        }
}
