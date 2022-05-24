package com.multisense.pages.DevicesPage;
import com.base.base.TestBase;
import com.util.util.DriverUtility;
import com.util.util.TestUtil;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class DeviceTypePage extends TestBase {	
String Name = generateRandomName(9);
		
	public  DeviceTypePage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}
				
	
	public void clickDeviceType() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConnexoMultisense_DeviceTypePage_DeviceTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_DeviceTypes")));
		doClick(ConnexoMultisense_DeviceTypePage_DeviceTypes);
		} catch (Exception e) {
			
			e.printStackTrace();
			}
			}
	
	public void DetailsTab() throws InterruptedException
	{
		DriverUtility.getDriver().navigate().refresh();
		WebElement m = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_detailstab")));
		
		try {
			   
			m.click();
		}
		catch(StaleElementReferenceException ex)
		{
			WebElement n= DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_detailstab")));
			doClick(n);
		}
	}
				
	public void clickaddDevicetypebutton() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton")));
		doClick(ConnexoMultisense_DeviceTypePage_Adddevicelifetypebutton);		
		}

	
	public void addDeviceType(String Type, String Communicationprotocol , String DeviceLifecyle) throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConnexoMultisense_DeviceTypePage_Devicetypedropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Devicetypedropdown")));
	doClear(ConnexoMultisense_DeviceTypePage_Devicetypedropdown);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	sendkeys(Type, ConnexoMultisense_DeviceTypePage_Devicetypedropdown);
	ConnexoMultisense_DeviceTypePage_Devicetypedropdown.sendKeys(Keys.ENTER);
	waitForTime(5000);	
	
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox")));
	sendkeys(Communicationprotocol, ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox);
	ConnexoMultisense_DeviceTypePage_communicationprotocoltextbox.sendKeys(Keys.ENTER);

	waitForTime(5000);

WebElement ConnexoMultisense_DeviceTypePage_Name = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Name")));
doClear(ConnexoMultisense_DeviceTypePage_Name);
sendkeys(Name, ConnexoMultisense_DeviceTypePage_Name);
ConnexoMultisense_DeviceTypePage_Name.sendKeys(Keys.ENTER);



waitForTime(5000);



WebElement ConnexoMultisense_DeviceTypePage_selectDeviceLifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_selectDeviceLifecycle")));
doClick(ConnexoMultisense_DeviceTypePage_selectDeviceLifecycle);
List<WebElement> options1= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));
for (WebElement element : options1){
if(element.getText().equals(DeviceLifecyle)){



	        element.click();
	    }
	    }
	waitForTime(5000);
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton")));
	TestUtil.waitforElementTobeLocated(ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton, 30)	;
	doClick(ConnexoMultisense_DeviceTypePage_Adddevicelifecyclenamebutton);
	
	}
	public void devicetypeconfig(String Name, String Description) throws InterruptedException
				{
//		WebElement ConnexoMultisense_DeviceTypePage_detailstab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_detailstab")));
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_NoRegisterTypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_NoRegisterTypes")));
		doClick(ConnexoMultisense_DeviceTypePage_NoRegisterTypes);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceTypePage_Addregistertypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Addregistertypes")));
		doClick(ConnexoMultisense_DeviceTypePage_Addregistertypes);
		WebElement checkbox1 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox1.click();
		WebElement checkbox2 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox2.click();
		WebElement checkbox3 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox3.click();
		WebElement ConnexoMultisense_DeviceTypePage_Addregistertypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Addregistertypesbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_Addregistertypesbutton);
		Thread.sleep(5000);
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_Noloadprofiletypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_Noloadprofiletypes")));
		doClick(ConnexoMultisense_DeviceTypePage_Noloadprofiletypes);
		WebElement ConnexoMultisense_DeviceTypePage_addloadprofiletypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addloadprofiletypes")));
		doClick(ConnexoMultisense_DeviceTypePage_addloadprofiletypes);
		Thread.sleep(5000);
		WebElement checkbox4 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox4.click();
		WebElement checkbox5 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox5.click();
		WebElement checkbox6 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox6.click();
		WebElement ConnexoMultisense_DeviceTypePage_addloadprofiletypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addloadprofiletypesbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_addloadprofiletypesbutton);
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_nodeviceconfig = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_nodeviceconfig")));
		doClick(ConnexoMultisense_DeviceTypePage_nodeviceconfig);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceTypePage_adddeviceconfig = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_adddeviceconfig")));
		doClick(ConnexoMultisense_DeviceTypePage_adddeviceconfig);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisense_DeviceTypePage_deviceconfigname = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_deviceconfigname")));
		doClear(ConnexoMultisense_DeviceTypePage_deviceconfigname);
		sendkeys(Name, ConnexoMultisense_DeviceTypePage_deviceconfigname);
		
		waitForTime(5000);
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebElement ConnexoMultisense_DeviceTypePage_deviceconfigdesc = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_deviceconfigdesc")));
		doClear(ConnexoMultisense_DeviceTypePage_deviceconfigdesc);
		sendkeys(Description, ConnexoMultisense_DeviceTypePage_deviceconfigdesc);
		WebElement ConnexoMultisense_DeviceTypePage_adddeviceconfigbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_adddeviceconfigbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_adddeviceconfigbutton);
		waitForTime(2000);
		
		DetailsTab();
		WebElement ConnexoMultisense_DeviceTypePage_nologbooktypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_nologbooktypes")));
		doClick(ConnexoMultisense_DeviceTypePage_nologbooktypes);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceTypePage_addlogbooktypes = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addlogbooktypes")));
		doClick(ConnexoMultisense_DeviceTypePage_addlogbooktypes);
		WebElement checkbox10 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[1]"));
		checkbox10.click();
		WebElement checkbox11 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[2]"));
		checkbox11.click();
		WebElement checkbox12 = DriverUtility.getDriver().findElement(By.xpath("(//div[@class='x-grid-row-checker'])[3]"));
		checkbox12.click();
		WebElement ConnexoMultisense_DeviceTypePage_addlogbooktypesbutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_addlogbooktypesbutton")));
		doClick(ConnexoMultisense_DeviceTypePage_addlogbooktypesbutton);
		Thread.sleep(5000);
		DriverUtility.getDriver().findElement(By.xpath("//a[@href='#/administration/devicetypes']")).click();}
		public void removeDevicetype(String Communicationprotocol)
		{
			waitForTime(5000);
			WebElement ConxoMultisense_LoadProfileTypePage_PerpageDropDown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_PerpageDropDown")));
			doClick(ConxoMultisense_LoadProfileTypePage_PerpageDropDown);		
			waitForTime(1000);
			WebElement ConxoMultisense_LoadProfileTypePage_Perpagevalue = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConxoMultisense_LoadProfileTypePage_Perpagevalue")));
			doClick(ConxoMultisense_LoadProfileTypePage_Perpagevalue);
			WebElement a= DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span"));
			scrolldown(a);
			waitForTime(3000);
			DriverUtility.getDriver().findElement(By.xpath("//*[text()='"+ Name +"']//ancestor::td//following-sibling::td//span")).click();
			waitForTime(3000);
			WebElement ConnexoMultisense_DeviceTypePage_removedevicetype = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceTypePage_removedevicetype")));
			TestUtil.waitforElementTobeLocated(ConnexoMultisense_DeviceTypePage_removedevicetype, 10);
			doClick(ConnexoMultisense_DeviceTypePage_removedevicetype);
			waitForTime(4000);
			DriverUtility.getDriver().findElement(By.xpath("//span[contains(text(),'"+ Name +"')]//ancestor::div//a[normalize-space()='Remove']")).click();
		}
	
	}


