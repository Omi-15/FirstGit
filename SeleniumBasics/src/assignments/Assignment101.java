package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment101 {

	public static void main(String[] args) {
		String CurrentWorkingDir = System.getProperty("user.dir");
		String ChromeExePath = CurrentWorkingDir + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath);

		WebDriver driver = new ChromeDriver(); // making ref variable

		driver.get("https://demo.actitime.com/");

		String Title = driver.getTitle();

		System.out.println("Title is :" + Title); // getting title
		System.out.println("Title length is :" + Title.length());// getting length

		String Url = driver.getCurrentUrl();// getting url
		String expectedUrl = "https://demo.actitime.com";

		System.out.println("URL Opened is :" + Url);
		System.out.println("URL should open is :" + expectedUrl);
		System.out.println("Url validation: " + Url.contains(expectedUrl));

		String Sourcecode = driver.getPageSource();// getting source code

		System.out.println("Source Code length :" + Sourcecode.length());

		driver.close();

	}

}
