package com.amazon.step_definitions;

import com.amazon.pages.AmazonPage;
import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AmazonStepDef {

    AmazonPage amazonPage;

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        String url = ConfigurationReader.getProperty("amazonUrl");
        Driver.getDriver().get(url);
    }
    @Then("User should see Amazon page title as expected")
    public void user_should_see_amazon_page_title_as_expected() {
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("User clicks account navigation link")
    public void user_clicks_account_navigation_link() {
        amazonPage.clickToReachLogInPage();
    }

    @When("User enters email address")
    public void user_enters_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks continue button")
    public void user_clicks_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User enters password")
    public void user_enters_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks sign-in button")
    public void user_clicks_sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The url should contain navigation sign in parameter")
    public void the_url_should_contain_navigation_sign_in_parameter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
