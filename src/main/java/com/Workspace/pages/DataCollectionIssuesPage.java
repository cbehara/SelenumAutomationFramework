package com.Workspace.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class DataCollectionIssuesPage  extends TestBase{			

	public DataCollectionIssuesPage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		Workspace();
	}

	public void clickDataCollectionIssues()
	{
		waitForTime(3000);
		WebElement DataCollectionIssues = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DataCollectionIssues")));
		TestUtil.waitforElementTobeLocated(DataCollectionIssues, 10);
		doClick(DataCollectionIssues);
	} 

	public void ChangeDropdownperpage()
	{
		waitForTime(3000);
		WebElement DataCollectionIssuesPerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIPerpageDropDown")));
		doClick(DataCollectionIssuesPerpageDropDown);
		waitForTime(3000);
		WebElement DataCollectionIssuesPerpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIPerpagevalue")));
		doClick(DataCollectionIssuesPerpagevalue);
	}
	public void ClickBlukAction()
	{
		waitForTime(30000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
		WebElement DataCollectionIssuesBulkAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIBulkAction")));
		doClick(DataCollectionIssuesBulkAction);	
	}

	public void StepBulkAction()
	{


		WebElement DataCollectionIssuesSelectedIssueradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCISelectedIssueradioButton")));		
		doClick(DataCollectionIssuesSelectedIssueradioButton);	
		waitForTime(20000);
		DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[5]")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]")).click();
		WebElement DataCollectionIssuesNextButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCINextButton")));
		doClickjavaScript(DataCollectionIssuesNextButton);

		waitForTime(3000);
		WebElement DataCollectionIssuesCloseIssueradioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCICloseIssueradioButton")));
		doClick(DataCollectionIssuesCloseIssueradioButton);			
		doClick(DataCollectionIssuesNextButton);

		waitForTime(3000);
		WebElement DataCollectionIssuesResolvedRadioButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIResolvedRadioButton")));
		doClick(DataCollectionIssuesResolvedRadioButton);		
		doClick(DataCollectionIssuesNextButton);		

	}

	public void FinshBulkAction()
	{
		waitForTime(3000);
		WebElement DataCollectionIssuesConfirmButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIConfirmButton")));
		doClick(DataCollectionIssuesConfirmButton);

		waitForTime(3000);
		WebElement DataCollectionIssuesFinishButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoWorkspace_DCI_DCIFinishButton")));
		TestUtil.waitforElementTobeLocated(DataCollectionIssuesFinishButton, 10);
		doClick(DataCollectionIssuesFinishButton);
	}



}







