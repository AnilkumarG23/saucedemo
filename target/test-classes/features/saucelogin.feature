Feature: Login Features


  @LoginFeature @smoke
  Scenario: Validate Login Screen
    Given I navigate to "prod" to URL
    When I Enter Username for "prod" Environment
    And I Enter Password for "prod" Environment
    And I Click on Login Button
    Then I Click on Add to Cart