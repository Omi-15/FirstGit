package css_selector;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Vtiger {

	public static void main(String[] args) throws InterruptedException {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		// login page verificaiton
		System.out.println("Login page Url: " + driver.getCurrentUrl());
		System.out.println("Login page Url Verification : "
				+ driver.getCurrentUrl().contains("https://demo.vtiger.com/vtigercrm/index.php"));

		// username
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");

		// password
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		// click
		driver.findElement(By.className("button")).click();

		// Home page verificaiton
		Thread.sleep(2000);
		System.out.println("Home Page Title: " + driver.getTitle());
		System.out.println("Home Page Verification : " + driver.getTitle().contains("Dashboard"));

		// inside home page

		/*List<WebElement> cut =	driver.findElements(By.cssSelector("i[title='Remove']"));
		List<WebElement> yes=driver.findElements(By.cssSelector("button[data-bb-handler='confirm']"));

		for(int i=0;i<cut.size();i++) {
		   cut.get(1).click();
		   yes.get(0).click();
		}
		*/
		
		/*driver.findElement(By.cssSelector("a:nth-of-type(2)>i[class='fa fa-remove']")).click();
		driver.findElement(By.cssSelector("button[data-bb-handler='confirm']")).click();

		driver.findElement(By.cssSelector("div>a:nth-of-type(3)>i[class='fa fa-remove']")).click();
		driver.findElement(By.cssSelector("button[data-bb-handler='confirm']")).click();
*/
		// making web element for clicking on the widget(ref variable= SELECTOR)
		WebElement Selector = driver.findElement(By.className("btn-group"));
		Selector.click();
		driver.findElement(By.cssSelector("a[data-name='History']")).click();// clicking on history

		Selector.click();
		driver.findElement(By.cssSelector("a[data-name='GroupedBySalesPerson']")).click();// clickling on "opportunities
																							// by stage"

		Selector.click();
		driver.findElement(By.cssSelector("a[data-name='LeadsBySource']")).click();// clickling on "lead us by source"

		// for removing history section using ref variable
		WebElement Cancle = driver.findElement(By.cssSelector("i[title='Remove']"));
		Cancle.click();
		driver.findElement(By.cssSelector("button[data-bb-handler='confirm']")).click();

		Thread.sleep(2000);// 2sec sleep (explicit waIT)
		// for removing 2nd section direct
		driver.findElement(By.cssSelector("i[title='Remove']")).click();
		driver.findElement(By.cssSelector("button[data-bb-handler='confirm']")).click();

		Thread.sleep(2000);// 2sec sleep (explicit waIT)
		// for removing 3rd section direct
		driver.findElement(By.cssSelector("i[title='Remove']")).click();
		driver.findElement(By.cssSelector("button[data-bb-handler='confirm']")).click();

		// open signout widget
		driver.findElement(By.className("fa-user")).click();
		// clicking on signout
		driver.findElement(By.cssSelector("a[id='menubar_item_right_LBL_SIGN_OUT']")).click();

		// after signout conformation of log in page
		System.out.println("Login page Url : " + driver.getCurrentUrl());
		System.out.println("Login page Url Verification : "
				+ driver.getCurrentUrl().contains("https://demo.vtiger.com/vtigercrm/index.php"));

		driver.close();

	}

}
