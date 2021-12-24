package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create class ohrm main page
public class OHRMMainPage extends Utils
{
       //create variable for locator
      // By _pimButton =By.xpath("//*[@id='menu_pim_viewPimModule']/b");
         By _pimButton=By.xpath(" //b[contains(text(),'PIM')]");
       //method to verify requirement
       public void verifyAdminOnOHRMMainPage()
       {
      // Assert.assertTrue(driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
       }
       //method to click on pim
       public void clickOnPIM(){
           clickOnElement(_pimButton);
       }
}