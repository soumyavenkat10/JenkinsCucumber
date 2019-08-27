package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature", glue="StepDefinition",dryRun=true,plugin= {"pretty","json:reports/cucumber.json"})
public class TestRunner {

}
