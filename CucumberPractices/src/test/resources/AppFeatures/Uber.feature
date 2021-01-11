Feature: Uber booking feature

  Scenario: Booking Cab
    Given User wants to select a car type "sedan" from uber application
    When user selects car "sedan" and pickup point as "Bangalore" and drop location as "Pune"
    Then Driver starts the journey
    And Driver ends journey
    Then User pays 1000 USD
