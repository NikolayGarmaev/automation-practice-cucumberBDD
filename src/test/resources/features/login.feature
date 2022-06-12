Feature: Login page tests

  Scenario: Verify title of the page
    Given User opens "User-Mgt" page
    When User opens "Login" page
    And User switches to new window
    Then Verifies title of the page is "Login Page"