package cucumberStepDef;

import static org.testng.Assert.assertEquals;

import functions.HomePageFunctions;
import functions.LogInFunction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Util;

public class LogInStep extends Util{
	public HomePageFunctions homef = new HomePageFunctions();
	public LogInFunction loginf = new LogInFunction();

	@When("I start log in with {string} and {string}")
	public void i_start_log_in_with_and(String email, String pass) {
		homef.startLogIn();
		loginf.logInProcess(email, pass);
	}

	@Then("I should see My Courses")
	public void i_should_see() {
		assertEquals(textValidation("My Course", home.myCourses, "Log In Pic2"),true);
	}
	
}
