package com.Workspace.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Workspace.pages.DataCollectionMyOpenIssuesPage;
import com.base.base.TestBase;
import com.util.util.TestUtil;

public class DataCollectionMyOpenIssuesTest extends TestBase {
	String DataCollectionMyOpenIssues = "Myopenissues";
	Logger log = LogManager.getLogger(DataCollectionMyOpenIssuesTest.class);	
	DataCollectionMyOpenIssuesPage DataCollectionMyOpenIssuesPage;

	public DataCollectionMyOpenIssuesTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataFormyopenissues() 
	{ 
		Object testData[][] = TestUtil.getTestDataFromWorkspace(DataCollectionMyOpenIssues);
		return testData;
	}

	@Test(priority = 1, dataProvider = "getTestDataFormyopenissues",description="Apply My open Issue -Data Collection" )
	public void ApplyMyopenIssue(String reason)
	{
		DataCollectionMyOpenIssuesPage = new DataCollectionMyOpenIssuesPage();
		DataCollectionMyOpenIssuesPage.clickDataCollectionMyOpenIssues();
		reporterLog("Starting Test case Apply my open issue");
		log.info("*************** Starting test case : Apply my open issue***************************");
		DataCollectionMyOpenIssuesPage.ApplyMyOpenIssuesConnectionIssue(reason); 
		log.info("*************** Ending test case : Apply my open issue***************************");
	}
}
