package org.example;
import org.openqa.selenium.By;

//create class for alert checkbox action
public class AlertCheckBoxPage extends Utils{
    //create locator variable
     By _clickAlerkBox=By.id("dialogDeleteBtn");
    //create method to close alert box
     public void closeAlertBox(){
         clickOnElement(_clickAlerkBox);
        // waitForClickable(_clickAlerkBox,10);
     }
}
