package stepDefination;

import Page.Logout;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutStep {

	Logout log = new Logout();


	@Then("User should navigate to left sidebar")
	public void user_should_navigate_to_left_sidebar() throws InterruptedException {
		log.user_should_navigate_to_left_sidebar();
	    
	}
	@When("User click the logout button")
	public void user_click_the_logout_button() throws InterruptedException {
		log.user_click_the_logout_button();
	    
	}
	@Then("User should logout from Swag Labs")
	public void user_should_logout_from_swag_labs() throws InterruptedException {
	    log.user_click_the_logout_button();
	}
	
	
	
}
