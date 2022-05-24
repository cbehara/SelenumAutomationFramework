package com.Workspace.testcases;


import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.AlarmsSelectionPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class AlarmsSelectionTest extends TestBase {

	Logger log = LogManager.getLogger(AlarmsSelectionTest.class);
	
	String AlarmsSheet = "Alarms";	
	
	AlarmsSelectionPage alarmsSelectionPage;	
	

	public AlarmsSelectionTest()
	{
		super();
	}		

	@DataProvider(name = "dp1")
    public Object[][] getTestDataForWorkspaceAlarms() 
    { 
   	 Object testData[][] = TestUtil.getTestDataFromWorkspace(AlarmsSheet);
   	 return testData;
    }

	@Test (priority = 1, description = "Verify Navigation to Workspace Alarms page")	
	public void verifyNavigationToAlarmsPage() 
	{			
		alarmsSelectionPage = new AlarmsSelectionPage();
		
		reporterLog("Starting testcase Verify Navigation to Workspace Alarms page");
		
		log.info("************* starting test case : Verify Navigation to Workspace Alarms page **************");

		log.info("Asserting Alarms page title");
		
		String expectedAlarmPageTitle = "Alarms";
		
		WebElement eleActualPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_Title")));
		
		TestUtil.waitforElementTobeLocated(eleActualPageTitle, 5);
		
		SoftAssertfunction(eleActualPageTitle, expectedAlarmPageTitle);		
	
		log.info("************** Ending test case : Verify Navigation to Workspace Alarms page ****************");
	}

	@Test (priority = 2,dataProvider = "dp1", description = "Select Alarm Filter And Apply")
	public void selectStatusAndApply(String combobox1, String itemlist, String status, String reason, String combobox2) 
	{			
		reporterLog("Starting test case select Alarm Filter And Apply");
		
		log.info("************** starting test case : select Alarm Filter And Apply************************");
		
		waitForTime(500);		
		
		WebElement ConnexoWorkSpace_Alarms_ClearAllButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_Alarms_ClearAllButton")));
		
		ConnexoWorkSpace_Alarms_ClearAllButton.click();
		
		waitForTime(500);
		
		log.info("Selecting value in the Reason field");
		
		selectComboBoxItems(combobox2, itemlist, reason);		
		
		waitForTime(500);
		
		log.info("Selecting value in the Status field" );
		
		waitForTime(500);
		
		selectComboBoxItems(combobox1, itemlist, status);	

		log.info("************** Ending test case : select Alarm Filter And Apply ********************");
	}
}
