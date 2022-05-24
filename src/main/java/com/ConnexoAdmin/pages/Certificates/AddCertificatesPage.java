package com.ConnexoAdmin.pages.Certificates;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Dashboard.pages.DashboardPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;


public class AddCertificatesPage extends TestBase {	
	
	String strAlias = generateRandomNumber(4);
		
	public AddCertificatesPage()	
	{
		login();
		PageFactory.initElements(DriverUtility.getDriver(), this);
		Admin();
		waitForTime(3000);
		waitForTime(500);
		WebElement eleCertificatesHyperLink = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleCertificatesHyperLink")));
		TestUtil.waitforElementTobeLocated(eleCertificatesHyperLink, 30);		
		waitForTime(500);
		doClick(eleCertificatesHyperLink);
		waitForTime(500);
	}	
	
	public String getPageTitle() {
		return DriverUtility.getDriver().getTitle();
	}
	
	public void navigatetoCertificatesPage()	
	{
		
	}
	
	 public String gettextOfCertificatesPage()
	{
		waitForTime(2000);
		WebElement ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle, 30);
		ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle.isDisplayed();
		return getText(ConnexoAdmin_AddCertificatePage_eleCertificatesPageTitle);
	}	
		
	public void clickOnAddCertificateAction()	
	{
		WebElement ConnexoAdmin_AddCertificatePage_eleActionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleActionButton")));
		if (ConnexoAdmin_AddCertificatePage_eleActionButton.isDisplayed()){
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleActionButton, 30);
			doClick(ConnexoAdmin_AddCertificatePage_eleActionButton);
			waitForTime(500);
			WebElement ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu,10);
			doClick(ConnexoAdmin_AddCertificatePage_eleAddCertificateMenu);
			waitForTime(500);
		}
		else
		{
			WebElement ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn, 30);
			doClick(ConnexoAdmin_AddCertificatePage_eleAddCertificateBtn);
			waitForTime(500);
		}
	}
   	
    public String gettextOfAddCertificatesPage()
	{		
    	WebElement ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName")));
    	TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName, 30);
		waitForTime(500);		
		ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName.isDisplayed();
		return getText(ConnexoAdmin_AddCertificatePage_eleAddCertificatesPageName);
	}
    
    public String getFile()
	{
		return new File("./Generic-Library/Certificates/AppCert.cert").getAbsolutePath();
	}
    
	public void importcertificate(String strfilePath)
	{	
		try {
			 String strCertName = "TestCert" + strAlias; 
			 /*String currentDir = System.getProperty("user.dir"); String exeFilepath = currentDir +
			 * "\\Generic-Library\\Executables\\FileUpload.exe";
			 */
			WebElement ConnexoAdmin_AddCertificatePage_eleAliasInputBox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAliasInputBox")));
			TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_eleAliasInputBox, 30);
			sendkeys(strCertName, ConnexoAdmin_AddCertificatePage_eleAliasInputBox);
			waitForTime(500);			
			WebElement ConnexoAdmin_AddCertificatePage_eleSelectFileButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleSelectFileButton")));
			//doClick(ConnexoAdmin_AddCertificatePage_eleSelectFileButton);
			sendkeys(getFile(), ConnexoAdmin_AddCertificatePage_eleSelectFileButton);
			/*
			 * try { Runtime.getRuntime().exec(exeFilepath+" "+strfilePath); } catch
			 * (IOException e) { e.printStackTrace(); }
			 */
			waitForTime(5000);
			WebElement ConnexoAdmin_AddCertificatePage_eleAddButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_eleAddButton")));
			WebDriverWait wait = new WebDriverWait(DriverUtility.getDriver(), Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ConnexoAdmin_AddCertificatePage_eleAddButton));			
			doClick(ConnexoAdmin_AddCertificatePage_eleAddButton);
		}
		catch(Exception e)
		{			
			e.printStackTrace();
		}
	}
	
	public void revokeCertificate()
	{
		String strName = "TestCert" + strAlias;
		waitForTime(8000);		
		DriverUtility.getDriver().findElement(By.xpath("//input[contains(@class,'x-form-field x-form-required-field')]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//li[text()='200']")).click();
		WebElement eleRevokeCertificate = DriverUtility.getDriver().findElement(By.xpath("//a[normalize-space()=\""+ strName +"\"]//ancestor::td//following::td[5]//div//span"));
		TestUtil.waitforElementTobeLocated(eleRevokeCertificate, 50);
		eleRevokeCertificate.click();
		waitForTime(5000);
		WebElement ConnexoAdmin_AddCertificatePage_btnRevoke = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_btnRevoke")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_btnRevoke, 50);
		doClick(ConnexoAdmin_AddCertificatePage_btnRevoke);
		waitForTime(3000);
		WebElement ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation, 30);
		doClick(ConnexoAdmin_AddCertificatePage_btnRevokeConfirmation);
		WebElement ConnexoAdmin_AddCertificatePage_msgCertificateRevoke = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoAdmin_AddCertificatePage_msgCertificateRevoke")));
		TestUtil.waitforElementTobeLocated(ConnexoAdmin_AddCertificatePage_msgCertificateRevoke, 30);		
	}
	
	
	public DashboardPage goToPreviousPage() {
		DriverUtility.getDriver().navigate().back();
		return new DashboardPage();
	}
}
