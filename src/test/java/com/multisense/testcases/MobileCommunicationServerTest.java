package com.multisense.testcases;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DeviceCommunicationPage.MobileCommunicationServerPage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MobileCommunicationServerTest extends TestBase {

	Logger log = LogManager.getLogger(MobileCommunicationServerTest.class);
	String MCSSheet = "MobileCommunicationServer";
	MobileCommunicationServerPage MobileCommunicationServerPage;

	public MobileCommunicationServerTest() {
		super();
	}	

	@DataProvider
	public Object[][] getTestDataForMobileCommunicationServer() {
		Object testData[][] = TestUtil.getTestData(MCSSheet);
		return testData;
	}

	@Test(priority = 1,description= "verify And Select Mobile Communication Server")
	public void verifyAndSelectMobileCommunicationServer()

	{
		MobileCommunicationServerPage = new MobileCommunicationServerPage();
		MobileCommunicationServerPage.clickonMobileCommunicationServer();
		reporterLog("Starting testcase select Mobile Communication Servers");
		log.info("************************ starting testcase : select Mobile Communication Servers ************");
		
		MobileCommunicationServerPage.clickonAddMobileCommunicationServer();
		
		log.info("*************************Ending testcase : select Mobile Communication Servers *******");


	}

	@Test(priority = 2 , dataProvider = "getTestDataForMobileCommunicationServer",description= "Create Mobile Communication Server")
	public void CreatedMobileCommunicationServer(String Changesinterpolldelay,String OnlineComServer)

	{
		reporterLog("Starting testcase Create Mobile Communication Servers");
		log.info("************************ starting testcase : Create Mobile Communication Servers ************");
		MobileCommunicationServerPage.createMobileCommunicationServer(OnlineComServer);		
		
		String Expetedaddeservervalue = "Mobile communication server added";

		WebElement Actualaddeservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer")));
		
		SoftAssertfunction(Actualaddeservervalue, Expetedaddeservervalue);
		log.info("************************Ending testcase : Create Mobile Communication Servers*****************");
	}

	@Test(priority = 3, description= "Activate Mobile Communication Server")
	public void activationMobileCommunicationServer()

	{
		reporterLog("Starting testcase Activate Mobile Communication Servers");
		log.info("************************ starting testcase : Activate Mobile Communication Servers ************");
		MobileCommunicationServerPage.activateMobileCommunicationServer();		

		String Expetedactivateservervalue = "Communication server activated";

		WebElement Actualactivateservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer")));
		
		SoftAssertfunction(Actualactivateservervalue, Expetedactivateservervalue);
		log.info("************************ Ending testcase : Activate Mobile Communication Servers ************");
	}

	@Test(priority = 4, dataProvider = "getTestDataForMobileCommunicationServer",description= "Edit Mobile Communication Server")
	public void editionMobileCommunicationServer(String Changesinterpolldelay,String OnlineComServer)
	{
		reporterLog("Starting testcase Edit Mobile Communication Servers");
		log.info("************************ starting testcase : Edit Mobile Communication Servers ************");
		MobileCommunicationServerPage.editMobileCommunicationServer(Changesinterpolldelay);
		
		String Expetedsaveservervalue = "Mobile communication server saved";

		WebElement Actualsaveservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer")));
		//HardAssertfunction(Actualsaveservervalue, Expetedsaveservervalue);
		SoftAssertfunction(Actualsaveservervalue, Expetedsaveservervalue);
		log.info("************************ Ending testcase : Edit Mobile Communication Servers ************");
	}

	@Test(priority = 5, description= "Deactivate Mobile Communication Server")
	public void deactivedMobileCommunicationServer()
	{
		reporterLog("Starting testcase Deactivate Mobile Communication Servers");
		log.info("************************ starting testcase : Deactivate Mobile Communication Servers ************");
		MobileCommunicationServerPage.deactivateMobileCommunicationServer();	

		String Expeteddeactivateservervalue = "Communication server deactivated";

		WebElement Actualdeactivateservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer")));
		//HardAssertfunction(Actualdeactivateservervalue, Expeteddeactivateservervalue);
		SoftAssertfunction(Actualdeactivateservervalue, Expeteddeactivateservervalue);
		log.info("************************ Ending testcase : Deactivate Mobile Communication Servers ************");
	}

	@Test(priority = 6, description= "Remove Mobile Communication Server")
	public void removedMobileCommunicationServer()
	{
		reporterLog("Starting testcase Remove Mobile Communication Servers");
		log.info("************************ starting testcase : Remove Mobile Communication Servers ************");
		MobileCommunicationServerPage.removeMobileCommunicationServer();
		
		String Expetedremoveservervalue = "Communication server removed";
		WebElement Actualremoveservervalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer")));
		//HardAssertfunction(Actualremoveservervalue, Expetedremoveservervalue);
		SoftAssertfunction(Actualremoveservervalue, Expetedremoveservervalue);

		log.info("************************ Ending testcase : Remove Mobile Communication Servers ************");
	}
}
