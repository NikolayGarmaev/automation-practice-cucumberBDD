Feature: User DB page tests

  @US-2 @smoke
  Scenario: Verify title of the page
    Given User opens "User-Mgt" page
    When User opens "Access DB" page
    And User switches to new window
    Then Verifies title of the page is "User DB"