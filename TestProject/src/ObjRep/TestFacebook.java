package ObjRep;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class TestFacebook {
	
public static void main(String[] args) throws IOException {
//@Test
//public void TestOR() throws IOException{

// Specify the file location I used . operation here because
//we have object repository inside project directory only
//File src=new File("user.dir"+"\\src\\ObjRep\\demo_repo.properties");
	File src=new File("C:\\WebDriverWork\\TestProject\\src\\ObjRep\\demo_repo.properties");
	
// Create FileInputStream object
FileInputStream objfile=new FileInputStream(src);

// Create Properties class object to read properties file
Properties obj=new Properties();

// Load file so we can use into our script
obj.load(objfile);

System.out.println("Property class loaded");

// Open FirefoxBrowser
WebDriver driver=new FirefoxDriver();

// Maximize window
driver.manage().window().maximize();

// Pass application
driver.get("http://www.facebook.com");

// getProperty Fetches the value of target key from the properties file 
// In this case entering username
driver.findElement(By.xpath(obj.getProperty("facebook.login.username.xpath"))).
sendKeys("SeleniumWebDriver@gmail.com");

// getProperty Fetches the value of target key from the properties file 
// In this case entering password
driver.findElement(By.xpath(obj.getProperty("facebook.login.password.xpath"))).
sendKeys("adsadasdas");

// getProperty Fetches the value of target key from the properties file 
// In this case clicking on login button
driver.findElement(By.xpath(obj.getProperty("facebook.login.Signup.xpath"))).click();

}
}
