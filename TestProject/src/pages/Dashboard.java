package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for the page title and the logout button

//	By heading = By.xpath("/html/head/title");
	By heading = By.xpath("//*[@id='site-name']");
	//String heading = driver.getTitle();
	
	//By heading = By.xpath("//div[@class=\"main-header\"]");
	//By heading = By.xpath("//table//tr[@class='heading']");
	
	
	By logoutBtn = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a");
	
	//Method to capture the page heading
	public String getHeading() {
		String head = driver.findElement(heading).getText();
			return head;
	}
	
	//Method to click on Logout button
	public void clickLogout() {
		driver.findElement(logoutBtn).click();
	}
}
