package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	WebDriver driver;
	@FindBy(id="gender-male")
	WebElement gender;
	@FindBy(id="FirstName")
	WebElement firstname;
	@FindBy(id="LastName")
	WebElement lastname;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	@FindBy(id="register-button")
	WebElement registerbutton;
	@FindBy(linkText="Log out")
	@CacheLookup
	WebElement logout;
	public String registersubmit()
	{
		gender.click();
		firstname.sendKeys("aswani");
		lastname.sendKeys("kumar");
		email.sendKeys("askmail@test1234.com");
		password.sendKeys("abc123");
		confirmPassword.sendKeys("abc123");
		registerbutton.click();
		return "registration completed";
	}
	public void clickLogout()
	{
		logout.click();
	}
	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
}
