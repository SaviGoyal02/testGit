Feature: Amazon Order Page
  In Order to check my order details 
  As a Registered User 
  I want to specify the features of order details page

  Background: 
    Given A registered user exists
    Given User is on Amazon login Page
    When User enters username
    And User enters password
    And User clicks on login Button
    Then User navigates to order page

  Scenario: Check Previous order Details
    When user clicks on Order Link
    Then user checks the previous order details

  Scenario: Check Open order Details
    When User clicks on Open Order Link
    Then user checks the open order details

  Scenario: Check Cancelled order Details
    When User clicks on Cancelled Order Link
    Then user checks the cancelled order details
