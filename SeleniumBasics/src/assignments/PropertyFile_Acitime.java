package assignments;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile_Acitime {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\TestData_PropertyFile\\AppData.properties");// import files and
																									// throws exception
		Properties prop = new Properties();
		prop.load(fis);// load files and throws exception

		String driverPath = prop.getProperty("driverExePath");
		String driverKey = prop.getProperty("driverKey");
		String Url = prop.getProperty("loginPageUrl");
		String username = prop.getProperty("Usesname");
		String password = prop.getProperty("Password");
		String Title = prop.getProperty("PageTitle");
		String button = prop.getProperty("loginButtonid");

		// System.out.println(driverPath+"\n"+driverKey+"\n"+Url+"\n"+username+"\n"+password+"\n"+
		// Title+"\n"+button);

		String chromeExePath = System.getProperty("user.dir") + driverPath;
		
		// setting the path for driver executable
		System.setProperty(driverKey, chromeExePath);
		
		
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get(Url);

		// to get title from the application use getTitle() of WebDriver interface
		String pageTitle = driver.getTitle();

		System.out.println("Page title is: " + pageTitle);
		System.out.println("Page title length: " + pageTitle.length());
		// validating login page
		System.out.println("Title validation status: " + pageTitle.equals(Title));
		String pageUrl = driver.getCurrentUrl();
		System.out.println("Page Url is: " + pageUrl);
		// validating login page
		System.out.println("Url validation status: " + pageUrl.contains(Url));

		String pageSource = driver.getPageSource();

		System.out.println("Page Source length: " + pageSource.length());

		WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(username);

		WebElement passwordInputField = driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys(password);

		WebElement loginButton = driver.findElement(By.id(button));
		loginButton.click();

		driver.close();

	}

}
