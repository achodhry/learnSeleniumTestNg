package com.orangeHRM.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangeHRM.base.BaseClass;

public class LoginPage extends BaseClass{
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	@FindBy (xpath="//button[@type='submit']")
	WebElement btnLogin;

	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	WebElement linkDropDown;

	//@FindBy (linkText = "Logout")
	@FindBy (xpath="//a[@class='oxd-userdropdown-link' and contains(text(),'Logout')]")
	WebElement lnkLogout;

	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}


	public void clickLoginBtn() {
		btnLogin.click();
	}

	public void clickUserDrowDownLink() {
		linkDropDown.click();

	}

	public void clickLogout() {
		lnkLogout.click();
	}
}
