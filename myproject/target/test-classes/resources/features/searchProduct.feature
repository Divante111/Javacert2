Feature: Search and Place the order for products


Scenario: Search Experience for savings search and home page
    Given user is on HEB landing page
    When user searched for name "capri assorted varieties" and extracted actual name of product
    Then user searched for same name in savings page to check if that product exists