package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import functions.HomePageFunctions;
import functions.LogInFunction;
import utility.Hooks;

public class HomePageTest extends Hooks{
	HomePageFunctions homef = new HomePageFunctions();
	LogInFunction loginf = new LogInFunction();


	
	@Test
	public void testLogIn() {
		homef.startLogIn();
		loginf.logInProcess("nightgroup@gmail.com", "night123");
		
		
		//assertEquals(homef.validateProName("Hi, night group"));
		//assertEquals("FAILED : Profile Name not Matched!!!",homef.validateProName("James Williams-X"),true);
		assertEquals(textValidation("My Courses", home.myCourses),true);

	}
	
	

}
