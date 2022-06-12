Feature: Tables page tests
  Background: Navigate to the page
    Given User opens "Tables" page

  Scenario: Verify header of the page is Customer Details
    Then Verify user can see header Customer details

  Scenario: Verify table contains email column
    Then Verify email column is displayed
