Feature: feature to test Make My Trip Search Functionality.

  Scenario: Validate WebSearch is working.
    Given Browser is open
    And User is on google search page
    When User Enters a text in search box
    And Hits enter
    Then User is navigated to Seach result
