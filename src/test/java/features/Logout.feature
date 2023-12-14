

Feature: Logout Funtionality

 
  Scenario: logout the swag labs
Given User should navigate to swag labs login page
When User enter the Username and  Password
And User click the login button
Then User should navigate to Swag Labs home page
  
And User should navigate to left sidebar
When User click the logout button
Then User should logout from Swag Labs
   
 