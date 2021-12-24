package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    LoadProp loadProp=new LoadProp();
    LoginPage loginPage = new LoginPage();
    OHRMMainPage ohrmMainPage = new OHRMMainPage();
    PIMPage pimPage = new PIMPage();
    PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage();
    EmployeeLoginResultPage employeeLoginResultPage=new EmployeeLoginResultPage();
    EmployeeListPage employeeListPage=new EmployeeListPage();
    AlertCheckBoxPage alertCheckBoxPage=new AlertCheckBoxPage();

    @Given("As an admin user I am on login page")
    public void as_an_admin_user_i_am_on_login_page() {

    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        loginPage.enterDetailsAdminLogin();
    }

    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLogin();

    }

    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        ohrmMainPage.verifyAdminOnOHRMMainPage();
    }
    @When("I click on PIM subcategory")
    public void i_click_on_pim_subcategory() {
        ohrmMainPage.clickOnPIM();

    }

    @When("click on add employee")
    public void click_on_add_employee() {
        pimPage.clickAddEmployee();


    }

    @When("I should be able to add employee details")
    public void i_should_be_able_to_add_employee_details() {

    }

    @When("I click on save option")
    public void i_click_on_save_option() {

    }

    @When("I click on welcome button and logout option")
    public void i_click_on_welcome_button_and_logout_option() {
       personalDetailsPage.clickWelcomeAndLogout();
    }

    @When("As an employee enter valid username and password")
    public void as_an_employee_enter_valid_username_and_password() {
        loginPage.employeeLogin();

    }

    @Then("I should be able to login as an employee successfully")
    public void i_should_be_able_to_login_as_an_employee_successfully() {
        employeeLoginResultPage.veifyemployeeLoginSucessfully(loadProp.getProperty("employeeloginurl"));

    }
    @When("I click on Employee List")
    public void i_click_on_employee_list() {
        pimPage.clickOnEmployeeList();

    }

    @When("I enter employee name to search")
    public void i_enter_employee_name_to_search() {
        employeeListPage.employeeNameDetails();
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        employeeListPage.searchButton();
    }

    @When("I select relevant employee name checkbox")
    public void i_select_relevant_employee_name_checkbox() {
        employeeListPage.employeeNameCheckBox();
    }

    @When("I click on delete")
    public void i_click_on_delete() {
        employeeListPage.deleteButtonClick();

    }

    @When("I click ok on alert box to confirm the delete action")
    public void i_click_ok_on_alert_box_to_confirm_the_delete_action() {

    }

    @Then("I should be able to able to verify that record for employee has been deleted successfully")
    public void i_should_be_able_to_able_to_verify_that_record_for_employee_has_been_deleted_successfully() {
        alertCheckBoxPage.closeAlertBox();
        employeeListPage.verifyNoRecordFound();
    }




}
