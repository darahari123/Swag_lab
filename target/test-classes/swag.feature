
Feature: Validating login credentials
Scenario: validating with valid username and password
Given user should be in swaglab application
When user enters valid username and password
And click on login button
Then user enters in to home page of swaglab application
When user select low to high prizes of products
And user adds the product to the cart by clicking on Add to cart
And user clicks on the cart symbol to enter details and pay the bill
And click on checkout button
When confirmation of checkout page 
And enter details of userbname
And click on conbtinue
And click on finish to order the product
And click on backhome button to go to home page
And click on logout button to exit from application