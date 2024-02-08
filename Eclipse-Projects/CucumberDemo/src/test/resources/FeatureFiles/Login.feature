Feature: Sauce Demo

  Scenario: Login with valid username and password
    Given User is on the Saucedemo.com login page
    And User enter correct username "standard_user"
    And User enter correct password "secret_sauce"
    And User click Login button
    Then User will be taken to the product page

  Scenario Outline: Login with different datas
    Given User is on login page
    And User enter correct USERNAME  username "<username>"
    And User enter correct PASSWORD password "<password>"
    And User click the Loginbutton
    Then User should get the "<status>" code

    Examples: 
      | username        | password     | status |
      | standard_user   | secret_sauce | Pass   |
      | locked_out_user | secret_sauce | fail   |
      | problem_user    | secret_sauce | fail   |
