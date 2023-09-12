package MyTestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.List;
//import java.util.concurrent.*;

public class DemoAuto {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
 
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement Username = driver.findElement(By.name("userName"));
		
		var a = Username.isDisplayed();
		if(a = true)
		{
			System.out.println("Username Field is being Displayed");
			var b = Username.isEnabled();
			if(b=true)
			{
				Username.sendKeys("jojo");
				String UnameBack = Username.getAttribute("value");
				System.out.println(Username.getAttribute("value"));
				if (UnameBack.equals("jojo"))
					{
							System.out.println("Username jojo was entered correctly");
					}
				System.out.println("Passed");
			}
		}
		else
		{
			System.out.println("Failed");
		}
		
		driver.findElement(By.name("password")).sendKeys("bean");
	//	driver.findElement(By.name("password")).submit();
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.cssSelector("input[value='oneway']")).click();
		
		Select drpPassNum = new Select(driver.findElement(By.name("passCount")));
		drpPassNum.selectByVisibleText("2");
		
		Select FromPort = new Select(driver.findElement(By.name("fromPort")));
		FromPort.selectByVisibleText("London");
		
		Select A_FromMonth = new Select(driver.findElement(By.name("fromMonth")));
		A_FromMonth.selectByVisibleText("August");
		
		Select A_FromDay = new Select(driver.findElement(By.name("fromDay")));
		A_FromDay.selectByVisibleText("12");
		
		Select A_ToPort = new Select(driver.findElement(By.name("toPort")));
		A_ToPort.selectByVisibleText("Zurich");
		
		Select A_ToMonth = new Select(driver.findElement(By.name("toMonth")));
		A_ToMonth.selectByVisibleText("November");

		Select A_ToDay = new Select(driver.findElement(By.name("toDay")));
		A_ToDay.selectByVisibleText("13");

		driver.findElement(By.cssSelector("input[value='Business']")).click();
	
		Select A_Airline = new Select(driver.findElement(By.name("airline")));
		A_Airline.selectByVisibleText("Pangea Airlines");
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")).click();
		driver.quit();
	}
}
