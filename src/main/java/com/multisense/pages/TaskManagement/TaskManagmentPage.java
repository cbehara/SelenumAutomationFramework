
package com.multisense.pages.TaskManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TaskManagmentPage extends TestBase {

	String TaskManagementNameValue= generateRandomName(9);

	
	public TaskManagmentPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Administration();
		waitForTime(3000);
	}
	public void clickonTasksManagement()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_TasksLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksLink")));
		doClickjavaScript(ConnexoMultisense_TaskMgmtPage_TasksLink);   
	}

	public String gettextofTasksManagement()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_verifyTasks = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifyTasks")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifyTasks, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifyTasks);
	}

	public void ChangeDropDownofperpage(String Tasksperpage)
	{
		waitForTime(1000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksPerPageDropDown);
		waitForTime(1000);
		//int IntTasksperpage=Integer.parseInt(Tasksperpage);
		//String strTasksperpage =String.valueOf(IntTasksperpage);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Tasksperpage +"']")).click();

		/*
		 * WebElement ConnexoMultisense_TaskMgmtPage_TasksPerPageValue =
		 * DriverUtility.getDriver().findElement(By.xpath(prop.getProperty(
		 * "ConnexoMultisense_TaskMgmtPage_TasksPerPageValue")));
		 * TestUtil.waitforElementTobeLocated(
		 * ConnexoMultisense_TaskMgmtPage_TasksPerPageValue, 10);
		 * doClick(ConnexoMultisense_TaskMgmtPage_TasksPerPageValue);
		 */

	}
	public void clickonAddTasksManagementLink()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_TasksPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksPerPage")));
		if(ConnexoMultisense_TaskMgmtPage_TasksPerPage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add task')]//ancestor::a)[2]")).click();
		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add task')]//ancestor::a)[1]")).click();
		}
	}
	public void addTaskSManagement(String Type,String Loglevel, String Devicegroup)
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_TaskMgmtPage_TypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TypeDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TypeDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TypeDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_NameInput = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_NameInput")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_NameInput, 10);
		doClear(ConnexoMultisense_TaskMgmtPage_NameInput);
		sendkeys(TaskManagementNameValue, ConnexoMultisense_TaskMgmtPage_NameInput);
		waitForTime(2000);
		WebElement ConnexoMultisense_TaskMgmtPage_LoglevelDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_LoglevelDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_LoglevelDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_LoglevelDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Loglevel +"']")).click();
		waitForTime(1000);
		WebElement ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_DevicegroupDropDown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Devicegroup +"']")).click(); 
		WebElement ConnexoMultisense_TaskMgmtPage_addTasksButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_addTasksButton")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_addTasksButton, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_addTasksButton);         
	}

	public void runTasksManagement()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ TaskManagementNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksRun = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksRun")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksRun, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksRun);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ TaskManagementNameValue +"')]//ancestor::div//a[normalize-space()='Run']")).click();
	}


	public void suspendTasksManagement()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ TaskManagementNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_TaskMgmtPage_TasksSuspend = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_TasksSuspend")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_TasksSuspend, 10);
		doClick(ConnexoMultisense_TaskMgmtPage_TasksSuspend);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ TaskManagementNameValue +"')]//ancestor::div//a[normalize-space()='Suspend']")).click();
	}

	public String gettextofValidationtaskadded()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded);
	}

	public String getthetextDatavalidationtaskrunqueued()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued);
	}

	public String getthetexExporttasksuspended()
	{
		WebElement ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended, 10);
		return getText(ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended);
	}


}
