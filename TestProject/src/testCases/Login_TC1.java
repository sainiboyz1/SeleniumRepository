package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.Dashboard;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "---Exact path to chromedriver.exe---");
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	driver.get("https://www.demoqa.com/books");
		driver.get("https://demo.guru99.com/test/newtours/");
		//Creating object of home page
		HomePage home = new HomePage(driver);
		
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		
		//Click on Login button
		home.clickLogin();
		
		//Enter username & password
		login.enterUsername("jojo");
		login.enterPassword("bean");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		
		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +dashboard.getHeading());
		
		//Click on Logout button
		dashboard.clickLogout();

               //Close browser instance
               driver.quit();
	}

}
