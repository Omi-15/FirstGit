package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena_samsung {

	public static void main(String[] args) {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https://www.gsmarena.com/");

		System.out.println("Validation : " + driver.getCurrentUrl().contains("https://www.gsmarena.com"));

		driver.findElement(
				By.cssSelector("body>div>div>div:nth-of-type(2)>aside>div>ul>li:nth-of-type(1)>a:nth-of-type(1)"))
				.click();
		
		List<WebElement> phones = driver.findElements(By.cssSelector("div>div>div>div>div>div>ul>li>a>strong>span"));
		for (int i = 0; i < phones.size(); i++) {
			System.out.println(phones.get(i).getText());
		}
		driver.close();
	}

}
