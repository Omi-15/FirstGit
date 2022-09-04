package mouse_ops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// creating frame
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);

		// List<WebElement> sourceElements =
		// driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement from = driver.findElement(By.cssSelector("ul#gallery>li:nth-of-type(1)"));
		WebElement To = driver.findElement(By.id("trash"));

		// create an instance of Actions class by passing required browser instance to its constructor
		Actions act = new Actions(driver);
		act.dragAndDrop(from, To).build().perform();//drag and drop 
	}

}
