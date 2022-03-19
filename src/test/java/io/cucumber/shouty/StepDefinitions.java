package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StepDefinitions {

    private Person sean;
    private Person lucy;
    private String messageFromSean;

    @Given("Lucy is located {int} meters from Sean")
    public void lucy_is_located_meters_from_sean(Integer distance) {
        // Write code here that turns the phrase above into concrete actions
        this.lucy = new Person();
        this.sean = new Person();
        this.lucy.moveTo(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        // Write code here that turns the phrase above into concrete actions
       this.sean.shout(message);
       this.messageFromSean = message;
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(asList(messageFromSean), lucy.getMessageHeard("free bagels at Sean's"));
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_sean_s_message() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(asList(messageFromSean), lucy.getMessageHeard("free coffee!"));
    }

}
