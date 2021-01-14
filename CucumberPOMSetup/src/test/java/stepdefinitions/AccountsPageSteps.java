package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.page.AccountsPage;
import com.page.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsPageSteps {
	
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountPage;

	@Given("user has logged in to application")
	public void user_has_logged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>> credList   = credTable.asMaps();
		String userName= credList.get(0).get("username");
		String password= credList.get(0).get("password");
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountPage= loginpage.doLogin(userName, password);
		
		
	}

	@Given("user is on Account page")
	public void user_is_on_account_page() {
		
		String txt =accountPage.getAccountsPageTitle();
		//System.out.println("Accounts Page Title is:" +txt);
	}

	/*@When("user gets title of the page")
	public void user_gets_title_of_the_page() {
		
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		
	}*/

	@When("user gets accounts section")
	public void user_gets_accounts_section(DataTable sectionsTable) {
		List<String>  expectedAccountsSectionsList =sectionsTable.asList();
		//System.out.println("Expected Accounts Sections List: " + expectedAccountsSectionsList);
		
		List<String> actualAccountsSectionsList  =accountPage.getAccountSectionList();
		//System.out.println("Actual Accounts Section List: "+ actualAccountsSectionsList );
		
		Assert.assertTrue(expectedAccountsSectionsList.containsAll(actualAccountsSectionsList));
		
	}

	@When("account section count should be {int}")
	public void account_section_count_should_be(Integer expectedSectioCount) {
		
		Assert.assertTrue(accountPage.getAccountSectionCount()==expectedSectioCount);
	}

}
