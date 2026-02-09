Feature: Login functionality

  Scenario: Valid login
    Given user is on login page
    When user logs in with valid credentials
    Then dashboard should be displayed
