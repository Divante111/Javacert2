Feature: Second Test


Background:
    # Given setup the entries in database
    # When launch the browser from config variables
    # And hit the home page url of banking site

@RegressionTest
Scenario: Trying a second test
    When I try my second test
    When I am trying to accept two strings "Divante" "Parness"



# Use scenario outline with an example to utalize example
@OtherTest
Scenario Outline: Trying a second test
    When I am trying to accept two strings "<Username>" "<Password>"
    When I am accepting any datatype 123 and a 456


# just call this an example table
Examples:
| Username | Password |
| Divante  | Parness  |
| debituser  | hello123  |
| random | test |

# The @SmokeTest allows me to run only the tests with that tribute through
# the testrunner.java file.
@SmokeTest @RegressionTest
Scenario: 
    Given I am  on sausedemo login
    Then I go to the forms page
    When User fills out forms
    | random|
    | user|
    | aaa@gmail.com|
    | accenture123|
    | benched|
    
@SmokeTest
Scenario:

    When launch the browser from config variables

