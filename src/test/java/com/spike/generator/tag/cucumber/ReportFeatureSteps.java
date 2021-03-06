package com.spike.generator.tag.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReportFeatureSteps {

    WebDriver webDriver = null;

    @Given("^I open a browser$")
    public void i_open_a_browser() throws Throwable {
        webDriver = new FirefoxDriver();
    }

    @When("^I navigate to ElevenEleven Softwares github page$")
    public void i_navigate_to_ElevenEleven_Softwares_github_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        throw new PendingException();
    }

    @Then("^the users real name should be displayed$")
    public void the_users_real_name_should_be_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a report should be generated$")
    public void a_report_should_be_generated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
