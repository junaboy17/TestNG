package functions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Util;

public class HomePageFunctions extends Util {
	WebDriverWait wait;
	
	
	
	public void startLogIn() {
	 driver.findElement(By.xpath(home.logIn)).click();
	}
	
	public void logOut() {
		wait = new WebDriverWait(driver, 10);
		WebElement logOut = driver.findElement(By.xpath(home.logOut));

	 driver.findElement(By.xpath(home.profileDropDown)).click();

	 wait(2000);
	 wait.until(ExpectedConditions.elementToBeClickable(logOut)).click();
	}
	
	
	public void validateProName(String desiredText) {
		//textValidation(desiredText, home.profileName);
		assertEquals(textValidation(desiredText, home.myCourses, "Pro Name"),true);

		
	}
	
	
	
}
