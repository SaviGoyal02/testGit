Feature: User Registration

  Scenario: user registration with different data
    Given user is in registration page
    When user enters following details
      | Savi   | Goyal | Pune      |
      | Shivi  | Goyal | Bangalore |
      | Sakshi | Goyal | Mumbai    |
    Then user registration is successful

    Scenario: user registration with different data with columns
    Given user is in registration page
    When user enters following details with columns
    	| FirstName | LastName | City |
      | Savi   | Goyal | Pune      |
      | Shivi  | Goyal | Bangalore |
      | Sakshi | Goyal | Mumbai    |
    Then user registration is successful 	