package openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using
		 * System.setProperty(key, value) Step2: create an instance of required browser
		 * class
		 */
		System.setProperty("webdriver.chrome.driver",
				"D:\\accleration\\program-files\\eclipse\\SeleniumBasics\\executables\\chromedriver.exe");

		ChromeDriver cdriver = new ChromeDriver();

		cdriver.get("https://www.google.com");
		
		
	}
}