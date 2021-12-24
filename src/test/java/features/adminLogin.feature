Feature: Admin Login

  As an admin, I want to login on https://opensource-demo.orangehrmlive.com/ website
  So that, I can use all features
@Login
    Scenario: Admin user should be able to register successfully and add
              employees details successfully
    Given As an admin user I am on login page
    When I enter valid username and password
    And click on login button
    And I should be able to register successfully
    And I click on PIM subcategory
    And click on add employee
    And I should be able to add employee details
    And I click on save option
    And I click on welcome button and logout option
    And As an employee enter valid username and password
    Then I should be able to login as an employee successfully


