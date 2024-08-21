package com.banistmo.certification.website.website.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/sostenibilidad.feature",
        glue = "com.banistmo.certification.website.website.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SostenibilidadRunner {
}
