package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utility.Hooks;

public class HomePageTest2 extends Hooks {
	
	@Test
	public void successfulLogOut() {
		homef.startLogIn();
		loginf.logInProcess("nightgroup@gmail.com", "night123");
		homef.logOut();
		assertEquals(textValidation("Login", home.logIn, "Log Out Pic"),true);

	}
}
