package MyTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
public class GetText{ 
public static void main(String[] args){ 
	System.setProperty("webdriver.gecko.driver","c:/geckodriver.exe");
WebDriver driver = new FirefoxDriver(); 
driver.get("http://www.duckduckgo.com"); 
WebElement searchButton = driver.findElement(By.id("searchbox_input")); 
System.out.println(searchButton.getText()); 
} 
} 
