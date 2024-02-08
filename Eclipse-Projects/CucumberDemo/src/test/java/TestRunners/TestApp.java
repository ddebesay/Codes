package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/FeatureFiles/Login.feature"},
		glue = {"StepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"},
		dryRun = false,
		monochrome = false
		)
public class TestApp {

}
