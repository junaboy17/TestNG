package utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import functions.HomePageFunctions;
import functions.LogInFunction;

public class Hooks extends Util{
	public HomePageFunctions homef = new HomePageFunctions();
	public LogInFunction loginf = new LogInFunction();
	
	@BeforeMethod
	public void launchWith() {
			launchwith("chrome", "https://letskodeit.teachable.com/");
		}
	
	@AfterMethod
	public void tearDown() {
		wait(3000);
		close();
	}
}
 