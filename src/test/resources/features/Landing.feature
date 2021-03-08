@smoke_test
Feature: Landing

  Background:Landing verification
    Given User is on the login page
    And User enters valid "username" and "password"


  Scenario: Verify landing page
    And  User verifies that "Welcome,"message is displayed
    And User verifies that "Landing" page subtitle is displayed


  Scenario: Verify My Health Page

    Given And User navigates  to "My health" then to "Connect to care"
    Then Verify "My care" button is present



    Scenario:Health Page select person
    And User navigates  to "My Health" then to "ELISA LEGACY"
    Then User Clicks on the dropdown
    And USer selects "Mina Karabiyik " under dropdown
    Then USer verifies that " care team pediatrics doctor" is visible



  Scenario: Verify add family member function
    Given And User navigates  to "My Health" then to "ELISA LEGACY"
    And Verify "Add a family member" is present
    And User clicks on the "Add a family member"
    Then User verifies that "Act for a family member" page subtitle is displayed



Scenario:Verify Medical Record
  Given And User navigates  to "Medical Record" then to "Past visit Information"
  Then Verify "Download my health summary" is present

  Scenario: Verify Appointments Page
    Given And User navigates  to "Appointments" then to "Schedule "
    Then Verify "Download my health summary" is present

  @login_with_role
  Scenario Outline: Login as <role> and verify <title> page title is correct
    Given user is on the login page
    And user logs in as "<role>"
    When user navigates to "<module>" then to "<sub module>"
    Then the page title should be "<title>"

    Examples: member
      | role   | module          | sub module                 | title
      | member | My Health       | Start here                 | Get Care  My Doctor Online                          |
      | member | Medical Record  | Test results               | Test Results                                        |
      | member | Message Center  | Compose                    | Choose recipient  Message Center  Kaiser Permanente |
      | member | Appointments    | Schedule                   | Schedule Appointments - Kaiser Permanente           |
      | member | Pharmacy        | Drug cost                  | HealthSafe ID Registration  step1                |
      | member | Coverage&Costs  | Plan benefits              | Eligibility and benefits - Kaiser Permanente     |
      | member | Helath&Wealness | Mental health and wellness | Mental health & wellness  Kaiser Permanente        |