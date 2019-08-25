package cucumberStepDef;

import functions.HomePageFunctions;
import functions.LogInFunction;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import utility.Util;

public class CucumberHooks extends Util{
	

	@Given("I open {string} and got to {string}")
	public void i_open_and_got_to(String browser, String URL) {
		launchwith(browser, URL);

	}
	
	@After
	public void tearDown() {
		close();
	}
	
}
