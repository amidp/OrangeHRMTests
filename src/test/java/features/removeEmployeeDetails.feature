Feature: Remove Employee details from database

@Remove
    Scenario: As a admin user I should be able to delete employee details from database#
    Given As an admin user I am on login page
    When I enter valid username and password
    And click on login button
    And I click on PIM subcategory
    And I should be able to register successfully
    And I click on Employee List
    And I enter employee name to search
    And I click on search button
    And I select relevant employee name checkbox
    And I click on delete
    And I click ok on alert box to confirm the delete action
    Then I should be able to able to verify that record for employee has been deleted successfully

