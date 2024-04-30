package com.evarlat.certification.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/evalart.feature",
        glue = "com.evarlat.certification.automation.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class EvalartRunner {
}
