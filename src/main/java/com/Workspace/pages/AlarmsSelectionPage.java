package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class AlarmsSelectionPage extends TestBase {	
	
	public AlarmsSelectionPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(500);
		Workspace();
		WebElement eleWorkspacAlarmsLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkSpace_AlarmsPage_AlarmsLink")));
		TestUtil.waitforElementTobeLocated(eleWorkspacAlarmsLink, 30);
		doClick(eleWorkspacAlarmsLink);	
	}
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
		
}
