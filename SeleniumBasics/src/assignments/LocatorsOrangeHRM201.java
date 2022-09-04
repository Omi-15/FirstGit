package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsOrangeHRM201 {

	public static void main(String[] args) {

		String CurrentDir = System.getProperty("user.dir");
		String ChromeExe = CurrentDir + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExe);

		WebDriver ldriverr = new ChromeDriver();

		ldriverr.get("https://opensource-demo.orangehrmlive.com/");

		String Title = ldriverr.getTitle();
		System.out.println("Titile is : " + Title);
		System.out.println("Verifying through Title: " + Title.contains("OrangeHRM"));

		String Url = ldriverr.getCurrentUrl();
		System.out.println("Url is : " + Url);
		System.out.println("Verifying through Url: " + Url.contains("https://opensource-demo.orangehrmlive.com"));
	
		/**
		 * Once the WebElement is identified you can perform any of the below mentioned operations depending on requirement 
		 * Operation: type  ----------> sendKeys();
		 * 			 click  ----------> click();
		 * 			existing delete---> clear()
		 */
		
		
		WebElement Username = ldriverr.findElement(By.name("txtUsername"));//locating by using findelement bys using name
		Username.clear();//clearing the field
		Username.sendKeys("Admin");//sending data (entering username)"Admin" at the field
		
		WebElement Pwd= ldriverr.findElement(By.id("txtPassword"));//locating by using findelement by using id
		Pwd.clear();//clearing the field
		Pwd.sendKeys("admin123");//sending data (entering password)"admin123" at the field
		
		WebElement Button = ldriverr.findElement(By.className("button")); //creating webelement to click by using class
		Button.click();//clicking on button
		
		
		
		ldriverr.close();
		
		/**
		 * Once the WebElement is identified you can perform any of the below mentioned operations depending on requirement 
		 * Operation: type  ----------> sendKeys();
		 * 			 click  ----------> click();
		 * 			existing delete---> clear()
		 */
	}

}
/*
       Perform following operations on the application

1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page elements


         Perform following operations on the application

1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page elements

               Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. verify login page
4. enter username and passwor
              
                   Perform following operations on the application

1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page elements


        Perform following operations on the application

1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page elements

    Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. verify login page
4. enter username and passwor*/

