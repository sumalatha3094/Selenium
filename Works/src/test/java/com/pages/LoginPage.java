package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(css="input[value='Log in']")
	WebElement loginbutton;
	public String loginSubmit()
	{
		email.sendKeys("askmail@test1234.com");
		password.sendKeys("abc123");
		loginbutton.click();
		return driver.getTitle();
	}
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
}
