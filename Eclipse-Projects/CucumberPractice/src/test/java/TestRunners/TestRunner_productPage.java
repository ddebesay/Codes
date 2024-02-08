package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		                                                                     
	features = "src/test/resources/FeatureFiles/ProductTestFeature.feature",	
	glue = "StepDefinitions",											   
	plugin = {"pretty", "html:target/Cucumberreport.html"},				  
	monochrome = false,													
	dryRun = false,
	tags = "@regression"
		)
public class TestRunner_productPage {

}
