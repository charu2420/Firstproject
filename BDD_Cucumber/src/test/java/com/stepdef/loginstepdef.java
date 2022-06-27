package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef {
	WebDriver  driver;
	//hooks in cucumber
	@Before
	public void setup() throws Exception
	{
		 System.setProperty("webdriver.chrome.driver", "chromedriverNewVersion.exe");
		 driver= new ChromeDriver();
		 Thread.sleep(3000);
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable { 
	   driver.get("file:///C:/Users/dell/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	    driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user will be on home page$")
	public void user_will_be_on_home_page() throws Throwable {
	   Assert.assertEquals("JavaByKiran | Dashboard", driver.getTitle());
	}
	
	@Then("^user should see JBK LOGO$")
	public void user_should_see_JBK_LOGO() throws Throwable 
	{
		WebElement logo=driver.findElement(By.tagName("img"));
		Assert.assertTrue(logo.isDisplayed());
	    
	}


}
