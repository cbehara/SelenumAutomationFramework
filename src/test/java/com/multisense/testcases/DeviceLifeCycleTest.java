package com.multisense.testcases;
import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.base.TestBase;
import com.multisense.pages.DevicesPage.DeviceLifecyclePage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class DeviceLifeCycleTest  extends TestBase{

	String AddDeviceLifecycleSheet = "AddDeviceLifecycle";

	Logger log = LogManager.getLogger(DeviceLifeCycleTest.class);         
	DeviceLifecyclePage DeviceLifecyclepage;


	public DeviceLifeCycleTest()
	{
		super();
	}	

	@DataProvider 
	public Object[][] getTestDataForAddDeviceLifecycle() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddDeviceLifecycleSheet);
		return testData;
	}

	@Test(priority =1, description = "click Device life cycle", enabled = true ) 
	public void clickDeviceLifecycle() throws InterruptedException
	{
		DeviceLifecyclepage = new DeviceLifecyclePage();   
		reporterLog("Starting Testcase Click Device Life Cycle");
		log.info("****************************** starting testcase : Device Life Cycle****************************");
		
		reporterLog("DeviceLifecycle");
		DeviceLifecyclepage.clickDeviceLifecycle();
		String ExpectedTitle = "Device life cycles";
		WebElement ActualTItle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleTitle")));         
		TitleAssertFunction(ActualTItle, ExpectedTitle);
		Thread.sleep(5000);
		log.info("******************************Ending testcase : Device Life Cycle****************************");
	}

	@Test(priority =2, description = "click add Device life cycle", enabled = true ) 

	public void clickaddDeviceLifecycle() throws InterruptedException
	{
		reporterLog("Starting Testcase Click Add Device Life Cycle");
		log.info("****************************** starting testcase : Click Add Device Life Cycle****************************");
		DeviceLifecyclepage.clickaddDeviceLifecycle();
		log.info("******************************Ending testcase : Click Add Device Life Cycle****************************");
	}

	@Test(priority =3, description = "create Device life cycle",enabled = true ) 

	public void createDeviceLifecycle() throws InterruptedException
	{
		reporterLog("Starting Testcase Create Device Life Cycle");
		log.info("****************************** starting testcase : Create Device Life Cycle****************************");
		DeviceLifecyclepage.createDeviceLifecycle();
		String Expecteddevicelifecycleadded = "Device life cycle added";
		WebElement Actuallifecycleadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifydevicelifecycleadded")));         
		SoftAssertfunction(Actuallifecycleadded, Expecteddevicelifecycleadded);
		Thread.sleep(5000);
		log.info("******************************Ending testcase : Create Device Life Cycle****************************");
	}


	@Test(priority =4, dataProvider = "getTestDataForAddDeviceLifecycle", description = "clickon Add Transitions", enabled = true ) 
	public void clickOnAddTransitions(String triggered, String from, String to) throws InterruptedException
	{
		reporterLog("Starting Testcase Click on Add Transitions");
		log.info("****************************** starting test case : Click on Add Transitions****************************");

		DeviceLifecyclepage.clickOnAddTransitions(triggered,from,to);
		String Expectedtransitionadded = "Transition added";
		WebElement Actualtransitionadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifytransitionadded")));

		SoftAssertfunction(Actualtransitionadded, Expectedtransitionadded);
		Thread.sleep(2000);
		log.info("******************************Ending test case : Click on Add Transitions****************************");
	}

	@Test(priority =5, description = "click Remove Device Life Cycle" ,enabled = true ) 
	public void clickRemoveDeviceLifecycle() throws InterruptedException
	{
		reporterLog("Starting Testcase Remove Device Life cycle");
		log.info("****************************** starting testcase : Remove Device Life cycle****************************");

		DeviceLifecyclepage.clickRemoveDeviceLifecycle();
		String Expecteddevicelifecycleremoved = "Device life cycle removed";
		WebElement Actualdevicelifecycleremoved = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_verifydevicelifecycleremoved")));

		SoftAssertfunction(Actualdevicelifecycleremoved, Expecteddevicelifecycleremoved);
		log.info("****************************** Ending Testcase : Remove Device Life cycle *****************************************");
		

	}
	
}

