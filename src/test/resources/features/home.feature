Feature: Home page related scenarios

  Scenario: Verify header of the page is Automation with Selenium

  @AUT-6 @smoke @regression @miniRegression
  Scenario: Verify all links are displayed
    Then Verify PHP Travels link is displayed

  @linkTest
  Scenario: Verify following link is displayed
    Then Verify "PHP Travels" link is displayed

  @linkTest
  Scenario: Verify following link is displayed
    Then Verify "Internet" link is displayed

  @linkTest
  Scenario: Verify following link is displayed
    Then Verify "E-commerce" link is displayed

  @linkTest
  Scenario: Verify following link is displayed
    Then Verify "Saucedemo" link is displayed

  @scenarioOutlineExample
  Scenario Outline: Verify following link is displayed
    Then Verify "<linkText>" link is displayed
    Examples:
      | linkText    |
      | Saucedemo   |
      | PHP Travels |
      | Internet    |
      | E-commerce  |