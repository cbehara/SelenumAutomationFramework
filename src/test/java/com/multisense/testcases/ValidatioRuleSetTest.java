package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.ValidationPage.ValidationRuleSetPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ValidatioRuleSetTest extends TestBase{
	Logger log = LogManager.getLogger(ValidatioRuleSetTest.class);	

	String AddValidationRuleSetSheet = "AddValidationRuleSet";

	ValidationRuleSetPage ValidationRuleSetPage;

	public ValidatioRuleSetTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForAddValidationRuleSet() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddValidationRuleSetSheet); 
		return testData;
	}

	@Test(priority =1,description="verifyandSelectValidationRuleSet") 
	public void verifyandSelectValidationRuleSet( ) 
	{
		ValidationRuleSetPage = new  ValidationRuleSetPage();
		ValidationRuleSetPage.clickValidationRuleSet();
		reporterLog("Starting Test case  Validation rule Set");
		log.info("********************** Starting Test case: Adding Validation Rule Set ***********************");

		ValidationRuleSetPage.clickAddValidationRuleSet();
		log.info("********************** Ending Test case: Adding Validation Rule Set ***********************");

	}
	@Test(priority = 2, dataProvider = "getTestDataForAddValidationRuleSet",description="Create Validation RuleSet")
	public void CreateValidationRuleSet(String Description,  String UpdateDescription,
			String versionDescription, String UpdateVersionDescription,String CloneUpdateVersionDescription)
	{
		reporterLog("Starting Test case  Create Validation rule Set");
		log.info("********************** Starting Test case: Create Validation Rule Set ***********************");
		ValidationRuleSetPage.createAndEditValidationRuleset( Description);
			  
		log.info("********************** Ending Test case: Create Validation Rule Set ***********************"); 
	}
	
	@Test(priority = 3, description="Add Validation RuleSet")
	public void addValidationRuleSet()
	{
		reporterLog("Starting Test case  Create Validation rule Set");
		log.info("********************** Starting Test case: Create Validation Rule Set ***********************");
		ValidationRuleSetPage.clickAddValidationRuleSetButton();
		String ExpectedAddedValidationRuleSet ="Validation rule set added";
		WebElement ActualAddedValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextAddValidationRuleSet")));
        SoftAssertfunction(ActualAddedValidationRuleSet , ExpectedAddedValidationRuleSet);		  
		log.info("********************** Ending Test case: Create Validation Rule Set ***********************"); 
	}

	@Test(priority = 4, dataProvider = "getTestDataForAddValidationRuleSet",description="Create ValidtionruleSetVersion")
	public void CreateValidtionruleSetVersion(String Description,  String UpdateDescription,
			String versionDescription, String UpdateVersionDescription,String CloneUpdateVersionDescription)
	{
		reporterLog("Starting Test case  Create Validation rule Set version");
		log.info("********************** Starting Test case: Create Validation Rule Set version****************");
		ValidationRuleSetPage.addValidationRuleSetVersion(versionDescription,UpdateVersionDescription,CloneUpdateVersionDescription);
		log.info("********************** Ending Test case: Create Validation Rule Set version****************");
	}


	@Test(priority = 5, description="Edit Validation ruleSet")
	public void editValidationruleSet() 
	{
		reporterLog("Starting Test case  Edit Validation rule Set version");
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
		ValidationRuleSetPage.clickOnEditvalidateRuleSet();
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
	}
	
	@Test(priority = 6, dataProvider = "getTestDataForAddValidationRuleSet",description="Create and edit Validation ruleSet")
	public void createandeditValidationruleSet(String Description,  String UpdateDescription,
			String versionDescription, String UpdateVersionDescription,String CloneUpdateVersionDescription) 
	{
		reporterLog("Starting Test case  Edit Validation rule Set version");
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
		ValidationRuleSetPage.createAndEditValidationRuleset( UpdateDescription);
		log.info("********************** Starting Test case: Edit Validation Rule Set version****************");
	}


	@Test(priority = 7, description="Save validation Rule Set")
	public void savevalidationRuleSet()
	{
		reporterLog("Starting Test case  Save Validation rule Set version");
		log.info("********************** Starting Test case: Save Validation Rule Set version****************");
		ValidationRuleSetPage.clickOnSavevalidateRuleSet();
		String ExpectedSavedValidationRuleSet ="Validation rule set saved";
		WebElement ActualSavedValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextsavedValidationRuleSet")));

		SoftAssertfunction(ActualSavedValidationRuleSet,ExpectedSavedValidationRuleSet);
		log.info("********************** Ending Test case: Save Validation Rule Set version****************");
	}

	@Test(priority = 8, description="Remove validation Rule set")
	public void removevalidationRuleset()
	{
		reporterLog("Starting Test case  Remove Validation rule Set version");
		log.info("********************** Starting Test case: Remove Validation Rule Set version****************");
		ValidationRuleSetPage.clickRemovevalidationRuleSet();
		String ExpectedRemoveValidationRuleSet = "Validation rule set removed";
		WebElement ActualRemoveValidationRuleSet = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_ValidationRulePage_verifytextremoveValidationRuleSet")));
		//HardAssertfunction(ActualRemoveValidationRuleSet, ExpectedRemoveValidationRuleSet);   
		SoftAssertfunction(ActualRemoveValidationRuleSet, ExpectedRemoveValidationRuleSet);


		log.info("********************** Ending Test case: Remove Validation Rule Set version****************");

	}
}

