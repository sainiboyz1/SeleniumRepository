package MyTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
//import java.util.concurrent.*;

public class Geico {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		//set path to chromedriver.exe You may need to download it from http://code.google.com/p/selenium/wiki/ChromeDriver
  //      System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
  //     WebDriver driver = new ChromeDriver();
		driver.get("https://www.geico.com/");
		
		WebElement ApUsername = driver.findElement(By.id("ssp-service-zip"));
		
		var a = ApUsername.isDisplayed();
		if(a = true)
		{
			var b = ApUsername.isEnabled();
			if(b=true)
			{
				ApUsername.sendKeys("01720");
				String UnameBack = ApUsername.getAttribute("value");
				System.out.println(ApUsername.getAttribute("value"));
				if (UnameBack.equals("01720"))
					{
							System.out.println("Zip 01720 was entered correctly");
					}
				System.out.println("Passed");
			}
		}
		else
		{
			System.out.println("Failed");
		}
		WebElement checkBox = driver. findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/section/div[1]/div/div/form/div[2]/div[1]/div/div"));
	//	WebElement checkBox = driver. findElement(By.id(“isAgeSelected"));
		checkBox. click(); 
		
		WebElement SubButtn = driver. findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/section/div[1]/div/div/form/div[3]/div[6]/p/a"));
		//	WebElement checkBox = driver. findElement(By.id(“isAgeSelected"));
		SubButtn. click(); 		
		
		
		
		WebElement ContButtn = driver. findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/section/div[3]/div/div[2]/form/div[3]/input"));
		//	WebElement checkBox = driver. findElement(By.id(“isAgeSelected"));
		ContButtn. click(); 	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	
	By elementLocator = By.xpath("//input[starts-with(@id,'Id_GiveFirstName')]");
	List<WebElement> elements = driver.findElements(elementLocator);

	if (elements.size() > 0) {
	    System.out.println("First Name exists");
	    
	    WebElement Fname =	driver.findElement(By.xpath("//input[starts-with(@id,'Id_GiveFirstName')]"));
	    System.out.println(Fname);
	    Fname.sendKeys("JOHN");

	    WebElement Lname =	driver.findElement(By.xpath("//input[starts-with(@id,'Id_GiveLastName')]"));
	    System.out.println(Lname);
	    Lname.sendKeys("Demellow");

	    driver.findElement(By.xpath("//input[contains(@id,'Id_GiveDateOfBirth')]")).sendKeys("08221985");	

	    driver.findElement(By.xpath("//button[contains(@id,'Id_Next')]")).click();	
	    
	    
	    
	} 
	    else {
	    System.out.println("Element does not exist");
	    driver.findElement(By.xpath("//input[contains(@id,'Id_GiveDateOfBirth')]")).sendKeys("08221985");	

	    driver.findElement(By.xpath("//button[contains(@id,'Id_GiveDateOfBirth')]")).click();	
	   
	}

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
		//Name
//Using Dynamic XPATH as id keeps changing, input is the TAG type in HTML for the Name filed
//WebElement Fname =	driver.findElement(By.xpath("//input[starts-with(@id,'Id_GiveFirstName')]"));


driver.findElement(By.id("address-search-field")).sendKeys("1000 Walnut st");

driver.findElement(By.xpath("//input[contains(@id,'Id_GiveUnitNumber_')]")).sendKeys("117");	

driver.findElement(By.xpath("//button[contains(@id,'Id_Next')]")).click();	

driver.findElement(By.xpath("//label[@id='/labelForOriginal/']")).click();	

		
}}


