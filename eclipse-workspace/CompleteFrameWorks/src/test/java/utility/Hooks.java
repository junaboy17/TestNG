package utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Util{

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
 