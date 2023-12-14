

Feature: Checkout functionality



  Scenario: checkout functionality with valid details
 When User enter the Username and  Password
 And User click the login button
 When User click the sort ZA 
 Then User should see the ZA sorted products
 Then Click the 1st product
 Then click the 2nd product
 Then user click the basket
 Then click the checkout
 Then click the Firstname and lastname and zipcode
  Then user click continue button
 Then click the Finish button
