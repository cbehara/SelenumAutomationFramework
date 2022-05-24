package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommunicationPortPoolsPage extends TestBase{
	
	String communicationPortPoolNameValue= generateRandomName(8);				

	 public CommunicationPortPoolsPage()	
		{
			login();
			PageFactory.initElements(DriverUtility.getDriver(), this);
			Multisense();
	        waitForTime(1000);
	        Administration();
	        waitForTime(3000);
		}
	    public void clickonCommunicationPortPool()
		{ 
	    	WebElement ConxoMultisense_CommPortPoolsPage_communicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_communicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_communicationPortPool, 10);	
			doClick(ConxoMultisense_CommPortPoolsPage_communicationPortPool);		
		}
	    
	    public String gettextofCommunicationPortPool()
		{
			waitForTime(5000);
			WebElement ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifycommunicationPortPool);
		}
	    
	    public void clickonAddCommunicationPortPool()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage")));
		     if(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpage.isDisplayed())
		     {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication port pool')]//ancestor::a)[2]")).click();
		    	 WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool")));
		    	 TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool, 10);
					doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool);
		     }else {
		    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add communication port pool')]//ancestor::a)[1]")).click();
		    	 WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool")));
		    	 TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool, 10);
					doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPool);
				}
		}
	    public void AddOnlineCommunicationPortPool(String Type,String TaskExecutionTimeout)
		{
			waitForTime(5000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName, 10);
			doClear(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			sendkeys(communicationPortPoolNameValue, ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolName);
			waitForTime(1000);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeDropDown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ Type +"']")).click();
//			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue")));
//			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue, 10);
//			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTypeValue);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutDropDown);
			DriverUtility.getDriver().findElement(By.xpath("//li[text()='"+ TaskExecutionTimeout +"']")).click();
//			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue")));
//			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue, 10);
//			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolTimeOutValue);
			WebElement ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_OutboundCommunicationPortPoolAdd);
		}
	    
	    public void ChangePerpageCommunicationPortPool()
	    {
	    	waitForTime(5000);
	    	WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpageDropDown);
			WebElement ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_CommunicationPortPoolPerpagevalue);
	    }
	    
	    public void activateCommunicationPortPool()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer  = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_ActivateOutboundCommunicationPortPoolServer);
		}
	  
	    
	    public void deactivateCommunicationPortPool()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_DeactivateOutboundCommunicationPortPool);
		}
	    
	    public void removeCommunicationPortPool()
		{
			waitForTime(5000);
			DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ communicationPortPoolNameValue +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool, 10);
			doClick(ConxoMultisense_CommPortPoolsPage_RemoveOutboundCommunicationPortPool);
			waitForTime(2000);
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ communicationPortPoolNameValue +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	    
	    public String gettextofCPPremove()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextremoveCommunicationPortPool);
		}
	    
	    public String gettextofCPPAdd()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextAddCommunicationPortPool);
		}
	    
	    public String gettextofcsSave()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextSaveCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextSaveCommunicationPortPool")));
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool")));
	    	TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextSaveCommunicationPortPool);
		}
	    
	    public String gettextofCPPActivate()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextactivateCommunicationPortPool);
		}
	    
	    public String gettextofCPPDeactivate()
		{
	    	WebElement ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool")));
			TestUtil.waitforElementTobeLocated(ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool, 10);
			return getText(ConxoMultisense_CommPortPoolsPage_verifytextDeactivatedCommunicationPortPool);
		}
			
}
