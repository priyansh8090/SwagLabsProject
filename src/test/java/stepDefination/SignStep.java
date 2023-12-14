
  package stepDefination;
  
  import Page.SignIn; import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; import io.cucumber.java.en.When;
  
  public class SignStep {
  
  SignIn login = new SignIn();
  
  @Given("User should navigate to swag labs login page") public void
  user_should_navigate_to_swag_labs_login_page() {
  login.user_should_navigate_to_swag_labs_login_page();
  
  }
  
  @When("User enter the Username and  Password") public void
  user_enter_the_username_and_password() throws InterruptedException {
  login.user_enter_the_standard_user_and_secret_sauce(); }
  
  @When("User click the login button") public void
  user_click_the_login_button() throws InterruptedException {
  login.user_click_the_login_button();
  
  }
  
  @Then("User should navigate to Swag Labs home page") public void
  user_should_navigate_to_swag_labs_home_page() {
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
 