package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingSteps {
	
	double billingamount;
	double taxamount;
	double finalamount;
	
	@Given("User is on Billing Page")
	public void user_is_on_billing_page() {
	   	}

	@When("User enters billing amount {string}")
	public void user_enters_billing_amount(String billingamount) {
		this.billingamount=Double.parseDouble(billingamount);
	    
	}

	@When("User enters tax amount {string}")
	public void user_enters_tax_amount(String taxamount) {
	    this.taxamount=Double.parseDouble(taxamount);
	}
	
	

	@When("uUSer clicks on calculate button")
	public void u_u_ser_clicks_on_calculate_button() {
	   
	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String expectedfinalamount) {
		
	 this.finalamount= this.billingamount+this.taxamount;
	 System.out.println("expected final amount: "+ Double.parseDouble(expectedfinalamount));
	 System.out.println("actual final amount: "+ this.finalamount);
	 Assert.assertTrue(this.finalamount==Double.parseDouble(expectedfinalamount));
	 
	}

	
	
}
