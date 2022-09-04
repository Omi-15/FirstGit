package openbrowsers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserGeneric02 {

	public static void main(String[] args) {

		String currentWorkingDir = System.getProperty("user.dir");// getting current directory location
		String chromeExePath = currentWorkingDir + "\\Executables\\geckodriver.exe";// getting location of gekodriver

		System.setProperty("webdriver.gecko.driver", chromeExePath);// setting key (webdriver.gecko.driver)and location

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		// application title validation
		String actualTitle = driver.getTitle();// inbuilt method/functin in selenium api
		String expectedTitle = "Google";
		System.out.println("Actaul Google page title is: " + actualTitle);
		System.out.println("Expected Google page title is: " + expectedTitle);
		System.out.println("Google title validation: " + actualTitle.equals(expectedTitle));

		// validation of url
		String actualUrl = driver.getCurrentUrl();// inbuilt method/function in selenium api
		String expectedUrl = "https://www.google.com";
		System.out.println("Actaul Google page URL is: " + actualUrl);
		System.out.println("Expected Google page URL is: " + expectedUrl);
		System.out.println("Google url validation: " + actualUrl.contains(expectedUrl));
		
		// page source code
		String pageSoucre = driver.getPageSource();// inbuilt method/function in selenium api
		System.out.println("Page source code content length: " + pageSoucre.length());

		driver.close();

	}

}
