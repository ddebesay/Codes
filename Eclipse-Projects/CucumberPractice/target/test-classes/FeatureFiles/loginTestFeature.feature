Feature: Sauce Demo Login Features
@regression
  Scenario: Login with valid username and password
    Given User is on the Saucedemo.com login page
    And User enter correct username
    And User enter correct password
    And User click Login button
    Then User will be taken to the product page
    Then User should verify Product page title



