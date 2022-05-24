package com.ConnexoAdmin.pages.WorkgroupsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class WorkgroupsPage extends TestBase {
	
	public  WorkgroupsPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}


	public void clickWorkGroup() throws InterruptedException
	{
		Thread.sleep(5000);
		try {
			WebElement ConnexoAdmin_WorkgroupsPage_WorkGroups = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroups")));
			doClick(ConnexoAdmin_WorkgroupsPage_WorkGroups);
		} catch (Exception e) {						
			e.printStackTrace();
		}
	}

	public void clickAddWorkGroups() throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_WorkgroupsPage_AddWorkGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddWorkGroup")));
		doClick(ConnexoAdmin_WorkgroupsPage_AddWorkGroup);

	}


	public void AddWorkGroups(String Name, String Desc) throws InterruptedException
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoAdmin_WorkgroupsPage_WorkGroupName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroupName")));
		doClear(ConnexoAdmin_WorkgroupsPage_WorkGroupName);
		sendkeys(Name, ConnexoAdmin_WorkgroupsPage_WorkGroupName);
		WebElement ConnexoAdmin_WorkgroupsPage_WorkGroupDesc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_WorkGroupDesc")));
		doClear(ConnexoAdmin_WorkgroupsPage_WorkGroupDesc);
		sendkeys(Desc, ConnexoAdmin_WorkgroupsPage_WorkGroupDesc);
		WebElement ConnexoAdmin_WorkgroupsPage_SelectUsersButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_SelectUsersButton")));
		doClick(ConnexoAdmin_WorkgroupsPage_SelectUsersButton);
		WebElement checkbox11 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox11.click();
		WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox12.click();
		WebElement ConnexoAdmin_WorkgroupsPage_AddUsersButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddUsersButton")));
		doClick(ConnexoAdmin_WorkgroupsPage_AddUsersButton);
		WebElement ConnexoAdmin_WorkgroupsPage_AddWorkGroupButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_AddWorkGroupButton")));
		doClick(ConnexoAdmin_WorkgroupsPage_AddWorkGroupButton);
	}



	public void removeWorkGroup(String Name)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton, 10);
		doClick(ConnexoAdmin_WorkgroupsPage_RemoveWorkGroupButton);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}	

}


