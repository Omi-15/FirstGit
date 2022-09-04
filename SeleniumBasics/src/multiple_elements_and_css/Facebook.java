package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https:www.facebook.com");

		driver.findElement(By.cssSelector("a[rel=\'async\']")).click();// signup

		WebElement Day = driver.findElement(By.cssSelector("#day"));
		System.out.println("Date visible  " + Day.isDisplayed());
		System.out.println("Date enable  " + Day.isEnabled());

		List<WebElement> Date = driver.findElements(By.cssSelector(
				"div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(1)>option"));
		System.out.println("DAY : " + Date.size());

		List<WebElement> Month = driver.findElements(By.cssSelector(
				"div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(2)>option"));
		System.out.println("Month: " + Month.size());

		List<WebElement> year = driver.findElements(By.cssSelector(
				"div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(3)>option"));
		System.out.println("Month: " + year.size());

		
		WebElement cd = driver.findElement(By.cssSelector(
				"div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(1)>option:nth-of-type(22)"));
		cd.click();
		WebElement cm = driver.findElement(By.cssSelector(
				"div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(2)>option:nth-of-type(09)"));
		cm.click();
		WebElement cy = driver.findElement(By.cssSelector(
				"div>div>div>form>div>div:nth-of-type(5)>div:nth-of-type(2)>span>span>select:nth-of-type(3)>option:nth-of-type(2)"));
		cy.click();

		System.out.println("***Values Changed***");

		System.out.println("Validation Day : " + cd.getText().contains("22"));
		System.out.println("Validation Month : " + cm.getText().contains("Sep"));
		System.out.println("Validation Year : " + cy.getText().contains("21"));

		driver.close();
	}

}
