package MyTestPack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.time.Duration;
import java.util.Iterator;
public class CloseWindow {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com");
//implicit wait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
driver.findElement(By.name("q")).sendKeys("Selenium");

driver.findElement(By.name("btnk")).click();
// window handles
Set w = driver.getWindowHandles();
// window handles iterate
Iterator t = w.iterator();
String h = (String) t.next();
String p = (String) t.next();
// switching child window
driver.switchTo().window(h);
// switching parent window
driver.switchTo().window(p);
// terminates driver session and closes all windows
driver.quit();
}
}