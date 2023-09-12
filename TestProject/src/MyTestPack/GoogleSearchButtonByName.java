package MyTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
class GoogleSearchButtonByName { 
public static void main(String[] args){ 
WebDriver driver = new FirefoxDriver(); 
System.setProperty("webdriver.gecko.driver","c:/geckodriver.exe");
driver.get("http://www.google.com"); 
WebElement searchBox = driver.findElement(By.name("btnK")); 
searchBox.submit(); 
} 
} 
