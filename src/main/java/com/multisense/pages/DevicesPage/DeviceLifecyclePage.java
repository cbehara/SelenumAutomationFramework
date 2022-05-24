package com.multisense.pages.DevicesPage;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.base.TestBase;
import com.util.util.DriverUtility;


public class DeviceLifecyclePage extends TestBase {
	String Name = generateRandomName(9);
	
	//span[text()='Add transition']/following-sibling::span
	

	public  DeviceLifecyclePage()  {
	login();
	PageFactory.initElements(DriverUtility.getDriver(), this);
	Multisense();
	Administration();
	}
				
	public void sendText(String value)
	{
		WebElement ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle")));
		sendkeys(value, ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle);
	}
	
	public void clickDeviceLifecycle() throws InterruptedException
	{
	Thread.sleep(5000);
	try {
		WebElement ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycle);
		} catch (Exception e) 
	{
						
			e.printStackTrace();
			}
			}
				
	public void clickaddDeviceLifecycle() throws InterruptedException
		{
		DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclebutton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclebutton);
		
		}

	
	public void createDeviceLifecycle() throws InterruptedException
	{
	DriverUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	WebElement ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName")));
	doClear(ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName);
	sendkeys(Name, ConnexoMultisense_DeviceLifecyclePage_DeviceLifecycleName);
	WebElement ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton")));
	doClick(ConnexoMultisense_DeviceLifecyclePage_Adddevicelifecyclenamebutton);
					
	}
	
//	public void clickaddDeviceLifecycleButton()
//	{
//	doClick(AddedDeviceLifecycle);
//	}
//	
	public void clickOnAddTransitions( String triggered , String from , String to) throws InterruptedException
				{
		
		DriverUtility.getDriver().findElement(By.linkText(Name)).click();
		WebElement ConnexoMultisense_DeviceLifecyclePage_TransitionsTab = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_TransitionsTab")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_TransitionsTab);
		WebElement ConnexoMultisense_DeviceLifecyclePage_AddTransitions = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddTransitions")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_AddTransitions);
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceLifecyclePage_TriggeredbyDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_TriggeredbyDropdown")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_TriggeredbyDropdown);
		Thread.sleep(5000);
		WebElement triggered1= DriverUtility.getDriver().findElement(By.xpath("//ul[@class='x-list-plain']"));
		List<WebElement> triggeredList=triggered1.findElements(By.tagName("li"));
		for (WebElement li : triggeredList) {
		if (li.getText().equals(triggered)) {
		     li.click();
		   }}
		Thread.sleep(5000);
		WebElement ConnexoMultisense_DeviceLifecyclePage_TransitionfromDropdown = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_TransitionfromDropdown")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_TransitionfromDropdown);
		List<WebElement> options= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options){  
		     if(element.getText().equals(from)){  

		        element.click();
		    }
		    }
		WebElement ConnexoMultisense_DeviceLifecyclePage_Transitionto = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_Transitionto")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_Transitionto);
		List<WebElement> options2= DriverUtility.getDriver().findElements(By.cssSelector("li[class*='x-boundlist-item']"));  
		for (WebElement element : options2){  
		     if(element.getText().equals(to)){  

		        element.click();
		    }
		    }
		WebElement ConnexoMultisense_DeviceLifecyclePage_AddTransitionButton = DriverUtility.getDriver().findElement(By.xpath(prop.getProperty("ConnexoMultisense_DeviceLifecyclePage_AddTransitionButton")));
		doClick(ConnexoMultisense_DeviceLifecyclePage_AddTransitionButton);
		
		}
	public void clickRemoveDeviceLifecycle() throws InterruptedException
	{
		DriverUtility.getDriver().findElement(By.xpath("//a[@data-qtip='Details']//span[1]")).click();
		waitForTime(5000);
		DriverUtility.getDriver().findElement(By.xpath("//div[contains(@class,'x-panel x-box-item')]/following-sibling::a[1]")).click();
		DriverUtility.getDriver().findElement(By.xpath("(//span[contains(@class,'x-menu-item-text')])[6]")).click();
		DriverUtility.getDriver().findElement(By.xpath("//div[@class='x-window uni-confirmation-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[@class='x-container x-box-item x-window-item x-container-default x-box-layout-ct']//div[@role='presentation']//div[@role='presentation']//a[@class='x-btn x-unselectable x-box-item x-btn-remove-small x-noicon x-btn-noicon x-btn-remove-small-noicon']//span[@role='presentation']//span[@role='presentation']//span[@role='presentation']")).click();
	}
	}


