 
 
Feature: Product page functionality 
  User want to use functionalities in Product page
 
 
 
 Scenario: Check whether product sort option ZA is working correctly
    When User enter the Username and  Password
    And User click the login button
     When User click the sort ZA 
     Then User should see the ZA sorted products
     Then Click the 1st product 
     Then click the 2nd product
     Then user click the basket
     Then user click the remove button
     Then user click continue button
     
     