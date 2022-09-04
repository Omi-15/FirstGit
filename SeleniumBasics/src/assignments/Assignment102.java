package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment102 {

	public static void main(String[] args) {
		String CurrentDir = System.getProperty("user.dir");
		String ChromeExe = CurrentDir + "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExe);

		WebDriver driverr = new ChromeDriver();

		driverr.get("https://www.facebook.com/");
		
		String Titile = driverr.getTitle();// getting title
		String expectedtitle = ("Facebook – log in or sign up");

		System.out.println("Title is : " + Titile);
		System.out.println("Titile validation : " +Titile.contains(expectedtitle));//comparing titles

		driverr.close();
	}

}
/*1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page
3. Username as Admin
4. password as admin123
5. click on Login button 
6. verify home page
7. close the browser


Perform following operations on the application

1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. close the brows*/

