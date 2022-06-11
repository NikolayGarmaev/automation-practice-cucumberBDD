Feature: Pop-Up page tests

  Scenario: Verify New Message header is displayed on pop-up window
    When User opens "Pop-Up" page
    And User clicks on "Message" button
    Then Verify New Message header is displayed

  @AUT-5 @smoke
  Scenario: Verify BMI Calculator header is displayed on pop-up window
    When User opens "Pop-Up" page
    And User clicks on "BMI Calculator" button
    Then Verify BMI Calculator header is displayed