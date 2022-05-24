package com.multisense.pages.DeviceCommunicationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

public class CommandLimitationRulePage extends TestBase {	

	String CommandLimitationRuleNameValue= generateRandomName(8);


	public CommandLimitationRulePage()
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Multisense();
		waitForTime(1000);
		Administration();
		waitForTime(3000);
	}

	public void clickonCommandLimitationRule()
	{		
		WebElement CommandLimitationRule = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_CommandLimitationRule")));
		TestUtil.waitforElementTobeLocated(CommandLimitationRule, 10);	
		doClick(CommandLimitationRule);		
	}

	public String gettextofCommandLimitationRule()
	{
		waitForTime(5000);
		WebElement VerifyCommandLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_VerifyCommandLimitationRules")));
		TestUtil.waitforElementTobeLocated(VerifyCommandLimitationRules, 10);
		return getText(VerifyCommandLimitationRules);
	}

	public void clickonAddCommandLimitationRule()
	{
		WebElement CommandLimitationRulePerpage = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_CommandLimitationRulePerpage")));
		if(CommandLimitationRulePerpage.isDisplayed())
		{
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add command limitation rule')]//ancestor::a)[2]")).click();

		}else {
			DriverUtility.getDriver().findElement(By.xpath("(//span[contains(text(),'Add command limitation rule')]//ancestor::a)[1]")).click();
		}
	}

	public void AddCommandLimitationRule()
	{
		waitForTime(5000);
		WebElement CommunicationLimitedRuleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_CommunicationLimitedRuleName")));
		TestUtil.waitforElementTobeLocated(CommunicationLimitedRuleName, 10);
		doClear(CommunicationLimitedRuleName);
		sendkeys(CommandLimitationRuleNameValue, CommunicationLimitedRuleName);
		waitForTime(1000);
		WebElement AddCommands = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_AddCommands")));
		TestUtil.waitforElementTobeLocated(AddCommands, 10);
		doClick(AddCommands);
	}

	public void AddCommandsCommandLimitationRule()
	{
		waitForTime(5000);
		WebElement AlarmConfigurationCheckbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_AlarmConfigurationCheckbox")));
		TestUtil.waitforElementTobeLocated(AlarmConfigurationCheckbox, 10);
		doClick(AlarmConfigurationCheckbox);
		WebElement AddCommandLimitationRulesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_AddCommandLimitationRulesButton")));
		doClickjavaScript(AddCommandLimitationRulesButton);
		waitForTime(2000);
		WebElement AddCommandLimitationRulesButton1 = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_AddCommandLimitationRulesButton")));
		TestUtil.waitforElementTobeLocated(AddCommandLimitationRulesButton1, 10);
		doClick(AddCommandLimitationRulesButton1);
	}

	public void activateCommandLimitationRule()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+CommandLimitationRuleNameValue+"']//ancestor::td//following-sibling::td//span")).click();
		WebElement activateCommandLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_activateCommandLimitationRules")));
		TestUtil.waitforElementTobeLocated(activateCommandLimitationRules, 10);
		doClick(activateCommandLimitationRules);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+CommandLimitationRuleNameValue+"')]//ancestor::div//a[normalize-space()='Activate']")).click();
	}

	public void editCommandLimitationRule()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+CommandLimitationRuleNameValue+"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("(//a[text()='"+CommandLimitationRuleNameValue+"']//ancestor::td//following-sibling::td//span)[2]")).click();
		WebElement EditCommunicationLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_EditCommunicationLimitationRules")));
		TestUtil.waitforElementTobeLocated(EditCommunicationLimitationRules, 10);
		doClick(EditCommunicationLimitationRules);
	}

	public void editdayLimitCommandLimitationRule()
	{
		waitForTime(5000);
		WebElement CommunicationLimitedRuleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_CommunicationLimitedRuleName")));
		WebElement DayLimit = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_DayLimit")));
		TestUtil.waitforElementTobeLocated(CommunicationLimitedRuleName, 10);
		doClick(DayLimit);
		WebElement SaveCommunicationLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_SaveCommunicationLimitationRules")));
		doClick(SaveCommunicationLimitationRules);
	}

	public void viewPendingChanges()
	{
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+CommandLimitationRuleNameValue+"']//ancestor::td//following-sibling::td//span")).click();
		waitForTime(2000);
		WebElement ViewpendingchangesButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_ViewpendingchangesButton")));
		TestUtil.waitforElementTobeLocated(ViewpendingchangesButton, 10);
		doClick(ViewpendingchangesButton);
		waitForTime(2000);
		WebElement detailCommunicationLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_detailCommunicationLimitationRules")));
		TestUtil.waitforElementTobeLocated(detailCommunicationLimitationRules, 10);
		doClick(detailCommunicationLimitationRules);
	}

	public void removeCommandLimitationRule()
	{
		waitForTime(5000);
		WebElement actionsCommunicationLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_actionsCommunicationLimitationRules")));
		//DriverUtility.getDriver().findElement(By.xpath("//a[text()='"+CommandLimitationRuleNameValue+"']//ancestor::td//following-sibling::td//span")).click();
		TestUtil.waitforElementTobeLocated(actionsCommunicationLimitationRules, 10);
		doClick(actionsCommunicationLimitationRules);
		waitForTime(3000);
		WebElement RemoveCommunicationLimitationRules = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_CommndLmtnRulePage_RemoveCommunicationLimitationRules")));
		TestUtil.waitforElementTobeLocated(RemoveCommunicationLimitationRules, 10);
		doClick(RemoveCommunicationLimitationRules);
		waitForTime(2000);
		DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+CommandLimitationRuleNameValue+"')]//ancestor::div//a[normalize-space()='Remove']")).click();
	} 


}
