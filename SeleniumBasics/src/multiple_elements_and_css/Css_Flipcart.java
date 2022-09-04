package multiple_elements_and_css;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Flipcart {

	public static void main(String[] args) {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https:www.flipkart.com");
		
		System.out.println("Validation through URL :"+driver.getCurrentUrl().contains("https://www.flipkart.com"));

		// clicking the 'X' at staring,getting to it through css (Written inside try catch cause sometimes there cnt be 'X')
		try {
			driver.findElement(By.cssSelector("body>div:nth-of-type(2)>div>div>button")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
	
		// finding the elements and making its list
		List<WebElement> menu = driver.findElements(By.cssSelector(".xtXmba"));
	//or
		/*List<WebElement> menu = driver
				.findElements(By.cssSelector("body>div>div>div>div>div>div>a>div:nth-of-type(2)"));*/
	
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i).getText());// getting elements index and printing text together
		}
		driver.close();

	}

}
