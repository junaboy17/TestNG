package xPath;

import org.openqa.selenium.WebDriver;

public class HomePageXPath {

	WebDriver driver2;
	
	public String logIn = "//a[contains(text(),'Login')]";
	public String welcomeHeadLine = "//h2[@class='headline']";
	public String signUp = "//a[@id='header-sign-up-btn']";
	public String practice = "//a[contains(text(),'Practice')]";
	public String enrollNow = "//a[contains(@class,'btn-primary btn')]";
	public String learnHeadLine = "//h3[@class='subtitle']";
	public String myCourses = "//a[contains(text(),'My Courses')]";
	public String profileDropDown= "//a[contains(@class,'open-my-profile')]";
	public String logOut = "//a[contains(text(),'Log Out')]";
	
//	public WebElement logIn = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
//	public static WebElement welcomeHeadLine = driver.findElement(By.xpath("//h2[@class='headline']"));
//	public static WebElement signUp = driver.findElement(By.xpath("//a[@id='header-sign-up-btn']"));
//	public static WebElement practice = driver.findElement(By.xpath("//a[contains(text(),'Practice')]"));
//	public static WebElement enrollNow = driver.findElement(By.xpath("//a[contains(@class,'btn-primary btn')]"));
//	public static WebElement learnHeadLine = driver.findElement(By.xpath("//h3[@class='subtitle']"));
//	public static WebElement myCourses = driver.findElement(By.xpath("//a[contains(text(),'My Courses')]"));
//	public static WebElement profileDropDown= driver.findElement(By.xpath("//a[contains(@class,'open-my-profile')]"));
//	public static WebElement logOut = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
	
}
