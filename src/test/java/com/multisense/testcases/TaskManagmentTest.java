package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.TaskManagement.TaskManagmentPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class TaskManagmentTest extends TestBase {
	String TaskManagementSheet = "TaskManagement";
	TaskManagmentPage TaskManagementPage;
	Logger log = LogManager.getLogger(TaskManagmentTest.class);   
	public TaskManagmentTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForTaskManagement() {
		Object testData[][] = TestUtil.getTestData(TaskManagementSheet);
		return testData;
	}

	@Test(priority = 1,description="verify And Change Tasks Management",dataProvider = "getTestDataForTaskManagement")
	public void verifyAndChangeTasksManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		TaskManagementPage = new TaskManagmentPage();
		TaskManagementPage.clickonTasksManagement();
		reporterLog("Starting Test case Change Task Management");
		log.info("****************************** starting test case : Change Task Management*********************");
		String ExpectedValue= "Tasks";
		String ActualValue =TaskManagementPage.gettextofTasksManagement();
		Assert.assertEquals(ActualValue, ExpectedValue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);                     

		log.info("****************************** Ending test case : Change Task Management*********************");
	}

	@Test(priority = 2, dataProvider = "getTestDataForTaskManagement",description="Created Task Management")
	public void CreatedTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Create Task Management");
		log.info("****************************** starting test case : Create Task Management*********************");
		TaskManagementPage.clickonAddTasksManagementLink();
		TaskManagementPage.addTaskSManagement(Type,Loglevel,Devicegroup);

		String ExpectedaddTaskvalue = "Validation task added";
		WebElement ActualaddTaskvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextValidationtaskadded")));         
		SoftAssertfunction(ActualaddTaskvalue, ExpectedaddTaskvalue);
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("****************************** Ending test case : Create Task Management*********************");
	}

	@Test(priority = 3, dataProvider = "getTestDataForTaskManagement",description="Run Task Management")
	public void RunTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Run Task Management");
		log.info("****************************** starting test case : Run Task Management*********************");	
		TaskManagementPage.runTasksManagement();

		String ExpectedDVTrunvalue = "Data validation task run queued";
		WebElement ActualDVTrunvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextDatavalidationtaskrunqueued")));       
		SoftAssertfunction(ActualDVTrunvalue, ExpectedDVTrunvalue);
		log.info("******************************Ending test case : Run Task Management*********************");	
	}
   
	@Test(priority = 4, description="Changing DropDown perpage",dataProvider = "getTestDataForTaskManagement")
	public void ChangingDropDownperpage(String Type,String Loglevel, String Devicegroup,String Tasksperpage)

	{
		reporterLog("Starting Test case Change Drop Down Page of Task Management");
		log.info("****************************** starting test case : Change Drop Down Page of Task Management*********************");	
		
		TaskManagementPage.ChangeDropDownofperpage(Tasksperpage);
		log.info("******************************Ending test case : Change Drop Down Page of Task Management*********************");	
	}
	
	
	@Test(priority = 5, dataProvider = "getTestDataForTaskManagement",description="Suspend Task Management")
	public void SuspendTaskManagement(String Type,String Loglevel, String Devicegroup,String Tasksperpage)
	{
		reporterLog("Starting Test case Suspend Task Management");
		log.info("****************************** starting test case : Suspend Task Management*********************");
		TaskManagementPage.suspendTasksManagement();

		String ExpectedETsuspenedvalue = "Export task suspended";
		WebElement ActualETsuspenedvalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_TaskMgmtPage_verifytextExporttasksuspended")));         
		SoftAssertfunction(ActualETsuspenedvalue, ExpectedETsuspenedvalue);


		log.info("****************************** Ending test case : Suspend Task Management*********************");
	}

}
