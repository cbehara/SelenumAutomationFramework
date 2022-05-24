package com.Dashboard.pages;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage extends TestBase {


	public  DashboardPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Dashboard();
	}

	public void clickIssuedropdown() throws InterruptedException
	{
		WebElement Issuesdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Issuesdropdown")));
		doClick(Issuesdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='Alarms']")).click();
	}

	public void clickdevicegroupfilter() throws InterruptedException
	{
		WebElement devicegroupdropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_devicegroupdropdown")));
		TestUtil.waitforElementTobeLocated(devicegroupdropdown, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(devicegroupdropdown);
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(@class,'x-component x-box-item')]//a")).click();
		waitForTime(5000);

	}

	public void clicksuccessfulactiveconnections() throws InterruptedException
	{
//		 WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement Successfulactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Successfulactivelink")));	
		TestUtil.waitforElementTobeLocated(Successfulactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(Successfulactivelink);
		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clickongoingactiveconnections() throws InterruptedException
	{
//		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement ongoingactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_ongoingactivelink")));	
		TestUtil.waitforElementTobeLocated(ongoingactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(ongoingactivelink);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clickfailedactiveconnections() throws InterruptedException
	{
//		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement Failedactivelink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_Failedactivelink")));	
		TestUtil.waitforElementTobeLocated(Failedactivelink, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(Failedactivelink);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clickviewconnections() throws InterruptedException
	{
//		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		WebElement viewconnectionoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_viewconnectionoverview")));	
		TestUtil.waitforElementTobeLocated(viewconnectionoverview, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(viewconnectionoverview);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clicksuccessfulactivecommunicactions() throws InterruptedException
	{
		
		WebElement successfulcommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_successfulcommunication")));	
		TestUtil.waitforElementTobeLocated(successfulcommunication, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(successfulcommunication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clickongoingactivecommunicactions() throws InterruptedException
	{
//		 WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		WebElement ongoingcommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_ongoingcommunication")));
		TestUtil.waitforElementTobeLocated(ongoingcommunication, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(ongoingcommunication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clickfailedcommunicactions() throws InterruptedException
	{
//		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		WebElement failedcommunication = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_failedcommunication")));
		TestUtil.waitforElementTobeLocated(failedcommunication, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(failedcommunication);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void clickviewcommunicactions() throws InterruptedException
	{
//		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		WebElement viewcommunicationoverview = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_viewcommunicationoverview")));
		TestUtil.waitforElementTobeLocated(viewcommunicationoverview, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(viewcommunicationoverview);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void clickmanagecommunicactionserver() throws InterruptedException
	{
		WebElement managecommservers = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_managecommservers")));
		TestUtil.waitforElementTobeLocated(managecommservers, 10);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		doClick(managecommservers);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
}


