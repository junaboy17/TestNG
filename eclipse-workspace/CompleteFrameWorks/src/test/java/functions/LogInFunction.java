package functions;

import org.openqa.selenium.By;

import utility.Util;
import xPath.LogInPageXPath;

public class LogInFunction extends Util {
	public LogInPageXPath login = new LogInPageXPath();


	public void logInProcess(String email, String password) {
		driver.findElement(By.xpath(login.email)).sendKeys(email);;
		driver.findElement(By.xpath(login.password)).sendKeys(password);;
		driver.findElement(By.xpath(login.logInButton)).click();
	}
	
	
	
}
