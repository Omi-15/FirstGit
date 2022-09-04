package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Navigate {

	public static void main(String[] args) {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https:www.amazon.in");

		System.out.println("Title : " + driver.getTitle());

		driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_10']")).click();

		System.out.println("Title : " + driver.getTitle());
		driver.navigate().back();
		System.out.println("Title : " + driver.getTitle());
		System.out.println("Title : " + driver.getTitle().contains("Online Shopping site in India"));
		driver.close();
	}

}
