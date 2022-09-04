package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_multiple_elements {

	public static void main(String[] args) throws InterruptedException {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximizing window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// implicit wait

		driver.get("https:www.google.com");
		System.out.println("G00GLEing :selenium questions ");
		driver.findElement(By.name("q")).sendKeys("selenium questions ");

		// getting into search bar suggestion through css selector
		List<WebElement> search = driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));

		// for -loop for printing elements in search bar
		 Thread.sleep(2000);
		 for (int i = 0; i < search.size(); i++) {
		  
		  WebElement element = search.get(i);// getting elements through index
		  System.out.println(element.getText());// printing elements through index 
		  }
	 
		 //	****** OR *****
		//for-each-loop for printing elements in search bar
		 //Thread.sleep(2000);
		
		/*
		for (WebElement a : search) //declared variable 'a' then printing it through getText()
		{
			System.out.println(a.getText());// printing elements through index
		}
		*/
		 
	 driver.close();
	
	}

}
