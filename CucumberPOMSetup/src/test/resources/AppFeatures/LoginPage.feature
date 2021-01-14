Feature: Login Page Feature

  Scenario: Login Page Title
    Given User is on login page
    When user gets title of the page
    Then page title should be "Login - My Store"

  Scenario: Forgot password link
    Given User is on login page
    Then Forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given User is on login page
    When user enters username "Shavi.goyal300@gmail.com"
    And user enters password "Savi@12345"
    And user clicks on Login Button
    Then user gets title of the page
    And page title should be "My account - My Store"
