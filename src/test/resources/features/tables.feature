Feature: Tables page tests

  Scenario: Verify header of the page is Customer Details
    Given User opens Table page
    Then Verify user can see header Customer details

  Scenario: Verify table contains email column
    Given User opens Table page
    Then Verify email column is displayed
