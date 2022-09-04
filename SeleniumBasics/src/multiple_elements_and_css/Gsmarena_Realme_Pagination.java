package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena_Realme_Pagination {

	public static void main(String[] args) throws InterruptedException {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait
		driver.get("https://www.gsmarena.com/");
		driver.findElement(By.cssSelector("aside>div>ul>li:nth-of-type(14)")).click();

		// pagination
		List<WebElement> pages = driver.findElements(By.cssSelector(".nav-pages>a"));

		// checking pagination is present or not
		if (pages.size() > 0) {
			System.out.println("Pagination is present");
		} else {
			System.out.println("Pagination is not present");
		}

		// if present then printing page no.
		for (int i = 0; i < pages.size(); i++) {
			System.out.println(pages.get(i).getText() + " " + pages.get(i).getAttribute("href"));
		}
		System.out.println("Completed");
		driver.close();
	}

}
