package com.multisense.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.base.base.TestBase;
import com.multisense.pages.DevicesPage.DeviceTypePage;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class DeviceTypeTest  extends TestBase{

	String AddDeviceTypeSheet = "AddDeviceType";
	Logger log = LogManager.getLogger(DeviceTypeTest.class);            

	DeviceTypePage DeviceTypespage;

	public DeviceTypeTest()
	{
		super();
	}

	@DataProvider 
	public Object[][] getTestDataForAddDeviceType() 
	{ 
		Object testData[][] = TestUtil.getTestData(AddDeviceTypeSheet);
		return testData;
	}	             

	@Test(priority =1, description = "click device type", enabled = true ) 
	public void clickDeviceType() throws InterruptedException
	{
		DeviceTypespage = new DeviceTypePage();            
		reporterLog("Starting testcase Click DeviceType");
		log.info("****************************** starting test case : Click Device Type ***************************");
		DeviceTypespage.clickDeviceType();
		log.info("****************************** Ending test case  Click Device Type ***************************");		
	}

	@Test(priority =2, description = "click add device type button", enabled = true ) 
	public void clickaddDevicetypebutton() throws InterruptedException
	{
		reporterLog("Starting testcase Click and Add DeviceType button");
		log.info("****************************** starting test case : Click and Add DeviceType button ******************");
		DeviceTypespage.clickaddDevicetypebutton();
		log.info("****************************** Ending test case : Click and Add DeviceType button ******************");
	}

	@Test(priority =3, dataProvider = "getTestDataForAddDeviceType", description = " add device type ", enabled = true ) 
	public void addDeviceType(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Add DeviceType");
		log.info("****************************** starting test case : Add DeviceType ******************");
		DeviceTypespage.addDeviceType(Type, Communicationprotocol,DeviceLifecyle );
		String Expecteddevicetypeeadded = "Device type added";
		WebElement Actuallifetypeadded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_verifydevicetypeadded")));        
		SoftAssertfunction(Actuallifetypeadded, Expecteddevicetypeeadded);
		waitForTime(5000);
		log.info("****************************** Ending test case : Add DeviceType ******************");
	}

	@Test(priority =4, dataProvider = "getTestDataForAddDeviceType", description = "add device type config", enabled = true ) 
	public void addDeviceTypeconfig(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Add DeviceType Configuration");
		log.info("****************************** starting test case : Add DeviceType Configuration******************");
		DeviceTypespage.devicetypeconfig(Name , Description);
		log.info("****************************** Ending test case : Add Device Type Configuration********************");

	}

	@Test(priority =5, dataProvider = "getTestDataForAddDeviceType", enabled = true ) 
	public void removedevicetype(String Type, String Communicationprotocol , String DeviceLifecyle ,String Name, String Description) throws InterruptedException
	{
		reporterLog("Starting testcase Remove DeviceType Configuration");
		log.info("****************************** starting test case : Add DeviceType Configuration******************");
		DeviceTypespage.removeDevicetype(Communicationprotocol);
		log.info("****************************** Ending test case: Remove Device Type ******************************");

	}	

}

