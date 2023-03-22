package com.co.cloudblue.stepdefinitions;

import com.co.cloudblue.questions.*;
import com.co.cloudblue.tasks.Flow;
import com.co.cloudblue.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class LoginStepDefinition {

    @Before

    public void setUp() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }


    @Given("^The user is on the page$")
    public void theUserIsOnThePage() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://creative-badger-sy9jme-dev-ed.trailblaze.my.salesforce.com/"));

    }

    @When("^The user enter valid credentials$")
    public void theUserEnterValidCredentials() {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter());
    }

    @Then("^The user will be able to enter the system$")
    public void theUserWillBeAbleToEnterTheSystem() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePage.compare(), Matchers.is("Quarterly Performance")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTittle.compare2(), Matchers.is("Today's Events")));
    }
    @Given("^The user click on the App Launcher Marketing and click on the Contacts tag$")
    public void theUserClickOnTheAppLauncherMarketingAndClickOnTheContactsTag()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Flow.enter2());

    }

    @Then("^The user will be able to see the contact list$")
    public void theUserWillBeAbleToSeeTheContactList()  {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateName.compare(), Matchers.is("Andy Young")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePhone.compare(), Matchers.is("(785) 241-6200")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmail.compare(), Matchers.is("a_young@dickenson.com")));
    }


}
