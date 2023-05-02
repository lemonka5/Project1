Feature: Browsing in Luma Store
  Scenario: Log into Luma Store with given credentials
    Given The valid credentials
    When  User logs in
    Then Check if user is logged in

  Scenario: Add To Cart one Product
    Given The Man section
    When User select the section Man_Tops_Tanks
    And Select Atlas Fitness Tank product with size L and colour blue
    And Adds the product to cart
    Then Check if product is added to cart
