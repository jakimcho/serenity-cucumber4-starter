Feature: Purchase Ordering

  Ivana as a site client
  should have that option to select items to cart and to order them

  @jakim
  Scenario: Ivana adds items to her cart
    Given Ivana is on shop Dresses page
    And her cart is empty
    When she add all "orange" colored dresses to her cart
    Then then her cart should contain only the selected dresses
