package MyTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
//import java.util.concurrent.*;

public class Yahoo_Login {
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
	
	

	
		//Name
//Using Dynamic XPATH as id keeps changing, input is the TAG type in HTML for the Name filed
WebElement Fname =	driver.findElement(By.xpath("//input[starts-with(@id,'Id_GiveFirstName')]"));

var Exst = Fname.isDisplayed();
if (Exst = true)
{


System.out.println(Fname);
Fname.sendKeys("JOHN");

WebElement Lname =	driver.findElement(By.xpath("//input[starts-with(@id,'Id_GiveLastName')]"));
System.out.println(Lname);
Lname.sendKeys("Demellow");

driver.findElement(By.xpath("//input[contains(@id,'Id_GiveDateOfBirth')]")).sendKeys("08221985");	

driver.findElement(By.xpath("//button[contains(@id,'Id_Next')]")).click();	

	
}
else{

driver.findElement(By.xpath("//input[contains(@id,'Id_GiveDateOfBirth')]")).sendKeys("08221985");	

driver.findElement(By.xpath("//button[contains(@id,'Id_Next')]")).click();	
	}

driver.findElement(By.id("address-search-field")).sendKeys("1000 Walnut st");

driver.findElement(By.xpath("//input[contains(@id,'Id_GiveUnitNumber_')]")).sendKeys("117");	

driver.findElement(By.xpath("//button[contains(@id,'Id_Next')]")).click();	

driver.findElement(By.xpath("//input[@id='/labelForOriginal/']")).click();	



		//*[@id="Id_GiveDateOfBirth_38960"]
		
//driver.findElement(By.xpath("//*[starts-with(@id,'Id_GiveFirstName')]")).sendKeys("John");
//WebElement Fname = driver.findElement(By.xpath("//*[contains(@id,'Id_GiveFirstName')] and //*[contains(@name,'Id_GiveFirstName')]"))

//		var fn = Fname.isDisplayed();
//		System.out.println(fn);
//		if(fn = true)
//		{
	//		var fnb = Fname.isEnabled();
	//		if(fnb=true)
	//		{
	//			Fname.sendKeys("John");
	//			String FNBack = Fname.getAttribute("value");
		//		System.out.println(Fname.getAttribute("value"));
		//		if (FNBack.equals("John"))
		//			{
		//					System.out.println("First Name John was entered correctly");
		//			}
		//		System.out.println("Passed");
		//	}
	//	}
	//else
	//	{
		//	System.out.println("Name Field Does Not Exist");
			
	//	}
		
		
		
		
		//Last Name
	//	"Id_GiveLastName_35646"
		
		
		
		
		
//		WebElement ApNextButton = driver.findElement(By.type("submit"));
		
//		var c = ApNextButton.isDisplayed();
//		if(c = true)
//		{
//			var d = ApNextButton.isEnabled();
//			if(d=true)
//			{
//				ApNextButton.click();				
			}
//		}
//		else
	//	{
	//		System.out.println("Failed");
	//	}
		
		
//		id="login-passwd"
//				id="login-signin",name="signin"		
		
		
        //close Firefox
	//		driver.close();
  
		// exit the program explicitly
	//		System.exit(0);

		
	}

