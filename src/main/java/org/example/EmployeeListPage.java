package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create class employee list page for methods to do as per requirements
public class EmployeeListPage extends Utils{

    LoadProp loadProp=new LoadProp();
    //create variables for locators
   By _typeEmployeeName=By.xpath("//input[@id='empsearch_employee_name_empName']");
   // By _typeEmployeeName=By.cssSelector("#empsearch_employee_name_empName");
    //By _clickSearch =By.xpath("//input.[id='searchBtn']");
    By _clickSearch=By.cssSelector("#searchBtn");
  //  By _clickCheckbox=By.cssSelector("#ohrmList_chkSelectRecord_71");
    By _clickCheckbox=By.xpath("//input[@id='ohrmList_chkSelectAll']");
  //By _clickDelete=By.id("dialogDeleteBtn")
    By _clickDelete=By.xpath("//input[@class='delete']");
    //create methods as per requirements
    public void employeeNameDetails(){
        waitForVisible(_typeEmployeeName,20);
        typeText(_typeEmployeeName,loadProp.getProperty("employeeFirstName"));
    }
    public void searchButton(){
        clickOnElement(_clickSearch);
    }
    public void employeeNameCheckBox(){
        clickOnElement(_clickCheckbox);
    }
    public void deleteButtonClick(){
        clickOnElement(_clickDelete);
    }

    public void verifyNoRecordFound(){
      //  Assert.assertTrue(driver.findElement(By.xpath("//*[id=\"resultTable\"]/tbody/tr/td")).getText().equals("norecordfound"));
          Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'No Records Found')]")).getText().equals("No Records Found"));
    }

}
