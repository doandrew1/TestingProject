@g15
Feature: users could create new accounts with valid credentials

  Scenario: user register new account successfully
    Given user go to register page
    When user select gender type
    And user enter first "andrew" and last name "maged"
    And user enter Date of birth
    And user enter valid email "andrewmaged4897@gmail.com"
    And user enter password "andrewmaged" & confirm password "andrewmaged"
    And user click on register button
    Then account created successfully
