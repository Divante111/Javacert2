Feature: Login Feature

Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter username and password
    And click on login button
    Then I should be logged in successfully
    Given I am trying a second given
