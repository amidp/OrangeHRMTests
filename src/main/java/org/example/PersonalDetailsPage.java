package org.example;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

//create class personal detail page
public class PersonalDetailsPage extends Utils{
    //create variable for locators
    By _clickWelcomeButton=By.xpath("//a[@id='welcome']");
    By _mouseToLogout=By.xpath("//div[@id='welcome-menu']/ul/li[3]/a");
    //method for click on welcome and logout
    public void clickWelcomeAndLogout(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickOnElement(By.id("menu_pim_viewEmployeeList"));
        clickOnElement(_clickWelcomeButton);
        clickOnElement(_mouseToLogout);
        //with mouse keyboard action class
       // clickOnElement(_clickWelcomeButton);
      //  Actions actions=new Actions(driver);
      //  WebElement logout = driver.findElement(By.xpath("//*[@id=\'welcome-menu\']/ul/li[3]/a"));
       // actions.moveToElement(logout).perform();
      //  logout.click();
       // actions.click().build().perform();


    }

}
