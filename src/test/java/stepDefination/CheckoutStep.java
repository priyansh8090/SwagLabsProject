package stepDefination;

import Page.CheckOut;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStep {
	
	CheckOut out = new CheckOut();
	
	@Then("click the checkout")
	public void click_the_checkout() throws InterruptedException {
		out.click_the_checkout();
	    
	}
	@Then("click the Firstname and lastname and zipcode")
	public void click_the_firstname_and_lastname_and_zipcode() throws InterruptedException {
	   out.click_the_firstname_and_lastname_and_zipcode();
	}
	@Then("click the Finish button")
	public void click_the_finish_button() {
		out.click_the_finish_button();
	    
	}
	
	   

	    
	}
