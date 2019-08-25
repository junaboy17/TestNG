package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import functions.HomePageFunctions;
import functions.LogInFunction;
import testBase.DriverFactory;
import xPath.HomePageXPath;
import xPath.LogInPageXPath;


public class Util extends DriverFactory {	
	public LogInPageXPath login = new LogInPageXPath();
	public HomePageXPath home = new HomePageXPath();
	//TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	public void takeScreenshot(String fileName) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\junab\\Documents\\Images\\"+fileName+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public boolean textValidation(String desiredText, String locatorOfActualElement, String fileName) {
		try {// Validation Check the User is Mr
		String expectation = desiredText;
		String actual = driver.findElement(By.xpath(locatorOfActualElement)).getText();
		if (expectation.equalsIgnoreCase(actual)) {

		System.out.println("Desired Text Match Actual Text");
		return true;
		} else {
			takeScreenshot(fileName);

		System.out.println("Test Failed, Text Didnt Match text");
		return false;
		}
		} catch (Exception e) {
		System.out.println("Error");
		return false;
		}
		}

		public boolean textNotValidate(String desiredText, String locatorOfActualElement) {

		try {
		// Validation Check the User is Mr
		String expectation = desiredText;
		String actual = driver.findElement(By.xpath(locatorOfActualElement)).getText();
		if (expectation.equalsIgnoreCase(actual)) {
		System.out.println("Desired Text Match Actual Text...so its failed");
		return false;
		} else {
		System.out.println("Test passed. Text Didnt Match text");
		return true;
		}		
		} catch (Exception e) {
		 System.out.println(e.getMessage());
		return true;
		}

		}

		public void wait(int milisecond) {
		try {
		Thread.sleep(milisecond);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}

		public void close() {
		driver.close();
		}
	
}
