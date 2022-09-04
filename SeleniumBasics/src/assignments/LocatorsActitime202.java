package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsActitime202 {

	public static void main(String[] args) {

		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver ldriver = new ChromeDriver();

		ldriver.get("https://demo.actitime.com/");
		String Title = ldriver.getTitle();
		System.out.println("Titile is : " + Title);
		System.out.println("Verifying through Title: " + Title.contains("actiTIME - Login"));

		String Url = ldriver.getCurrentUrl();
		System.out.println("Url is : " + Url);
		System.out.println("Verifying through Url: " + Url.contains("https://demo.actitime.com"));

		WebElement User = ldriver.findElement(By.id("username"));
		User.clear();
		User.sendKeys("admin");

		WebElement pwd = ldriver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys("manager");

		WebElement button = ldriver.findElement(By.id("loginButton"));
		button.click();
		
	
		// WebElement forgot=ldriver.findElement(By.id("toPasswordRecoveryPageLink"));
		// forgot.click();

		ldriver.close();

	}

}
//  Perform following operations on the application
//
//1. Open any browser
//2. Enter the url as https://opensource-demo.orangehrmlive.com/
//3. Verify login page elements
//
//
//  Perform following operations on the application
//
//1. Open any browser
//2. Enter the url as https://demo.actitime.com/login.do
//3. Verify login page elements
//
//  Perform following operations on the application
//1. Open any browser
//2. Enter the url as https://opensource-demo.orangehrmlive.com/
//3. verify login page
//4. enter username and passwor

//  Perform following operations on the application
//
//1. Open any browser
//2. Enter the url as https://opensource-demo.orangehrmlive.com/
//3. Verify login page elements
//
//
//Perform following operations on the application
//
//1. Open any browser
//2. Enter the url as https://demo.actitime.com/login.do
//3. Verify login page elements
//
//Perform following operations on the application
//1. Open any browser
//2. Enter the url as https://opensource-demo.orangehrmlive.com/
//3. verify login page
//4. enter username and passwor

