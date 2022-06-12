Feature: Login page tests

  Scenario: Verify title of the page
    Given User opens "User-Mgt" page
    When User clicks on "Login" button
    And User switches to new window
    Then Verifies title of the page is "Login Page"