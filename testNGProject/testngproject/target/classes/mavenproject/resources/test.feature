Feature:
    
    Scenario Outline:
        Given I am on the saucedemo login page
        Then I login with "<Username"> and "<Password">
        When I check the url I am on "https://www.saucedemo.com/inventory.html"
            And I close the browser

    Examples:
    |Username           | Password    |
    |standard_user      | secret_sauce|
    # |QuantumLeap42      | Password123 |
    # |SerendipitySeeker7 | qwertyuiop  |
    # |PixelatedDreamer   | iloveyou    |
    # |EnigmaExplorer     | superman    |
    # |MidnightMaverick   | monkey123   |
Scenario:
    Given I try to turn on two browswers at the same time
    When I close the browser

Scenario:
    Given I am testing this out
    When I close the browser

Scenario:
    Given The third test
    When I close the browser


#     Test Scenario 2: Testing a Shopping Cart Functionality
# Test Cases:
# Create test methods for adding items to cart, removing items, calculating totals, applying discounts, and checkout.
# Use assertions to verify cart contents, prices, and order details.
# Parameterize test data with @DataProvider for different product combinations, quantities, and discounts.
# Group test cases based on shopping cart actions (add, remove, checkout).
# Explanation: This scenario demands thorough testing of various shopping cart features, making it ideal for utilizing TestNG's capabilities.
        

    


        