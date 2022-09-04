package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_eTrain {

	public static void main(String[] args) throws InterruptedException {
		// Step1: Using WebDriverManager setUp the required browser executable file
		WebDriverManager.chromedriver().setup();
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://etrain.info/in");
		
		driver.findElement(By.cssSelector("#tbsfi1")).sendKeys("Pune");//suggest_row1
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#suggest_row1")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#tbsfi3")).sendKeys("Mumbai");//suggest_row3 #tbsfi3
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#suggest_row2")).click();
		
		driver.findElement(By.cssSelector(".icon-calendar")).click();
		driver.findElement(By.cssSelector(".nav")).click();
		driver.findElement(By.cssSelector("input[value='8']")).click();
	
		WebElement QuotaDropdown = driver.findElement(By.cssSelector("#tbsfi5"));
		Select Tatkal = new Select(QuotaDropdown);
		Tatkal.selectByVisibleText("Tatkal");
		 driver.findElement(By.cssSelector("#tbssbmtbtn")).click();
		List <WebElement> Train_No = driver.findElements(By.cssSelector("table>tbody>tr>td:nth-of-type(1)>a"));
		System.out.println("list "+ Train_No.size());
		for(int i=0;i<Train_No.size();i++) {
			System.out.println("Name "+Train_No.get(i).getText());
		}
		
		

	}

}
