package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//create class pim page
public class PIMPage extends Utils {
    LoadProp loadProp = new LoadProp();
    //create locator variables for relevant required firlds
    By _employeeFirstNAme=By.id("firstName");
    By _employeeLastNAme=By.id("lastName");
    By _addEmployee = By.xpath("//li[@class='current main-menu-first-level-list-item']/ul/li[3]/a");
  //  By _saveButton = By.xpath(" //input[@id='btnSave']");
    By _typeUserName = By.xpath("//input[@id='user_name']");
    By _typePassword = By.xpath("//input[@id='user_password']");
    By _typeConfirmPassword = By.xpath("//input[@id='re_password']");
    By _clickOnSaveButton = By.id("btnSave");
    By _employeeList=By.linkText("Employee List");

    public void clickAddEmployee() {
        //click add employee
        waitForClickable(_addEmployee,10);
        clickOnElement(_addEmployee);
        //firstname lastname
        typeText(_employeeFirstNAme,currentTimeStamp()+ loadProp.getProperty("employeeFirstName") );
        typeText(_employeeLastNAme, loadProp.getProperty("employeeLastName"));
        //checkbox create login for employee
        WebElement input = driver.findElement(By.xpath("//input[@id='chkLogin']"));
        input.click();
        //employee username password confirm password
        typeText(_typeUserName,loadProp.getProperty("employeeUsername")) ;
        typeText(_typePassword, loadProp.getProperty("employeePassword"));
        typeText(_typeConfirmPassword, loadProp.getProperty("confirmPassword"));
        clickOnElement(_clickOnSaveButton);
        //waitForClickable(_addEmployee,10);
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void clickOnEmployeeList(){
        clickOnElement(_employeeList);
    }
}


