package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommunicationTasksPage;

public class CommunicationTasksTest extends TestBase {
	  Logger log = LogManager.getLogger(CommunicationTasksTest.class);
      CommunicationTasksPage CommunicationTasksPage ;
     
     public CommunicationTasksTest() {
 		super();
 	}     
	
	@Test(priority = 1,description="Change Task per page")
	public void ChangeTaskperpage()
	
	{
		CommunicationTasksPage = new CommunicationTasksPage ();
		CommunicationTasksPage.clickonCommunicationTask();
		reporterLog("Starting Change Communication Task per page test case");
		log.info("****** starting test case : Change Communication Task per page *************");
				
		CommunicationTasksPage.ChangePerpagevalue();
		
		log.info("****** Ending test case : Change Communication Task per page *************");
		
	}
	
	@Test(priority = 2, description="Verify And Select Communication Task")
	public void verifyAndSelectCommunicationTask()	
	{	
		reporterLog("Starting Select Communication Task test case");
		log.info("****** starting test case : Select Communication Task test case *************");
        
        CommunicationTasksPage.clickonAddCommunicationTask();
        
        log.info("*************** Ending test case : Select Communication Task test case **********");
	}
	
	@Test(priority = 3, description="Created Communication Task")
	public void CreatedCommunicationTask()
	
	{
		reporterLog("Starting Create Communication Task test case");
		log.info("****** starting test case : Create Communication Task test case *************");
		
		CommunicationTasksPage.createCommunicationTask();	
		
		log.info("****** Ending test case : Create Communication Task test case *************");
	}
	
	@Test(priority = 4, description="Created Common Categories")
	public void CreatedCommonCategories( )
	
	{
		reporterLog("Starting Create Commom Categories test case");
		log.info("****** starting test case : Create Commom Categories test case *************");
		
		CommunicationTasksPage.createCommandCategories();
		
		log.info("****** Ending test case : Create Commom Categories test case *************");
	}
	
	@Test(priority = 5, description="Check Activity Calender Common Categories")
	public void CheckActivityCalenderCommonCategories( )
	
	{
		reporterLog("Starting Check Activity Calender Common Categories");
		log.info("****** starting test case : Check Activity Calender Common Categories *************");
		
		CommunicationTasksPage.CheckActivityCalender();
		
		log.info("****** Ending test case : Check Activity Calender Common Categories *************");
	}

}


