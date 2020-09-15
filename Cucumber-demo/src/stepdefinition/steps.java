package stepdefinition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class steps {
	WebDriver driver;
	@Before
	public void beforetest()
	{
		driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	}
	
	@Given("^Login application should be launched$")
	public void login_application_should_be_launched()  {
	   //I am launching the login application
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    
	}

	@When("^Enter Name, pwd and click submit$")
	public void enter_Name_pwd_and_click_submit()  {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	  
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful()  {
		String expected = driver.findElement(By.id("welcome")).getText();
	   Assert.assertEquals(expected, "Welcome Linda");
	  
	}

@After
public void aftertest()
{
	driver.close();
}
}
