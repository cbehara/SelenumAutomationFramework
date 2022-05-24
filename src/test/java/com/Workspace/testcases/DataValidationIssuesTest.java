package com.Workspace.testcases;



import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.DataValidationIssuesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataValidationIssuesTest extends TestBase {
	String DataValidationIssues = "Validationissues";
	Logger log = LogManager.getLogger(DataCollectionMyOpenIssuesTest.class);	
	DataValidationIssuesPage DataValidationIssuesPage;

	public DataValidationIssuesTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForDataValidationissues() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(DataValidationIssues);
		return testData;
	}

	@Test(priority = 1 , dataProvider = "getTestDataForDataValidationissues",description="Apply Data Validation Issues")
	public void ApplyDataValidationIssues(String reason)
	{
		DataValidationIssuesPage = new DataValidationIssuesPage();
		DataValidationIssuesPage.clickDataValidationIssues();
		reporterLog("Starting Test case Apply Data Validation Issues");
		log.info("************* starting test case : Apply Data Validation Issues***********************");
		String ExpectedValue= "Issues"; 
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_VerifyDataValidationIssues")));		
		SoftAssertfunction(ActualValue, ExpectedValue);
		DataValidationIssuesPage.ApplyDataValidationIssues(reason); 
		log.info("************* Ending test case : Apply Data Validation Issues***********************");
	}

}








