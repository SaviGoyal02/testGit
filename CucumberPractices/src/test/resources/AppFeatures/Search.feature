Feature: Amazon Search
	@Smoke
  Scenario: Search a product Macbook Air
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple Macbook Air" and price 2000
    Then Product with name "Apple Macbook Air" should be displayed
    Then The Order Id is 12345 and username is "Savi"
   
  @Regression  
  Scenario: Search a product Iphone
    Given I have a search field on Amazon Page
    When I search for a product with name "Apple iPhone 12" and price 200
    Then Product with name "Apple iPhone 12" should be displayed
    Then The Order Id is 5622 and username is "Savi Goyal"
    
      
