Feature: Sauce Demo Product Features

  @regression
  Scenario: Product Sorting
    Given User is will be in Product page
    When User select product sorting with High to Low
    Then "Sauce Labs fleece Jacket" will come first
    When User select product sorting with Low to High
    Then "Sauce Labs Onesie" will come first

  Scenario: Product verify Product count
    Given User will be located in Product page
    When User automate the product counts
    Then User should recieve a count of 6 products
