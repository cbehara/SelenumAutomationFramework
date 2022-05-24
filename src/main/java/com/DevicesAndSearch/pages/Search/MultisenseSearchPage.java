package com.DevicesAndSearch.pages.Search;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MultisenseSearchPage extends TestBase {

	public  MultisenseSearchPage()  {
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
	}

	public void selectSearchTitle()
	{
		Multisense();
		waitForTime(1000);
		Workspace();
		waitForTime(500);
		catchCFT1000Alert();
		waitForTime(5000);
		WebElement eleMainSearchBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleMainSearchBtn")));
		doClick(eleMainSearchBtn);
		waitForTime(1000);	
	}
	
	public void clickondeviceType() 
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleDeviceType = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleDeviceType")));
		TestUtil.waitforElementTobeLocated(eleDeviceType,30);
		doClick(eleDeviceType);
		waitForTime(2000);		
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement eleSelectTypeAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSelectTypeAll")));
		TestUtil.waitforElementTobeLocated(eleSelectTypeAll,30);
		doClick(eleSelectTypeAll);
		waitForTime(2000);
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(1000);				
	}
	
	public void clickonDeviceGroup()
	{
		WebElement DeviceGroup = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_DeviceGroup")));
		TestUtil.waitforElementTobeLocated(DeviceGroup,10);
		doClick(DeviceGroup);
		waitForTime(1000);		
		WebElement DeviceGroup2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_DeviceGroup2")));
		TestUtil.waitforElementTobeLocated(DeviceGroup2,10);
		doClick(DeviceGroup2);		
		waitForTime(1000);	
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(1000);
	}
	
	public void clickonGroupOptionSelect()
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//doClick(Multisense_Search_eleElectricityDevice);
		waitForTime(1000);
		
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(1000);	
	}
	
	public void clickSearchBtn()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));		
		WebElement eleSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSearch")));
		TestUtil.waitforElementTobeLocated(eleSearch,30);
		doClick(eleSearch);	
		waitForTime(1000);
	}

	//Test Case 2

	public void clickPerPage()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement selectPerPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectPerPage")));
		TestUtil.waitforElementTobeLocated(selectPerPage,30);
		doClick(selectPerPage);
		waitForTime(5000);		 

		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement selectPagesNumber = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectPagesNumber")));
		TestUtil.waitforElementTobeLocated(selectPagesNumber,10);
		doClick(selectPagesNumber);
		
		waitForTime(5000);		
	}
	
	public void clickCount()
	{	
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectCount = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectCount")));
		TestUtil.waitforElementTobeLocated(selectCount,30);
		doClick(selectCount);		 
		waitForTime(5000);
		
	}

	//Test case 3
	public void clickonColumnSelectOption()
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectColumn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectColumn")));
		TestUtil.waitforElementTobeLocated(selectColumn,10);
		doClick(selectColumn);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectOption1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectOption1")));
		TestUtil.waitforElementTobeLocated(selectOption1,10);
		doClick(selectOption1);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectOption2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectOption2")));
		TestUtil.waitforElementTobeLocated(selectOption2,10);
		doClick(selectOption2);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnDone = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnDone")));
		TestUtil.waitforElementTobeLocated(btnDone,30);
		doClick(btnDone);
		
		Actions action = new Actions(DriverUtility.getDriver());		
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(5000);		
	}	
	
	// Test case 4
	public void clickBulkAction()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement btnBulkAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnBulkAction")));
		TestUtil.waitforElementTobeLocated(btnBulkAction,50);
		doClick(btnBulkAction);

		waitForTime(5000);

	}
	
	//Test Case 4
	public void clickSelectoptionClickNext()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement btnSelectAll = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnSelectAll")));
		TestUtil.waitforElementTobeLocated(btnSelectAll,10);
		doClick(btnSelectAll);
		waitForTime(5000);
		WebElement option1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_option1")));
		TestUtil.waitforElementTobeLocated(option1,10);
		doClick(option1);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		waitForTime(5000);
		WebElement option2 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_option2")));
		TestUtil.waitforElementTobeLocated(option2,10);
		doClick(option2);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement nxtBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nxtBtn")));	
		TestUtil.waitforElementTobeLocated(nxtBtn,10);
		doClick(nxtBtn);
		waitForTime(5000);
	}
	//Test Case 5
	public void clickcommunicationSchedule()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//DriverUtility.getDriver().findElement(By.xpath("//b[normalize-space()='Add shared communication schedules']")).click();
		WebElement addSharedBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_addSharedBtn")));
		TestUtil.waitforElementTobeLocated(addSharedBtn,0);
		doClick(addSharedBtn);

		waitForTime(5000);
		WebElement forAddbtnNext = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_forAddbtnNext")));	
		TestUtil.waitforElementTobeLocated(forAddbtnNext,10);
		doClick(forAddbtnNext);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement selectDailyRead = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_selectDailyRead")));
		TestUtil.waitforElementTobeLocated(selectDailyRead,10);
		doClick(selectDailyRead);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement nextBtnforActiondetails = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nextBtnforActiondetails")));
		TestUtil.waitforElementTobeLocated(nextBtnforActiondetails,30);
		doClick(nextBtnforActiondetails);
		waitForTime(5000);
	}

	//Test Case 6
	public void clickRemoveScheduleandConfirm()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement radioBtnRemove = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_radioBtnRemove")));
		TestUtil.waitforElementTobeLocated(radioBtnRemove,30);
		doClick(radioBtnRemove);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ConfirmBtnforActiondetails = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_ConfirmBtnforActiondetails")));
		TestUtil.waitforElementTobeLocated(ConfirmBtnforActiondetails,30);
		doClick(ConfirmBtnforActiondetails);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Finish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Finish")));
		TestUtil.waitforElementTobeLocated(Finish,30);
		doClick(Finish);
		waitForTime(5000);
	}

	//Test Case 7

	public void clickAddCriteria()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement addCriteria = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_addCriteria")));
		TestUtil.waitforElementTobeLocated(addCriteria,30);
		doClick(addCriteria);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement OptionConnectionMethod = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_OptionConnectionMethod")));
		TestUtil.waitforElementTobeLocated(OptionConnectionMethod,30);
		doClick(OptionConnectionMethod);
		waitForTime(5000);
		
		Actions action = new Actions(DriverUtility.getDriver());
		WebElement Multisense_Search_Channel = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Channel")));
		TestUtil.waitforElementTobeLocated(Multisense_Search_Channel,10);
		action.moveToElement(Multisense_Search_Channel).build().perform();
		waitForTime(1000);
		WebElement Multisense_Search_Interval = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Interval")));
		TestUtil.waitforElementTobeLocated(Multisense_Search_Interval,10);
		waitForTime(2000);
		action.moveToElement(Multisense_Search_Interval).click().build().perform();
		waitForTime(5000);
		action.sendKeys(Keys.ESCAPE).build().perform();
		waitForTime(5000);
		action.sendKeys(Keys.ESCAPE).build().perform();		
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleSearch = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_eleSearch")));
		TestUtil.waitforElementTobeLocated(eleSearch,10);
		doClick(eleSearch);
		waitForTime(5000);
	}
	
	//Test Case 9
	public void clickBulkActionBtn()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnBulkAction = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnBulkAction")));
		TestUtil.waitforElementTobeLocated(btnBulkAction,30);
		doClick(btnBulkAction);

		waitForTime(5000);
	}

	public void clickNextForAddDevice()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement nextAddDeviceBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nextAddDeviceBtn")));
		TestUtil.waitforElementTobeLocated(nextAddDeviceBtn,30);
		doClick(nextAddDeviceBtn);
		waitForTime(5000);
	}
	public void clickAddDeviceandNext()
	{	
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement startProcessRadiobtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_startProcessRadiobtn")));
		TestUtil.waitforElementTobeLocated(startProcessRadiobtn,30);
		doClick(startProcessRadiobtn);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement adDeviceNextBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_adDeviceNextBtn")));
		TestUtil.waitforElementTobeLocated(adDeviceNextBtn,30);
		doClick(adDeviceNextBtn);
		waitForTime(5000);
	}
	//Test Case 10
	public void clickCreateIssue()
	{	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	waitForTime(5000);
	WebElement allDeviceRadiobtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_allDeviceRadiobtn")));
	TestUtil.waitforElementTobeLocated(allDeviceRadiobtn,30);
	doClick(allDeviceRadiobtn);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	waitForTime(5000);
	WebElement NxtSelectAllDeviceBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_NxtSelectAllDeviceBtn")));
	TestUtil.waitforElementTobeLocated(NxtSelectAllDeviceBtn,30);
	doClick(NxtSelectAllDeviceBtn);
	waitForTime(5000);
	WebElement radioClickIssuebtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_radioClickIssuebtn")));
	TestUtil.waitforElementTobeLocated(radioClickIssuebtn,30);
	doClick(radioClickIssuebtn);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement nextBtnFrmSelectActionPage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_nextBtnFrmSelectActionPage")));
	TestUtil.waitforElementTobeLocated(nextBtnFrmSelectActionPage,30);
	doClick(nextBtnFrmSelectActionPage);
	waitForTime(5000);
	}

	public void createIssue(String IssueReason,String IssueUrgency, String IssueImpact ) 
	{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Reason = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Reason")));
		TestUtil.waitforElementTobeLocated(Reason,30);
		doClear(Reason);
		waitForTime(5000);
		sendkeys(IssueReason, Reason);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Urgency = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Urgency")));
		TestUtil.waitforElementTobeLocated(Urgency,30);
		doClear(Urgency);
		waitForTime(5000);
		sendkeys(IssueUrgency, Urgency);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Impact = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_Impact")));
		TestUtil.waitforElementTobeLocated(Impact,30);
		doClear(Impact);
		waitForTime(5000);
		sendkeys(IssueImpact, Impact);
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement btnNextToCreate = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnNextToCreate")));
		TestUtil.waitforElementTobeLocated(btnNextToCreate,30);
		doClick(btnNextToCreate);
		waitForTime(5000);				
	}
	
	public void FinishBulkAction()
	{		
		waitForTime(5000);
		WebElement btnConfirm = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnConfirm")));		
		WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(btnConfirm));
		doClick(btnConfirm);
		waitForTime(5000);
		WebElement btnFinish = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("Multisense_Search_btnFinish")));
		wait.until(ExpectedConditions.visibilityOf(btnFinish));
		doClick(btnFinish);		
	}

}

