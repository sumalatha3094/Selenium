package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	@FindBy(linkText="Register")
	WebElement registerlink;
	@FindBy(linkText="Log in")
	WebElement loginlink;
	public String clickRegisterLink()
	{
		registerlink.click();
		return driver.getTitle();
	}
	public String clickloginlink()
	{
		loginlink.click();
		return driver.getCurrentUrl();
	}
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
}
