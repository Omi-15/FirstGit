package mouse_ops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_ops01 {

	public static void main(String[] args)  {
		// Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions act =new Actions(driver);
		
		WebElement Abox = driver.findElement(By.id("column-a"));
		WebElement Bbox = driver.findElement(By.id("column-b"));
		
	
		act.dragAndDrop(Abox,Bbox).build().perform();
		
		
		
		
	}

}
