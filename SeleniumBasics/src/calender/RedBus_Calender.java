package calender;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus_Calender {

	public static void main(String[] args) throws InterruptedException {
		// Step1: Using WebDriverManager setUp the required browser executable file
				WebDriverManager.chromedriver().setup();
				// step2: create an instance of Chrome Browser
				WebDriver driver = new ChromeDriver();

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// driver.manage().window().maximize();
				// to enter required application URL use get() of WebDriver interface
				driver.get("https://Redbus.in");
				
				driver.findElement(By.cssSelector("input[data-message='Please enter a source city']")).sendKeys("pune");
				driver.findElement(By.cssSelector("li[data-id='66920']")).click();
				driver.findElement(By.cssSelector("input[data-message='Please enter a destination city']")).sendKeys("NAGPUR");
				driver.findElement(By.cssSelector("li[data-id='624']")).click();
				driver.findElement(By.cssSelector("td[class='next']")).click();
				driver.findElement(By.cssSelector("tr:nth-of-type(4)> td:nth-of-type(4)")).click();
				driver.findElement(By.cssSelector("#search_btn")).click();
				driver.findElement(By.cssSelector("label[for='dtAfter 6 pm']")).click();
				driver.findElement(By.cssSelector("label[for='bt_AC']")).click();
//				 Thread.sleep(10000);
				
				List <WebElement> Name= driver.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
				 Thread.sleep(5000);
			try {
				driver.findElement(By.cssSelector("span[class='g-button d-color fr']")).click();
			}catch(NoSuchElementException e) {
				System.out.println(e);
			}
			
			
			System.out.println("Number of Buses: "+Name.size());
//				
//			for (int i= 0 ;i<22;i++) {
//				System.out.println(Name.get(i).getText());
//			}
			Thread.sleep(3000);
			List <WebElement> Time= driver.findElements(By.cssSelector("ul.bus-items .seat-fare .fare>span"));
	        System.out.println("Price :"+Time.size());
			//	div[class="dp-time f-19 d-color f-bold
	       
	        
	       // driver.close();
	    
	       /* ul.bus-items .travels
	      
	        ul.bus-items .seat-fare .fare>span*/
} }
