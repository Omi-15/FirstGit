package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https://www.gsmarena.com/");
		
		System.out.println("Validation : "+driver.getCurrentUrl().contains("https://www.gsmarena.com"));

		List<WebElement> menu = driver.findElements(By.cssSelector("body>div>div>div>aside>div>ul>li>a"));
	
		for(int i =0;i<36;i++) //getting text (total 36 items only the isiela direct 36 lik dia in loop)
		{
				System.out.println((i+1)+" "+menu.get(i).getText());
		}
		driver.close();
	}

}
