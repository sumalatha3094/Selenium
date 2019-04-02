package com.test;

import org.testng.annotations.Test;

import com.helper.DriverUtility;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RegisterPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest14 {
	WebDriver driver;
	HomePage homepage;
	LoginPage loginpage;
	RegisterPage regpage;
	
	@BeforeTest
	public void beforeTest() {
		driver=DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		homepage=PageFactory.initElements(driver, HomePage.class);
		loginpage=PageFactory.initElements(driver,LoginPage.class);
		regpage=PageFactory.initElements(driver,RegisterPage.class);
	}	

	@Test(priority=1)
	public void testHomePage() {
		String title=homepage.clickRegisterLink();
		Assert.assertEquals(title,"Demo Web Shop. Register");
	}
	@Test(priority=2)
	public void testRegistration()
	{
		String message=regpage.registersubmit();
		Assert.assertEquals(message,"registration completed");
		regpage.clickLogout();
	}
	@Test(dependsOnMethods="testRegistration")
	public void testLogin()
	{
		homepage.clickloginlink();
		String title=loginpage.loginSubmit();
		Assert.assertEquals(title,"Demo Web Shop");
		regpage.clickLogout();
	}

	@AfterTest
	public void afterTest() {
		homepage=null;
		loginpage=null;
		regpage=null;
		driver.close();
	}

}
