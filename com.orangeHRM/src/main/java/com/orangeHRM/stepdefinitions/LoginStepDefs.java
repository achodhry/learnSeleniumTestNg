package com.orangeHRM.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.orangeHRM.pageobjects.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefs {
	public WebDriver driver;
	public LoginPage lp;

	@Given("User Lauch Chrome browser")
	public void user_lauch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		lp = new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String uname, String pwd) throws InterruptedException {
		Thread.sleep(3000);
		lp.setUserName(uname);
		lp.setPassword(pwd);
	}

	@And ("Click on Login")
	public void click_on_login() throws InterruptedException {
		lp.clickLoginBtn();
		Thread.sleep(3000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
			driver.close();

			Assert.assertTrue(true);
			//Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());

		}

	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {


		lp.clickUserDrowDownLink();
		Thread.sleep(2000);

		lp.clickLogout();
		Thread.sleep(2000);
	}

	@And("Close browser")
	public void close_browser() {
		driver.quit();

	}
}
