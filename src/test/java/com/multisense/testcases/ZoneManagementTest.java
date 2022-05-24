package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.ZoneManagement.ZoneManagementPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ZoneManagementTest extends TestBase {
	Logger log = LogManager.getLogger(ZoneManagementTest.class);
	ZoneManagementPage ZoneManagementPage;

	String ZoneSheet = "ZoneManagmenet";   
	public ZoneManagementTest() {
		super();
	}

	@DataProvider
	public Object[][] getTestDataForZoneManagement() {
		Object testData[][] = TestUtil.getTestData(ZoneSheet);
		return testData;
	}


	@Test(priority = 1,dataProvider = "getTestDataForZoneManagement",description="verify And Creating Zone")
	public void verifyAndCreatingZone(String ZoneType,String UpdatedZoneName)

	{
		ZoneManagementPage = new ZoneManagementPage();
		ZoneManagementPage.clickonZoneManagement();
		reporterLog("Starting Test case zones");
   	 	log.info("****************************** starting test case : zones*****************************");
		ZoneManagementPage.createZOne(ZoneType);	
		
		log.info("****************************** Ending test case : zones*****************************");
	}

	@Test(priority = 2, dataProvider = "getTestDataForZoneManagement",description="Editing Zone")
	public void edtingZone(String ZoneType,String UpdatedZoneName)

	{	
		reporterLog("Starting Test case Edit zones");
   	 	log.info("****************************** starting test case : Edit zones*****************************");
		ZoneManagementPage.editZone(UpdatedZoneName);
		reporterLog("Starting Test case Edit zones");
   	 	log.info("****************************** Ending test case : Edit zones*****************************");
	}

	@Test(priority = 3, dataProvider = "getTestDataForZoneManagement" ,description="Removing Zone")
	public void removeZone(String ZoneType,String UpdatedZoneName)

	{
		reporterLog("Starting Test case Remove zones");
   	 	log.info("****************************** starting test case : Remove zones*****************************");  
		ZoneManagementPage.removeZone(UpdatedZoneName);
		String ExpectedZoneRemovedValue= "Zone removed";
		WebElement ActualZoneRemovedValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ZoneMgmtPage_verifyremoveZoneManagement")));
		//HardAssertfunction(ActualZoneRemovedValue, ExpectedZoneRemovedValue);   
		SoftAssertfunction(ActualZoneRemovedValue, ExpectedZoneRemovedValue);

		log.info("****************************** Ending test case : Remove zones*****************************");
	}         
}
