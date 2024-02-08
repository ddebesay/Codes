package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		                                                                     // --->This annotation will glue feature.file and StepDefinition
	features = "src/test/resources/FeatureFiles/loginTestFeature.feature",	//---> 	it will take the location of feature.file (file)
	glue = "StepDefinitions",											   //---> it will take the location of StepDefinition  (FOLDERName)
	plugin = {"pretty", "html:target/Cucumberreport.html"},				  // ---> it generate reports (pretty - Junit report); (html: need folder location  - html reprt)
	monochrome = false,													 // ---> goes hand to hand with {dryRun =}
	dryRun = false 														    // ---> true (it will not open the browser, it will run iternally); false ( it will opne the browser and test)
	//tags = "@regression"	
		
		)

public class TestRunner_loginPage {
	//We do not need to write anything Inisde the class; Advance Level
	
	
	
}
