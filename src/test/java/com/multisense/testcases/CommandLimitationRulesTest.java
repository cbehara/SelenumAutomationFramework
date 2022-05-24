package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.CommandLimitationRulePage;

public class CommandLimitationRulesTest extends TestBase {

	CommandLimitationRulePage CommandLimitationRulePage;

	Logger log = LogManager.getLogger(CommandLimitationRulePage.class);

	public CommandLimitationRulesTest() {
		super();
	}	

	@Test(priority = 1,description="Verify And Select Command Limitation Rule")
	public void verifyAndSelectCommandLimitationRule()

	{
		CommandLimitationRulePage = new CommandLimitationRulePage();
		CommandLimitationRulePage.clickonCommandLimitationRule();
		reporterLog("Starting testcase Verify and Select Command Limitation Rule"); 
		log.info("****************************** starting test case : Verify and Select Command Limitation Rule *****************************************");
		String ExpectedValue= "Command limitation rules";
		String ActualValue =CommandLimitationRulePage.gettextofCommandLimitationRule();
		Assert.assertEquals(ActualValue, ExpectedValue);
		CommandLimitationRulePage.clickonAddCommandLimitationRule();
		log.info("****************************** Ending test case : Verify and Select Command Limitation Rule *****************************************");
	}

	@Test(priority = 2 , description="Create Command Limitation Rule")
	public void CreatedCommandLimitationRule()

	{
		reporterLog("Starting testcase Verify and Select Command Limitation Rule"); 
		log.info("****************************** starting test case : Create Command Limitation Rule *****************************************");

		CommandLimitationRulePage.AddCommandLimitationRule();

		log.info("****************************** Ending test case : Create Command Limitation Rule *****************************************");
	}

	@Test(priority = 3, description="Created ADD Command Command Limitation Rule")
	public void CreatedADDCommandCommandLimitationRule()

	{
		reporterLog("Starting testcase Create Add Command Limitation Rule"); 
		log.info("****************************** starting test case : Create Add Command Limitation Rule *****************************************");

		CommandLimitationRulePage.AddCommandsCommandLimitationRule();	


		log.info("****************************** Ending test case : Create Add Command Limitation Rule *****************************************"); 
	}

	@Test(priority = 4, description="Activate Command Limitation Rule")
	public void activationCommandLimitationRule()

	{
		reporterLog("Starting testcase Activate Command Limitation Rule"); 
		log.info("****************************** starting test case : Activate Command Limitation Rule *****************************************");
		CommandLimitationRulePage.activateCommandLimitationRule();

		log.info("****************************** Ending test case : Activate Command Limitation Rule *****************************************"); 
	}

	@Test(priority = 5, description="Edit Command Limitation Rule")
	public void editedCommandLimitationRule()
	{
		reporterLog("Starting testcase Edit Command Limitation Rule"); 
		log.info("****************************** starting test case : Edit Command Limitation Rule *****************************************");
		CommandLimitationRulePage.editCommandLimitationRule();
		log.info("****************************** Ending test case : Edit Command Limitation Rule *****************************************");
	}

	@Test(priority = 6, description="Changed Daylimit Command Limitation Rule")
	public void changedDaylimitCommandLimitationRule()
	{
		reporterLog("Starting testcase Change Daily Limit Command Limitation Rule"); 
		log.info("****************************** starting test case : Change Daily Limit Command Limitation Rule *****************************************");
		CommandLimitationRulePage.editdayLimitCommandLimitationRule();

		log.info("****************************** Ending test case : Change Daily Limit Command Limitation Rule *****************************************"); 
	}

	@Test(priority = 7, description="View Pending Changes Command Limitation Rule")
	public void viewPendingChangesCommandLimitationRule()
	{	
		reporterLog("Starting testcase viewPendingChanges Command Limitation Rule"); 
		log.info("****************************** starting test case : viewPendingChanges Command Limitation Rule *****************************************");
		CommandLimitationRulePage.viewPendingChanges();
		log.info("****************************** Ending test case : viewPendingChanges Command Limitation Rule *****************************************");
	}

	@Test(priority = 8, description="Remove Command Limitation Rule")
	public void removedCommandLimitationRule()
	{	
		reporterLog("Starting testcase Remove Command Limitation Rule"); 
		log.info("****************************** starting test case : Remove Command Limitation Rule *****************************************");
		CommandLimitationRulePage.removeCommandLimitationRule();

		log.info("****************************** Ending test case : Remove Command Limitation Rule *****************************************");
	}
}
