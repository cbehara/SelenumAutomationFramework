package com.ConnexoAdmin.pages.CalendarsPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class CalendarsPage extends TestBase {	

	String Calendar = prop.getProperty("ConnexoAdmin_CalenderPage_strCalendar");

	public  CalendarsPage()  
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
	}				

	public void clickCalendar() throws InterruptedException
	{
		Thread.sleep(5000);
		try {
			WebElement ConnexoAdmin_CalenderPage_Calendars = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_Calendars")));
			doClick(ConnexoAdmin_CalenderPage_Calendars);
		} 
		catch (Exception e)
		{			
			e.printStackTrace();
		}
	}

	public void Activatecalendar(String Calendar)
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Calendar +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_CalenderPage_activateCalendar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_activateCalendar")));


		TestUtil.waitforElementTobeLocated(ConnexoAdmin_CalenderPage_activateCalendar, 30);
		doClick(ConnexoAdmin_CalenderPage_activateCalendar);
		waitForTime(500);
	}


	public void Deactivatecalendar(String Calendar)
	{
		DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Calendar +"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(3000);
		WebElement ConnexoAdmin_CalenderPage_DeactivateCalendar = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_CalenderPage_DeactivateCalendar")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_CalenderPage_DeactivateCalendar, 30);			
		doClick(ConnexoAdmin_CalenderPage_DeactivateCalendar);
		waitForTime(500);
	}
}


