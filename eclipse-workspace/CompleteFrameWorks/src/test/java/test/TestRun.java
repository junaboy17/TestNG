package test;

import org.testng.annotations.Test;

import testBase.DriverFactory;
import utility.Util;
import xPath.HomePageXPath;
import xPath.LogInPageXPath;

public class TestRun extends Util{
	 //LogInPageXPath login = new LogInPageXPath();
	
	
	@Test
	public void launchWith1() {
			launchwith("chrome", "https://www.phptravels.net");
			//login.logIn.click();
		}
	
	

}
