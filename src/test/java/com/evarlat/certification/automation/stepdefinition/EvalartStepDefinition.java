package com.evarlat.certification.automation.stepdefinition;


import com.evarlat.certification.automation.questions.ValidateHash;
import com.evarlat.certification.automation.tasks.Load;
import com.evarlat.certification.automation.tasks.Login;
import com.evarlat.certification.automation.tasks.OperationCycle;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static com.evarlat.certification.automation.utils.Constants.HASH_RESULT;

public class EvalartStepDefinition {


    @Given("that the user is on the evalart home page")
    public void thatTheUserIsOnTheEvalartHomePage(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Load.testData(testData.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(Login.inThe(testData.get(0)));
    }

    @When("carry out the proposed operations")
    public void carryOutTheProposedOperations() {
        OnStage.theActorInTheSpotlight().attemptsTo(OperationCycle.inThe());

    }

    @Then("validate that the response is successful")
    public void validateThatTheResponseIsSuccessful(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateHash.theHash(), Matchers.is(testData.get(0).get(HASH_RESULT))));
    }
}
