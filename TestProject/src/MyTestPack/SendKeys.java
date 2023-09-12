package MyTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class SendKeys{ 
public static void main(String[] args){ 
System.setProperty("webdriver.gecko.driver","c:/geckodriver.exe");
WebDriver driver = new FirefoxDriver(); 
driver.get("http://www.google.com"); 
WebElement searchBox = driver.findElement(By.name("q")); 
searchBox.sendKeys("Packt Publishing"); 
searchBox.submit(); 
} 
} 
