package stepDefination;

import Page.Basket;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasketStep {

	Basket bsket = new Basket();
	

	@When("user select the Dropdown High to Low")
	public void user_select_the_dropdown_high_to_low() throws InterruptedException {
		bsket.user_select_the_dropdown_high_to_low();
	}

	@Then("user Add to the Product in basket")
	public void user_add_to_the_product_in_basket() throws InterruptedException {
		bsket.user_add_to_the_product_in_basket();
	}

	@Then("verify the Count of basket")
	public void verify_the_count_of_basket() throws InterruptedException {
		bsket.verify_the_count_of_basket();

	}

	@When("user click the 1st product details")
	public void user_click_the_1st_product_details() throws InterruptedException {
		bsket.user_click_the_1st_product_details();
	   
	}
	@When("user click the Add to cart button")
	public void user_click_the_add_to_cart_button() throws InterruptedException {
		bsket.user_click_the_add_to_cart_button();
	    
	}
	@When("user click the back to product")
	public void user_click_the_back_to_product() throws InterruptedException {
		bsket.user_click_the_back_to_product();
	    
	}
	@When("user click 2nd product details")
	public void user_click_2nd_product_details() throws InterruptedException {
	   bsket.user_click_2nd_product_details();
	}
	@When("user click the 2nd product to add to cart")
	public void user_click_the_2nd_product_to_add_to_cart() throws InterruptedException {
		bsket.user_click_the_2nd_product_to_add_to_cart();
	    
	}

	
	
	
}
