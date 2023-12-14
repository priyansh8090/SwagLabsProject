package stepDefination;

import Page.PDP;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDPStep {

	PDP product = new PDP();

	@When("User click the sort ZA")
	public void user_click_the_sort_za() {
	    product.user_click_the_sort_za();
	}
	@Then("User should see the ZA sorted products")
	public void user_should_see_the_za_sorted_products() {
	   product.user_should_see_the_za_sorted_products();
		
	}
	@Then("Click the 1st product")
	public void click_the_1st_product() throws InterruptedException {
	product.click_the_1st_product();
	   
	}
	@Then("click the 2nd product")
	public void click_the_2nd_product() throws InterruptedException {
	 product.click_the_2nd_product();
	}
	
	@Then("user click the basket")
	public void user_click_the_basket() throws InterruptedException {
		product.user_click_the_basket();
	    
	}
	@Then("user click the remove button")
	public void user_click_the_remove_button() throws InterruptedException {
	   product.user_click_the_remove_button();
	}
	@Then("user click continue button")
	public void user_click_continue_button() throws InterruptedException {
		product.user_click_continue_button();
	   
	}

		
		
	}


