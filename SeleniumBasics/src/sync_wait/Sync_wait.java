package sync_wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sync_wait {

	public static void main(String[] args) throws InterruptedException {

		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https://demo.actitime.com/");
	
		driver.getTitle().contains("actiTIME - Login");
		System.out.println(driver.getTitle());

		/*
		 * System.out.println("Titile is : " + Title);
		 * System.out.println("Verifying through Title: " +
		 * Title.contains("actiTIME - Login"));
		 */

		String Url = driver.getCurrentUrl();
		System.out.println("Url is : " + Url);
		System.out.println("Verifying through Url: " + Url.contains("https://demo.actitime.com"));

		driver.findElement(By.id("username")).sendKeys("admin");

		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.clear();
		pwd.sendKeys("manager");

		WebElement button = driver.findElement(By.id("loginButton"));
		button.click();

		Thread.sleep(2000);// explicit wait-->static

		String HomeUrl = driver.getCurrentUrl();
		System.out.println("HomeUrl is : " + HomeUrl);
		System.out.println(
				"Verifying through HomeUrl: " + HomeUrl.contains("https://demo.actitime.com/user/submit_tt.do"));

		driver.findElement(By.id("logoutLink")).click();

		driver.getCurrentUrl().contains("https://demo.actitime.com");// checking logging out
		System.out.println("Logged out sucessfully");

		// WebElement forgot=ldriver.findElement(By.id("toPasswordRecoveryPageLink"));
		// forgot.click();

		driver.close();

	}

}
