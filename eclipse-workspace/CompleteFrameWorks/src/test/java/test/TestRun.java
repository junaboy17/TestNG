package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.DriverFactory;
import utility.Util;
import xPath.HomePageXPath;
import xPath.LogInPageXPath;

public class TestRun extends Util{
	 //LogInPageXPath login = new LogInPageXPath();
	
	
	@Test
	public void launchWith1() {
			launchwith("chrome", "https://www.google.com");
			driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Arif");;
			System.out.println(driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).isEnabled());
			wait(3000);
			close();
			//login.logIn.click();
		}
	
	

}
