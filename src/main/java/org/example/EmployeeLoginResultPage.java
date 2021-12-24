package org.example;
import org.testng.Assert;

//create class employee result page for verification requirement
public class EmployeeLoginResultPage extends Utils{

    public void veifyemployeeLoginSucessfully(String pageurl){

        Assert.assertTrue(driver.getCurrentUrl().equals(pageurl));
    }
}
