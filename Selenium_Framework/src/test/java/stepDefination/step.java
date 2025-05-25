package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Selenium_Framework.Selenium_Framework.MyTest;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step {
	
	WebDriver driver;
	
	
	@Test
	@Given("^user is on home page$")
	public void userHomePage()
	{
		WebDriverManager.chromedriver().setup();
	// System.setProperty("webdriver.chrome.driver","C:\\ToolsQA\\Libs\\Drivers\\chromedriver.exe");
	 //C:\Users\akash\.m2\repository\org\seleniumhq\selenium\selenium-chromium-driver\4.32.0\selenium-chromium-driver-4.32.0.jar
	 
      driver= new ChromeDriver();
      driver.get("https://www.google.com/");
      System.out.println("Test mytest claes test...");
      MyTest m=new MyTest();
	}
	

}
