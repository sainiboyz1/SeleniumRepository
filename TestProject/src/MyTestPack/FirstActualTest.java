package MyTestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirstActualTest {

   public static void main(String[] args) {
       // declaration and instantiation of objects/variables
	   System.setProperty("webdriver.gecko.driver","c:/geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       String baseUrl = "https://demo.guru99.com/test/newtours/";
       String expectedTitle = "Welcome: Mercury Tours";
       String actualTitle = "";

       // launch Firefox and direct it to the Base URL
       driver.get(baseUrl);

       // get the actual value of the title
       actualTitle = driver.getTitle();

       /*
        * compare the actual title of the page witht the expected one and print
        * the result as "Passed" or "Failed"
        */
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }
      
       //close Firefox
       driver.close();
      
       // exit the program explicitly
       System.exit(0);
   }

}
