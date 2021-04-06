package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement btnLogout;
	public void UserName(String name) {
		username.sendKeys(name);
	}

	public void Password(String pwd) {
		password.sendKeys(pwd);
	}

	public void clicksubmit() {
		btnLogin.click();
	}
	public void logout() {
		btnLogout.click();
	}

}
