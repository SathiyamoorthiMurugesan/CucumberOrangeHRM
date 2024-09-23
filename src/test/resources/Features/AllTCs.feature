Feature: This feature is to test the OrangeHRM page

  @TC01
  Scenario: This test case is to test login page
    Given User launches OrangeHRM page and enters username and password
    Then validates home page by getting the user name
    When clicks on the Time page
    Then user lands on the Time page

  @TC02
  Scenario Outline: This test case is to test login page
    Given User launches OrangeHRM page and enters <username> and <password>
    Then validates home page by getting the user name
    When clicks on the Time page
    Then user lands on the Time page

    Examples: 
      | username | password |
      | "Sathya"   | "Admin123" |
