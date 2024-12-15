Feature: Login Features


  @LoginFeature @smoke
  Scenario: Validate Login Screen
    Given I navigate to "stage" to URL
    When I Enter Username for "stage" Environment
    And I Enter Password for "stage" Environment
    And I Click on Login Button
    Then I Click on Add to Cart