package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Workspace.pages.DataCollectionIssuesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class DataCollectionIssuesTest extends TestBase {

	Logger log = LogManager.getLogger(DataCollectionIssuesTest.class);

	DataCollectionIssuesPage DataCollectionIssuesPage;

	public DataCollectionIssuesTest() {
		super();
	} 	

	@Test(priority = 1, description="verify And Change PerPage Data Collection Issues")
	public void verifyAndChangePerPage()
	{
		DataCollectionIssuesPage = new DataCollectionIssuesPage();
		DataCollectionIssuesPage.clickDataCollectionIssues();
		reporterLog("Starting testcase Data Collection Issues verify And Change Per Page"); 
		log.info("****************** starting test case : Data Collection Issues verify And Change Per Page *******");

		String ExpectedValue= "Issues"; 
		WebElement ActualValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DVI_VerifyDataValidationIssues")));	
		SoftAssertfunction(ActualValue, ExpectedValue);

		DataCollectionIssuesPage.ChangeDropdownperpage();
		log.info("***************** Ending test case : Data Collection Issues verify And Change Per Page *********");
	}

	@Test(priority = 2, description="ClickOn Bluk Action Data Collection Issues")
	public void ClickOnBlukAction()
	{
		reporterLog("Starting testcase Data Collection Issues Click On Bluk Action"); 
		log.info("***************** starting test case : Data Collection Issues Click On Bluk Action *************");
		DataCollectionIssuesPage.ClickBlukAction();
		log.info("***************** Ending test case : Data Collection Issues Click On Bluk Action ***************");
	}

	@Test(priority = 3, description="Bluk Action Steps Data Collection Issues")
	public void BlukActionSteps()
	{
		reporterLog("Starting testcase Data Collection Issues Bluk Action Steps"); 
		log.info("************** starting test case : Data Collection Issues Bluk Action Steps *********************");
		DataCollectionIssuesPage.StepBulkAction();
		log.info("*************** Ending test case : Data Collection Issues Bluk Action Steps **********************");
	}
	
	@Test(priority = 4, description="Confirm and Finish Bluk Action Data Collection Issues")
	public void ConfirmandFinishBlukAction()
	{
		reporterLog("Starting testcase Data Collection Issues Confirmand Finish Bluk Action"); 
		log.info("************ starting test case : Data Collection Issues Confirmand Finish Bluk Action **************");
		DataCollectionIssuesPage.FinshBulkAction(); 
		log.info("************ Ending test case :  Data Collection Issues Confirmand Finish Bluk Action ***************");

	}
}
