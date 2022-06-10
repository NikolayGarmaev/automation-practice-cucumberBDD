Feature: Pop-Up page tests

  Scenario: Verify New Message header is displayed on pop-up window
    Given User navigates to www.automation.techleadacademy.io
    When User opens Pop-Up page
    And User clicks on Message button
    Then Verify New Message header is displayed

  Scenario: Verify BMI Calculator header is displayed on pop-up window
    Given User navigates to www.automation.techleadacademy.io
    When User opens Pop-Up page
    And User click on BMI Calculator button
    Then Verify BMI Calculator header is displayed