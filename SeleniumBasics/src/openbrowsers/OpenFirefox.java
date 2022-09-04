package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\accleration\\program-files\\eclipse\\SeleniumBasics\\executables\\geckodriver.exe");
		FirefoxDriver fdriver = new FirefoxDriver();
		fdriver.get("https://www.google.com");
	}

}
