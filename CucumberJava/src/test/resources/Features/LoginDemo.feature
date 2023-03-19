Feature: Test Login Functionality

  Scenario Outline: Check Login is successfull with valid creadentials.
    Given Browser is open
    And User is on Login Page
    When User enters <username> and <password>
    And User clicks on Login
    Then User is navigated to the home page
    
    Examples:
    |username | password |
    | Kapil | 12345|
    | Rahul | 12345|


