package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo {

	public static void main(String[] args) {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https:espncricinfo.com");

		List<WebElement> menu = driver.findElements(By.cssSelector("nav>div>div>div>div:nth-of-type(2)>div>div>a"));
		System.out.println(" Menu size :" + menu.size());//size of menu
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(" Elements are :" + menu.get(i).getText()); //printing it
		}
		System.out.println(driver.getPageSource().length()); //source code length
		driver.close();
		//System.out.println(driver.getPageSource()); 
	}

}
