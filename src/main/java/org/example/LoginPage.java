package org.example;

import org.openqa.selenium.By;

//create login page class for all related requirements
public class LoginPage extends Utils
{
        LoadProp loadProp = new LoadProp();
        //locator variables for admin login
        By _adminLogin=By.xpath( "//input[@id='txtUsername']");
        By _adminPassword=By.xpath("//input[@id='txtPassword']");
        By _login =By.xpath("//input[@id='btnLogin']");
        //admin login method
        public void enterDetailsAdminLogin()
        {
            typeText(_adminLogin,loadProp.getProperty("adminUsername"));
            typeText(_adminPassword,loadProp.getProperty("adminPassword"));
        }
        //admin login click
        public void clickOnLogin(){
            clickOnElement(_login);

        }
        //employee login method
        public void employeeLogin(){
            typeText(_adminLogin,loadProp.getProperty("employeeUsername"));
            typeText(_adminPassword,loadProp.getProperty("employeePassword"));
            clickOnElement(_login);

        }
}

