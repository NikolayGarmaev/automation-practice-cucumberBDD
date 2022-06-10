Feature: Home page related scenarios

  Scenario: Verify header of the page is Automation with Selenium

  @AUT-6 @smoke @regression @miniRegression
  Scenario: Verify all links are displayed
    Given User navigates to www.automation.techleadacademy.io
    Then Verify PHP Travels link is displayed
    And Closes driver

