package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignIn extends Base {

	
	  @Given("User should navigate to swag labs login page") public void
	  user_should_navigate_to_swag_labs_login_page() {
	  
	  }
	  
	  public void user_enter_the_standard_user_and_secret_sauce() throws
	  InterruptedException { WebElement username =
	  driver.findElement(By.cssSelector("#user-name"));
	  username.sendKeys("standard_user"); WebElement Password1 =
	  driver.findElement(By.cssSelector("#password"));
	  Password1.sendKeys("secret_sauce"); Thread.sleep(5000); }
	  
	  public void user_click_the_login_button() throws InterruptedException {
	  WebElement login = driver.findElement(By.cssSelector("#login-button"));
	  Thread.sleep(2000); login.click();
	  
	  
	  }
	  
	  @Then("User should navigate to Swag Labs home page") public void
	  user_should_navigate_to_swag_labs_home_page() {
	  
	  }
	  
	  
	 
	
}
