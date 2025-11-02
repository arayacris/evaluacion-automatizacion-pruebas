package com.iplacex;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.iplacex.stepdefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "summary"
    }
)
public class TestRunner { }
