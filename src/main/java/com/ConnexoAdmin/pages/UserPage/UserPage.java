package com.ConnexoAdmin.pages.UserPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class UserPage extends TestBase { 
          
	public  UserPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}				
	
	public void clickuser() throws InterruptedException
	{
		Thread.sleep(5000);
		try 
		{
			WebElement ConnexoAdmin_UserPage_Users = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_Users")));
			doClick(ConnexoAdmin_UserPage_Users);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
	public void editUser(String desc, String Name, String mail, String lang, String checkbox1)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+Name+"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoAdmin_UserPage_EditUser = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_EditUser")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_EditUser, 10);
		doClick(ConnexoAdmin_UserPage_EditUser);
		
		waitForTime(5000);
		WebElement ConnexoAdmin_UserPage_description = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_description")));
		doClick(ConnexoAdmin_UserPage_description);
		doClear(ConnexoAdmin_UserPage_description);
		sendkeys(desc, ConnexoAdmin_UserPage_description);
		
		WebElement ConnexoAdmin_UserPage_email = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_email")));
		doClick(ConnexoAdmin_UserPage_email);
		waitForTime(5000);
		doClear(ConnexoAdmin_UserPage_email);
		sendkeys(mail, ConnexoAdmin_UserPage_email);
		
		doClick(ConnexoAdmin_UserPage_email);
		waitForTime(5000);
		doClear(ConnexoAdmin_UserPage_email);
		sendkeys(mail, ConnexoAdmin_UserPage_email);
		
		WebElement ConnexoAdmin_UserPage_language = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_language")));
		doClick(ConnexoAdmin_UserPage_language);
		waitForTime(5000);
		doClear(ConnexoAdmin_UserPage_language);
		sendkeys(lang, ConnexoAdmin_UserPage_language);
		ConnexoAdmin_UserPage_language.sendKeys(Keys.ENTER);
		
		
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("label[class*='x-form-cb-label x-form-cb-label-after']"));  
		for (WebElement element : options)
		{  
		     if(element.getText().equals(checkbox1))
		     {  

		        element.click();
		     }
		}
		WebElement ConnexoAdmin_UserPage_savebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_savebutton")));
		doClick(ConnexoAdmin_UserPage_savebutton);
	}
	
	public void activateuser(String desc, String Name, String mail, String lang, String checkbox1)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_UserPage_UserActivated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_UserActivated")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_UserActivated, 10);
		doClick(ConnexoAdmin_UserPage_UserActivated);
	}
	 public void deactivateuser(String desc, String Name, String mail, String lang, String checkbox1r)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_UserPage_UserDeactivated = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_UserPage_UserDeactivated")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_UserPage_UserDeactivated, 10);
		doClick(ConnexoAdmin_UserPage_UserDeactivated);
	}
	
}


