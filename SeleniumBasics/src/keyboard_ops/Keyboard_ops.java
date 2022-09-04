package keyboard_ops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_ops {
	public static void main(String[] args) throws InterruptedException {
		
		// Step1: Using WebDriverManager setUp the required browser executable file
				WebDriverManager.chromedriver().setup();
				// step2: create an instance of Chrome Browser
				WebDriver driver = new ChromeDriver();

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				// to enter required application URL use get() of WebDriver interface
				driver.get("https://demo.automationtesting.in/Register.html");
				
				driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("admin");
				driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
				driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));
				driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
				driver.findElement(By.cssSelector("textarea[class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Pune");
				//[type="email
				driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abc@mail.");
				
				driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("1234567890");
				Thread.sleep(5000);
			
				//driver.findElement(By.cssSelector("body")).sendKeys("\uE035");
				driver.navigate().refresh();

				
				
				
				
				


}
	}
