package stepdefinitions;

import org.junit.Assert;

import com.page.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private static String title;
	
	

	@Given("User is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}

	@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		title= loginpage.getLoginPageTitle();
		System.out.println("  My Login Page Tile: "+ title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		Assert.assertTrue(title.contains(expectedTitle));
	}

	@Then("Forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		 Assert.assertTrue(loginpage.isForgotPasswordLinkPresent());
			
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginpage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		 loginpage.enterPassword(password);
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		loginpage.clickOnLogin();
	}


	
	
}
