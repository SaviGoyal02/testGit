Feature: Account Page Feature

  Background: 
    Given user has logged in to application
      | username                 | password   |
      | Shavi.goyal300@gmail.com | Savi@12345 |

  Scenario: Accounts page title
    Given user is on Account page
    When user gets title of the page
    Then page title should be "My account - My Store"

  Scenario: Account Section count
    Given user is on Account page
    When user gets accounts section
      | ORDER HISTORY AND DETAILS |
      | MY CREDIT SLIPS           |
      | MY ADDRESSES              |
      | MY PERSONAL INFORMATION   |
      | MY WISHLISTS              |
      | Home                      |
    And account section count should be 6
