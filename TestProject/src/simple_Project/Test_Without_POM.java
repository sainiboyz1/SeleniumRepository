package simple_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Without_POM {

	public static void main(String[] args) throws InterruptedException {

		//Instantiating chrome driver
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Opening web application
		driver.get("https://demoqa.com/books");
		
		//Locating the Login button and clicking on it
		driver.findElement(By.id("login")).click();
		
		//Locating the username & password and passing the credentials
		driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Click on the login button
		//driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//*[@id='login']")).click();
		//Print the web page heading
		System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());

		//Click on Logout button
		driver.findElement(By.id("submit")).click();
		
		//Close driver instance
		driver.quit();
	}

}
