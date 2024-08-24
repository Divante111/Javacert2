Feature: User login
@writingToFeature
Scenario Outline: Login attempt.
  Given I am on the login page for saucedemo
  

  Then The user inputs "<Username>" and "<Password>" and clicks login

  Examples:
 | Username | Password |
 | no_match | password |
 | locked_out_user | secret_sauce |
 | rostandard_userw3 | secret_sauce |
