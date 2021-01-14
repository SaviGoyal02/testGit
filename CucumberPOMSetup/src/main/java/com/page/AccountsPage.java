package com.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;
	private By accountSelection = By.cssSelector("div#center_column span");

	public AccountsPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public int getAccountSectionCount() {
		return driver.findElements(accountSelection).size();
	}
	
	
	public List<String> getAccountSectionList() {
		List<String> accountList = new ArrayList<>();
		List<WebElement> ele = driver.findElements(accountSelection);
		
		for(WebElement e: ele) {
			String txt= e.getText();
			System.out.println(txt);
			accountList.add(txt);
		}
		return accountList;
	}
	
	public String getAccountsPageTitle() {
		
		return driver.getTitle();
	}
}
