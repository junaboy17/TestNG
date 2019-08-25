package cucumberStepDef;

import static org.testng.Assert.assertEquals;

import functions.HomePageFunctions;
import functions.LogInFunction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Util;

public class LogOutStep extends Util {
	public HomePageFunctions homef = new HomePageFunctions();
	public LogInFunction loginf = new LogInFunction();

	@When("I click log out")
	public void i_click_log_out() {
		homef.logOut();
		
	}

	@Then("I should see LogIn")
	public void i_should_see_LogIn() {
		assertEquals(textValidation("Login", home.logIn, "Log In Pic"),true);

	}
	
}
