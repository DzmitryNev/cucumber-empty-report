package com.example;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExampleSteps {

    @Given("wait")
    public static void shouldWait() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5L);
    }

    @Then("step pass")
    public static void shouldPass(){
    }

    @Then("step fail")
    public static void shouldFail(){
        throw new RuntimeException("step fail");
    }
}
