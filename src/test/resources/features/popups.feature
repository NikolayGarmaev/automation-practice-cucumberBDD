@popUpScenarios
Feature: Pop-Up page tests
  Background:
    Given User opens "Pop-Up" page

  Scenario: Verify New Message header is displayed on pop-up window
    When User clicks on "Message" button
    Then Verify "New message" header is displayed

  @AUT-5 @smoke
  Scenario: Verify BMI Calculator header is displayed on pop-up window
    When User clicks on "BMI Calculator" button
    Then Verify "BMI Calculator" header is displayed