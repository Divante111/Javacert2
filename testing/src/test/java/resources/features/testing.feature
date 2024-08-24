Feature: Changing name to verify 10

#     Rule: testing this rule thing out
# @verifyLogin
# Scenario Outline: Login attempt.
#     Given I am on the login page for saucedemo
#     Then The user inputs "<Username>" and "<Password>" and clicks login

# Examples:
# | Username | Password |
# | no_match  | password  |
# | locked_out_user  | secret_sauce  |
# | standard_user | secret_sauce |

# @verifyCart
# Scenario: 
#     Given User logs into Saucedemo page
#     Then User clicks on all add to car buttons
#     Then User clicks on all remove from cart buttons

# # for severity “trivial”, “minor”, “normal”, “critical”, and “blocker”.
@critical
@verifyUserCanCheckout
Scenario Outline: Finish checkout
    Given User logs into Saucedemo page
    Then User clicks on all add to cart buttons
    Then User clicks checkout button
    And enters "<FirstName>" , "<LastName>" , and <ZipCode> into form with int
    And clicks on the Continue button
    Given A user makes it to checkout overview page
    Then User clicks on finish button
    
Examples:
| FirstName | LastName | ZipCode |
| Divante  | Parness  |  55112  |
|          | Parness  |  55112  |
| Divante  |          |  55112  |
| Divante  | Parness  |         |
| Divante  | Parness  |   221   |


# @story1
# Scenario: Checking Filter Button
#     Given User logs into Saucedemo page
#     Then User clicks on organization filter 
#     And cycles throught the different options


# # the star allows you to be lazy and not put a given, then, etc in front of the string description

# Scenario:
#     Given User logs into Saucedemo page
#     Then User clicks on all add to car buttons
#     * checking to see if the user is logged in




# stuff that doesnt work but might in the future

# Scenario:
#     Given User attempts to log into the saucedemo page
#     Then User clicks on all add to car buttons for the bottom scenario

#     But If User login fails unexpectedly
#     Then the User sees an error message


# Scenario Outline:
#     Given User logs into Saucedemo page
#     Then User clicks on all add to car buttons
#     Then User clicks checkout button
#     And enters "<FirstName>" , "<LastName>" , and "<ZipCode>" into form
#     And clicks on the Continue button
#     Given A user makes it to checkout overview page
#     Then User clicks on finish button
    
# Examples: {"datafile": "C:\JavaTest1\testing\src\main\java\resources\excel file for tests\Book1.xlsx"}

# Scenario Outline: Sheet1
#     Given User logs into Saucedemo page
#     When I visit the URL "<base>" "<page>" "<ordNumber>" "<custName>"
    
# Examples: {'datafile': 'C:\JavaTest1\testing\src\main\java\resources\urls.xlsx'}
