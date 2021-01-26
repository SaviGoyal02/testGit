package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locator: Object Repository

	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By fortgotPasswordLink = By.linkText("Forgot your password?");

	// 2.Constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions : features(behavior) of the page form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPasswordLinkPresent() {
		return driver.findElement(fortgotPasswordLink).isDisplayed();
	}

	public void enterUserName(String userName) {
		driver.findElement(emailId).sendKeys(userName);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {

		driver.findElement(signInButton).click();
	}

	public AccountsPage doLogin(String userName, String pwd) {

		driver.findElement(emailId).sendKeys(userName);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();

		return new AccountsPage(driver);
	}

}
