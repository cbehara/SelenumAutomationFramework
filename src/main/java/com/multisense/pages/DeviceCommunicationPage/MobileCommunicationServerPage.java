package com.multisense.pages.DeviceCommunicationPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class MobileCommunicationServerPage extends TestBase {
		
	 String ServerName= generateRandomName(8);	 

	 public MobileCommunicationServerPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
        waitForTime(1000);
        Administration();
        waitForTime(3000);
	}
	public void clickonMobileCommunicationServer()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers, 10);	
		doClick(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServers);		
	}
	
	public String gettextofmobileCommunicationServer()
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifymobileCommunicationServer);
	}
	
	
	public void clickonAddMobileCommunicationServer()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerperpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerperpage")));
	     if(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerperpage.isDisplayed())
	     {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add mobile communication server')]//ancestor::a)[2]")).click();
	     }else {
	    	 DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add mobile communication server')]//ancestor::a)[1]")).click();
	     }
	}
     
	public void createMobileCommunicationServer(String OnlineComServer)	
	{
		waitForTime(5000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName, 10);
		doClear(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName);
		sendkeys(ServerName, ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName);
		waitForTime(1000);
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_mobileCommunicationServerName, 10);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown")));
		doClick(ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown);
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_onlineComServerDropDown, 10);
		DriverUtility.getDriver().findElement(By.xpath("//li[normalize-space()='"+OnlineComServer+"']")).click();
		
//		WebElement ConnexoMultisense_MobileCommsSrvrPage_onlineComServerValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_onlineComServerValue")));
//		doClick(ConnexoMultisense_MobileCommsSrvrPage_onlineComServerValue);;
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer")));
		doClick(ConnexoMultisense_MobileCommsSrvrPage_creationMobileCommunicationServer);
		waitForTime(1000);
		
	}
	
	public void activateMobileCommunicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_activateServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_activateServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_activateServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_activateServer);
	}
	
	public void editMobileCommunicationServer(String Changesinterpolldelay)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement ConnexoMultisense_MobileCommsSrvrPage_EditServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_EditServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_EditServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_EditServer);
		waitForTime(10000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay, 10);
		doClear(ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay);
		sendkeys(Changesinterpolldelay, ConnexoMultisense_MobileCommsSrvrPage_Changesinterpolldelay);
		waitForTime(5000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication, 10);
		doClear(ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication);
		sendkeys(ServerName, ConnexoMultisense_MobileCommsSrvrPage_serverNameMobilecommunication);
		waitForTime(1000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_saveServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_saveServer")));
		doClick(ConnexoMultisense_MobileCommsSrvrPage_saveServer);
	}
	
	public void deactivateMobileCommunicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_deactivateServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_deactivateServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_deactivateServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_deactivateServer);
	}
	
	public void removeMobileCommunicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+ ServerName +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoMultisense_MobileCommsSrvrPage_removeServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_removeServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_removeServer, 10);
		doClick(ConnexoMultisense_MobileCommsSrvrPage_removeServer);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ ServerName +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	}
	
	
	public String gettextofmcsremove()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextremoveServer);
	}
	
	public String gettextofmcsadd()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextaddedServer);
	}
	public String gettextofmcsActivate()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextactivateServer);
	}
	
	public String gettextofmcsSaved()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextSaveServer);
	}
	
	public String gettextofmcsDeactivate()
	{
		WebElement ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer")));
		TestUtil.waitforElementTobeLocated(ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer, 10);
		return getText(ConnexoMultisense_MobileCommsSrvrPage_verifytextDeactivatedServer);
	}
}
