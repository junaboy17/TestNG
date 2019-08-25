package cucumberStepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith( Cucumber.class)

@CucumberOptions(
		
		features = {"src/test/resource/cucumberResource"},
		//Location of the step defination
		glue = {"cucumberStepDef"},
		//Which tags to runs test for 
		tags = {"not @ignore"},
		//format such as pretty
		plugin = {"pretty","json:target/cucumber-resports.json", "html:target/cucumber-resports"}, monochrome = true)
		
		

public class CucumberRunner {

}
