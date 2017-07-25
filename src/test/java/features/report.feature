
  Feature: tag report generator

    Scenario: ElevenEleven Software Github page should display real name

    Given I open a browser
    When I navigate to ElevenEleven Softwares github page
    Then the users real name should be displayed
    And a report should be generated
