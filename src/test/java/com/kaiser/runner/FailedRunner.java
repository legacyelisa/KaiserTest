package com.kaiser.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)      //runwith and cucumber options comes from junit run with junit ====cucumber works with junit
@CucumberOptions(
        features = {"@target/rerun.txt",},         //{} is optional for all features glue ===goes to target folder and finds the rerun txt when test fails
        glue = "com/kaiser/StepDefinitions",
        plugin = {
                "html:target/rerun-default-cucumber-reports",
                "json:target/cucumber_failure.json"
        }
)


public class FailedRunner {
}