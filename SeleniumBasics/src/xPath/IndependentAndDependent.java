package xPath;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndependentAndDependent {

	public static void main(String[] args) {
		//// Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.flipkart.com");
		driver.manage().window().maximize();
	
		System.out.println("Flipkart");
	
		try {
			driver.findElement(By.cssSelector("body>div:nth-of-type(2)>div>div>button")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		
		driver.findElement(By.cssSelector("img[alt='Mobiles']")).click();
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		//span[text()='Electronics']
		

	}

}
