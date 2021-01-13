Feature: Login Feature

  Scenario Outline: Login Fail - Possible Combination
    Given user is on application landing page
    When user clicks on sign in button
    Then user is displayed with login screen
    When user enters "<username>" in username field
    And user enters "<password>" in pwd field
    And user clicks Sign in button
    Then user gets login failed error msg

    Examples: 
      | username          | password     |
      | incorrectusername |        12345 |
      | savigoyal         | incorrectpwd |
      | incorrectusername | incorrectpwd |
