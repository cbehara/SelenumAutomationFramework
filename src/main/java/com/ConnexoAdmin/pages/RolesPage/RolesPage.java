package com.ConnexoAdmin.pages.RolesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RolesPage extends TestBase {	
	
	public  RolesPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}
				
	
	public void clickRoles() throws InterruptedException
	{
		Thread.sleep(5000);
		try 
		{
			WebElement ConnexoAdmin_RolesPage_Roles = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_Roles")));
			doClick(ConnexoAdmin_RolesPage_Roles);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
	public void clickAddRoles() throws InterruptedException
		{
		WebElement ConnexoAdmin_RolesPage_AddRoleButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddRoleButton")));
			DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			doClick(ConnexoAdmin_RolesPage_AddRoleButton);		
		}

	
	public void clickRolename(String Name, String Description) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_RolesPage_RoleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleName")));
		doClear(ConnexoAdmin_RolesPage_RoleName);
		sendkeys(Name, ConnexoAdmin_RolesPage_RoleName);
		WebElement ConnexoAdmin_RolesPage_RoleDescription = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RoleDescription")));
		doClear(ConnexoAdmin_RolesPage_RoleDescription);
		sendkeys(Description, ConnexoAdmin_RolesPage_RoleDescription);
		WebElement ConnexoAdmin_RolesPage_FullAccessButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_FullAccessButton")));
		doClick(ConnexoAdmin_RolesPage_FullAccessButton);
		WebElement ConnexoAdmin_RolesPage_AddRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_AddRoleNameButton")));
		scrolldown(ConnexoAdmin_RolesPage_AddRoleNameButton);
	}
	
	public void editRoleName(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoAdmin_RolesPage_EditRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_EditRoleNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_EditRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_EditRoleNameButton);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='Facts']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoAdmin_RolesPage_SaveRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_SaveRoleNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_SaveRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_SaveRoleNameButton);
	}
	public void removerolename(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_RolesPage_RemoveRoleNameButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_RolesPage_RemoveRoleNameButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_RolesPage_RemoveRoleNameButton, 10);
		doClick(ConnexoAdmin_RolesPage_RemoveRoleNameButton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}	
}


