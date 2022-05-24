package com.Dashboard.testcases;

import org.testng.annotations.Test;

import static com.util.ExtentReports.ExtentTestManager.reporterLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class DashboardTest  extends TestBase{

	Logger log = LogManager.getLogger(DashboardTest.class);         

	DashboardPage Dashboardpage;

	public DashboardTest()
	{
		super();
	}

	@Test(priority = 1, description = "Click Issue Dropdown") 
	public void clickIssuedropdown() throws InterruptedException
	{
		Dashboardpage = new DashboardPage();  
		reporterLog("Dashboard - Click Issue dropdown"); 
		log.info("****************************** Dashboard: click issue dropdown *****************************************");
		Dashboardpage.clickIssuedropdown();
		log.info("************** Ending test case : Dashboard click issue dropdown *******************");
	}

	@Test(priority = 2, description = "Click DeviceGroup Filter", enabled = true) 
	public void clickdevicegroupfilter () throws InterruptedException
	{
		reporterLog("Dashboard - Click device group filter"); 
		log.info("****************************** Dashboard: Click device group filter*****************************************");
		Dashboardpage.clickdevicegroupfilter();
		log.info("************** Ending testcase : Dashboard Click device group filter****************");
	}

	@Test(priority =3, description = "Click successful active connections", enabled = true) 
	public void clicksuccessfulactiveconnections () throws InterruptedException
	{
		reporterLog("Dashboard - clicksuccessfulactiveconnections"); 
		log.info("****************************** Dashboard: clicksuccessfulactiveconnections*****************************************");
		Dashboardpage.clicksuccessfulactiveconnections();
		String Expectedtitle = "Connections";
		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		waitForTime(2000);
		TitleAssertFunction(ConnectionTitle, Expectedtitle);
		log.info("************** Ending testcase : Dashboard clicksuccessfulactiveconnections*************");		
	}

	@Test(priority = 4, description = "Click ongoing active connections", enabled = true) 
	public void clickongoingactiveconnections () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clickongoingactiveconnections"); 
		log.info("****************************** Dashboard: clickongoingactiveconnections*****************************************");
		Dashboardpage.clickongoingactiveconnections();
		waitForTime(2000);
		String Expectedtitle = "Connections";
		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		waitForTime(2000);
		TitleAssertFunction(ConnectionTitle, Expectedtitle);
		log.info("*************** Ending testcase : Dashboard click ongoing active connections**************");		
	}

	@Test(priority = 5, description = "Click failed connections", enabled = true) 
	public void clickfailedactiveconnections () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clickfailedactiveconnections"); 
		log.info("****************************** Dashboard: clickfailedactiveconnections*****************************************");
		Dashboardpage.clickfailedactiveconnections();
		waitForTime(2000);
		String Expectedtitle = "Connections";
		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connections")));
		waitForTime(2000);
		TitleAssertFunction(ConnectionTitle, Expectedtitle);
		log.info("************** Ending testcase : Dashboard clickfailedactiveconnections******************");		
	}

	@Test(priority = 6, description = "Click view connections", enabled = true) 
	public void clickviewconnections () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clickviewconnections"); 
		log.info("****************************** Dashboard: clickviewconnections*****************************************");
		Dashboardpage.clickviewconnections();
		waitForTime(2000);
		String Expectedtitle = "Connections overview";
		WebElement ConnectionTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_connectionsoverview")));
		waitForTime(2000);
		TitleAssertFunction(ConnectionTitle, Expectedtitle);
		log.info("***************Ending testcase : Dashboard click view connections******************");		
	}

	@Test(priority = 7, description = "Click successful active communications", enabled = true) 
	public void clicksuccessfulactivecommunicactions () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clicksuccessfulactivecommunications"); 
		log.info("****************************** Dashboard: clicksuccessfulactiveconnections*****************************************");
		Dashboardpage.clicksuccessfulactivecommunicactions();
		waitForTime(2000);
		String Expectedtitle = "Communications";
		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		TitleAssertFunction(CommunicationTitle, Expectedtitle);
		log.info("************ Ending testcase : Dashboard click successful active connections************");		
	}

	@Test(priority = 8, description = "Click ongoing active communications", enabled = true) 
	public void clickongoingactivecommunicactions () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		//WebElement CommunicationTitle = driver.findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		reporterLog("Dashboard - clickongoingactivecommunicactions"); 
		log.info("****************************** Dashboard: clickongoingactivecommunicactions*****************************************");
		Dashboardpage.clickongoingactivecommunicactions();
		waitForTime(2000);
		String Expectedtitle = "Communications";
		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		TitleAssertFunction(CommunicationTitle, Expectedtitle);
		log.info("************Starting testcase Dashboard click ongoing active communicactions****************");		
	}

	@Test(priority = 9, description = "Click failed communications", enabled = true) 
	public void clickfailedcommunicactions () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clickfailedcommunicactions"); 
		log.info("****************************** Dashboard: clickfailedcommunicactions*****************************************");
		Dashboardpage.clickfailedcommunicactions();
		waitForTime(2000);
		String Expectedtitle = "Communications";
		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communications")));
		TitleAssertFunction(CommunicationTitle, Expectedtitle);
		log.info("************* Ending testcase : Dashboard click failed communicactions*******************");		
	}

	@Test(priority = 10, description = "click view communicactions", enabled = true) 
	public void clickviewcommunicactions () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clickviewcommunicactions"); 
		log.info("****************************** Dashboard: clickviewcommunicactions*****************************************");
		Dashboardpage.clickviewcommunicactions();
		waitForTime(2000);
		String Expectedtitle = "Communications overview";
		WebElement CommunicationTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoDashboard_dashboardtitle_communicationsoverview")));
		TitleAssertFunction(CommunicationTitle, Expectedtitle);
		log.info("************** Ending testcase : Dashboard click view communicactions********************");		
	}

	@Test(priority = 11, description = "click manage communicaction server", enabled = true) 
	public void clickmanagecommunicactionserver () throws InterruptedException
	{
		WebElement eleDashboard = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("MainMenu_Dashboard")));		
		doClick(eleDashboard);
		reporterLog("Dashboard - clickmanagecommunicactionserver"); 
		log.info("****************************** Dashboard: clickmanagecommunicactionserver*****************************************");
		Dashboardpage.clickmanagecommunicactionserver();
		log.info("*********** Ending testcase : Dashboard click manage communicaction server **********");		
	}
}

