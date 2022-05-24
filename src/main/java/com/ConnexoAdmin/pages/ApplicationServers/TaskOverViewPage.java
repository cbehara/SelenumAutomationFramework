package com.ConnexoAdmin.pages.ApplicationServers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TaskOverViewPage extends TestBase{
	
	
	public TaskOverViewPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(5000);
	}
	
	public void clickonTaskOverView()
	{ 
		WebElement ConnexoAdmin_TaskOverviewPage_TaskOverView = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_TaskOverView")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_TaskOverView, 30);	
		doClick(ConnexoAdmin_TaskOverviewPage_TaskOverView);		
	}
	public String gettextofTaskOverView()
	{
		waitForTime(8000);
		WebElement ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView, 30);
		return getText(ConnexoAdmin_TaskOverviewPage_verifytextTaskOverView);
	}
	
	public void selectDropDownValue()
	{
		waitForTime(8000);
		WebElement ConnexoAdmin_TaskOverview_TasksPerPageDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverview_TasksPerPageDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverview_TasksPerPageDropdown);
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue, 30);	
		doClick(ConnexoAdmin_TaskOverviewPage_TasksPerPageDropdownValue);
	}
	
	public void checkQueueType()
	{
		waitForTime(8000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown")));
		doClickjavaScript(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdown);
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue, 30);
		doClick(ConnexoAdmin_TaskOverviewPage_QueueTypeDropdownValue);			
		waitForTime(5000);
		WebElement ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview")));
		doClick(ConnexoAdmin_TaskOverviewPage_ApplyTaskOverview);
	}
	
	
}
	