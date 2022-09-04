package dropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		String Userdir = System.getProperty("user.dir");
		String ChromeEXE = (Userdir + "\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ChromeEXE);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Title: "+driver.getTitle());
		System.out.println("URL: "+driver.getCurrentUrl());
		  
		//**** identifying dropdown menu
		WebElement skillDropDown=driver.findElement(By.cssSelector("#Skills"));
		
		//**** creating instance of SELECT class and passing above created webelment
		Select Skill=new Select(skillDropDown);
	
		//**** check whether dropdown is multiselect dropdown or not
		//System.out.println("MultiSelect :"+Skill.isMultiple());
		
		//**** get default or already select option
		System.out.println("Default Option: "+Skill.getFirstSelectedOption().getText());
//                     OR
//		WebElement selectedOption=Skill.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selected option name: "+selectedOptionName);
		
		//**** get option size
		System.out.println("Size: "+Skill.getOptions().size());
		
		//Get dropdown option names
		for(int i =0;i<Skill.getOptions().size();i++) {
			System.out.println("Options :"+i+" "+Skill.getOptions().get(i).getText());
		}

		//                   OR	
/*		List<WebElement> options=selectSkill.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
 */
		
		
		//selecting from Dropdown menu
		Skill.selectByIndex(2);
		System.out.println("Select by Index : "+Skill.getFirstSelectedOption().getText());
		
		Skill.selectByValue("Analytics");
		System.out.println("Select by Value : "+Skill.getFirstSelectedOption().getText());
		
		Skill.selectByVisibleText("APIs");
		System.out.println("Select by VisibleText : "+Skill.getFirstSelectedOption().getText());
		
		WebElement Year =driver.findElement(By.cssSelector("#yearbox"));
		WebElement Month =driver.findElement(By.cssSelector("select[placeholder='Month']"));
		WebElement Day =driver.findElement(By.cssSelector("#daybox"));
	 
		System.out.println("Year "+Year.getSize());
		System.out.println("Month "+Month.getSize());
		System.out.println("Day "+Day.getSize());
		
		//driver.close();

	}

}
