@All
Feature: Uber booking feature
	@Smoke @qa-ready @US-1001 @Epic-900	
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "sedan" from uber application
    When user selects car "sedan" and pickup point as "Bangalore" and drop location as "Pune"
    Then Driver starts the journey
    And Driver ends journey
    Then User pays 1000 USD
    
	@Regression @Smoke
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber application
    When user selects car "SUV" and pickup point as "Bangalore" and drop location as "Hyderbad"
    Then Driver starts the journey
    And Driver ends journey
    Then User pays 1000 USD
    
	@Prod
  Scenario: Booking Cab for Mini
    Given User wants to select a car type "Mini" from uber application
    When user selects car "Mini" and pickup point as "Pune" and drop location as "Mumbai"
    Then Driver starts the journey
    And Driver ends journey
    Then User pays 1000 USD
