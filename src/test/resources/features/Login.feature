@smoke_test
Feature:Login


  Scenario: Login with valid credentials
    Given User is on the login page
    And User enters valid "username" and "password"
    And User verifies that he is in the landing page
    Then verify that "Welcome," is present


  Scenario: Verify that warning message displayed when login with invalid credentials
    Given User is on the login page
    And User enters invalid "invalid_username" and "invalid_password"
    Then User verifies that "we're sorry" warning message is present

  @member_login_with_data_table
  Scenario: Login as a member (data table example)
    Given User is on the login page
    Then user logs in as a member with following credentials
      | username | legacyelisa@gmail.com |
      | password | Limonata1-            |
    And user verifies that "My health" page subtitle is displayed
