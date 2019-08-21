package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import functions.HomePageFunctions;
import functions.LogInFunction;
import utility.Hooks;

public class HomePageTest2 extends Hooks {
	HomePageFunctions homef = new HomePageFunctions();
	LogInFunction loginf = new LogInFunction();
	
	@Test
	public void successfulLogOut() {
		homef.startLogIn();
		loginf.logInProcess("nightgroup@gmail.com", "night123");
		homef.logOut();
		assertEquals(textValidation("Login", home.logIn),true);

	}
}
