Feature: User-Mgt page tests

  Background: Navigate to page
    Given User opens "User-Mgt" page

    #This is longer, less readable way of implementing steps without Data Table
  Scenario: Verify all fields are displayed
    Then Verify input field "First Name" is displayed
    And Verify input field "Last Name" is displayed
    And Verify input field "Phone Number" is displayed
    And Verify input field "E-mail" is displayed
    And Verify "Role" selection is enabled

    @regression @smoke @US-453 @tempTag
  Scenario: Verify all fields are displayed using Cucumber Data Table
    Then Verify following input fields are displayed:
      | First Name   |
      | Last Name    |
      | Phone Number |
      | E-mail       |
    And Verify "Role" selection is enabled
