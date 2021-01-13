package stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("user is in registration page")
	public void user_is_in_registration_page() {
	 
		System.out.println("user navigates on registration page");
	}

	@When("user enters following details")
	public void user_enters_following_details(DataTable dataTable) {
	   
		 List<List<String>> userlist = dataTable.asLists(String.class);
		for(List<String> e: userlist) {
			System.out.println(e);
		}
		
	}
	
	
	@When("user enters following details with columns")
	public void user_enters_following_details_with_columns(DataTable dataTable) {
	 
	List<Map<String,String>>userMap=dataTable.asMaps(String.class,String.class);
	/*System.out.println(userMap);
	System.out.println(userMap.get(0).get("LastName"));*/
	for(Map<String,String> e: userMap) {
		
		System.out.println(e.get("FirstName"));
		System.out.println(e.get("LastName"));
		System.out.println(e.get("City"));
	}
	
	}

	@Then("user registration is successful")
	public void user_registration_is_successful() {
	    
		System.out.println("User registration should be successful");
	
}
}