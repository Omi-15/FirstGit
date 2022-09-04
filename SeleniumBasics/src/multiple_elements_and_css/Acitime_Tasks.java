package multiple_elements_and_css;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acitime_Tasks {

	public static void main(String[] args) throws InterruptedException {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String Title = driver.getTitle();

		
		System.out.println("Titile is : " + Title);
		System.out.println("Verifying through Title: " + Title.contains("actiTIME - Login"));

		driver.findElement(By.id("username")).sendKeys("admin");//typing username
		driver.findElement(By.name("pwd")).sendKeys("manager");// typing password
		driver.findElement(By.id("loginButton")).click();//clicking login button
		driver.findElement(By.cssSelector("div[id='container_tasks']")).click();//clicking on TASK
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();// add new
		driver.findElement(By.cssSelector("div[class='item createNewTasks']")).click();//add new task
		driver.findElement(By.cssSelector("table>tbody>tr:nth-of-type(3)>td>div>div>div>div[class='dropdownButton']")).click();//selecting task dropdown button
		driver.findElement(By.cssSelector("tr:nth-of-type(3)>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(6)")).click();//selecting task dropdown button
		driver.findElement(By.cssSelector("table>tbody>tr>td>input[placeholder='Enter task name']")).sendKeys("first");//entering task name (FIRst)
		
		/*//selecting calender
		driver.findElement(By.cssSelector("#ext-gen45")).click();
		driver.findElement(By.cssSelector("#ext-gen110")).click();
		driver.findElement(By.cssSelector("tr:nth-of-type(3)>td:nth-of-type(4)>a")).click();//selecting exact date
		
		System.out.println("**** date selected");*/
		
		driver.findElement(By.cssSelector("span[class='checkmark checkMark']")).click();
		driver.findElement(By.cssSelector("div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(2)>div>div[class='components_button withPlusIcon']")).click();//clicking creat task button 
		driver.findElement(By.cssSelector("div>div>div>div>div>div>div:nth-of-type(1)>table>tbody>tr>td:nth-of-type(1)>div>div[class='img']")).click();//selecting created task (FIRST)
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[class='delete button']")).click();// deleting task

		List<WebElement> del = driver.findElements(By.cssSelector("div:nth-of-type(2)>div>div>div>div>div:nth-of-type(5)>div>div>span[class='submitTitle buttonTitle']"));  // Delete permenent
		del.get(2).click();// clicking Delete permenent
		driver.findElement(By.cssSelector("a[class='logout']")).click();// logout
	   
	    System.out.println("******* Tasks DOne Successfully *******");
	}
}
