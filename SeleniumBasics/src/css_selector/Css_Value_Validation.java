package css_selector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Css_Value_Validation {

	public static void main(String[] args) {
		// Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://courses.letskodeit.com/practice");
		
		//creating webelement of radio button for validation with Xpath
		WebElement RadioButton = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
		System.out.println("Color:"+RadioButton.getCssValue("color"));
		System.out.println("Font Size:"+RadioButton.getCssValue("font-size"));
		System.out.println("Background:"+RadioButton.getCssValue("background-image"));
		
		System.out.println("**************");
		
		//creating webelement of select-class-example 
		WebElement SelectClass = driver.findElement(By.id("select-class-example"));
		System.out.println("Color:"+SelectClass.getCssValue("color"));
		System.out.println("Font Size:"+SelectClass.getCssValue("font-size"));
		System.out.println("Background:"+SelectClass.getCssValue("background-image"));
		
		System.out.println("**************");
		
		Point locationRadio = RadioButton.getLocation();//point is a predefined class
		int Xlocation= locationRadio.getX();
		int Ylocation= locationRadio.getY();
		System.out.println("X cordinate :"+Xlocation);
		System.out.println("Y cordinate :"+Ylocation);
		
		driver.close();
		
		
		
		
	
		
		
	}

}
