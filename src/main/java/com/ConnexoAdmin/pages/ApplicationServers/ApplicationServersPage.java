
package com.ConnexoAdmin.pages.ApplicationServers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class ApplicationServersPage extends TestBase {

	String ApplicationServersNameValue= generateRandomName(8);
	String UpdatedApplicationServerNameValue= "updateApplicationServersAutomatedTest";

	public ApplicationServersPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(5000);
	}

	public void clickonApplicationServer()
	{            
		WebElement eleApplicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServers")));
		TestUtil.waitforElementTobeLocated(eleApplicationServers, 10);           
		doClick(eleApplicationServers);               
	}

	public String gettextofApplicationServer()
	{
		waitForTime(5000);
		WebElement eleverifyApplicationServers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifyApplicationServers")));
		TestUtil.waitforElementTobeLocated(eleverifyApplicationServers, 10);
		return getText(eleverifyApplicationServers);
	}

	public void clickonAddApplicationServer()
	{
		WebElement eleApplicationServersPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServersPerPage")));
		if(eleApplicationServersPerPage.isDisplayed())
		{
			WebElement element = DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add application server']//ancestor::a)[2]"));
			doClick(element);
		}else {
			WebElement element = DriverUtility.getDriver().findElement(By.xpath("(//span[text()='Add application server']//ancestor::a)[1]"));
			doClick(element);
		}
	}

	public void createApplicationServer(String ServerName,String ExportPath,String ImportPath) 
	{
		WebElement eleInputNameApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_InputNameApplicationServer")));
		waitForTime(5000);
		TestUtil.waitforElementTobeLocated(eleInputNameApplicationServer, 10);
		doClear(eleInputNameApplicationServer);
		sendkeys(ApplicationServersNameValue, eleInputNameApplicationServer);
		waitForTime(1000);
		WebElement eleExportPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ExportPathValue")));
		TestUtil.waitforElementTobeLocated(eleExportPathValue, 10);               
		doClear(eleExportPathValue);
		sendkeys(ExportPath, eleExportPathValue);
		waitForTime(1000);
		WebElement eleImportPathValue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ImportPathValue")));
		TestUtil.waitforElementTobeLocated(eleImportPathValue, 10);
		doClear(eleImportPathValue);
		sendkeys(ImportPath, eleImportPathValue);
		waitForTime(1000);
		WebElement eleApplicationServerAdded = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ApplicationServerAdded")));
		doClickjavaScript(eleApplicationServerAdded);         
	}

	public void activateApplicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement eleActivateApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_ActivateApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleActivateApplicationServer, 10);
		doClick(eleActivateApplicationServer);
	}

	public void deactivateApplicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement eleDeactivateApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_DeactivateApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleDeactivateApplicationServer, 10);
		doClick(eleDeactivateApplicationServer);
	}

	public void editApplicationServer()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span")).click();
		WebElement eleEditApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_EditApplicationServere")));
		TestUtil.waitforElementTobeLocated(eleEditApplicationServer, 10);
		doClick(eleEditApplicationServer);
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='BulkSAPRegNotificationQS']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(1000);
		WebElement eleSaveApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_SaveApplicationServer")));
		doClickjavaScript(eleSaveApplicationServer);
	}

	public void removeApplicationServer()
	{
		waitForTime(5000);
		WebElement element = DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ ApplicationServersNameValue +"']//ancestor::td//following-sibling::td//span"));
		doClick(element);
		waitForTime(3000);
		WebElement eleRemoveApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_RemoveApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleRemoveApplicationServer, 10);
		doClick(eleRemoveApplicationServer);
		waitForTime(2000);
		WebElement eleAppServerValue = DriverUtility.getDriver().findElement(By.xpath("//*[contains(text(),'"+ ApplicationServersNameValue +"')]//ancestor::div//a[normalize-space()='Remove']"));
		doClick(eleAppServerValue);
	}

	public String gettextofAddApplicationServer()
	{
		WebElement eleverifytextAddApplicationServer = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("connexoAdmin_verifytextAddApplicationServer")));
		TestUtil.waitforElementTobeLocated(eleverifytextAddApplicationServer, 10);
		return getText(eleverifytextAddApplicationServer);
	}

}

