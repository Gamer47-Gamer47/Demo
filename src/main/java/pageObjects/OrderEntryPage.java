package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderEntryPage {
	WebDriver driver;
	
	public OrderEntryPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By customer = By.id("ctl00_MainContent_FindCustSmartOrderEntry_automplete_1");
	By Type = By.id("ctl00_MainContent_ddlOrderType");
	By buyCcy = By.id("ctl00_MainContent_ddlCustBuyOrder");
	By sellCcy = By.id("ctl00_MainContent_ddlCustSellOrder");
	By notional = By.id("ctl00_MainContent_txtNotional");
	By marketRate = By.id("ctl00_MainContent_txtBankRateOrder");
	By targetRate = By.id("ctl00_MainContent_txtTargetPrice1");
	By ExpiryTime = By.id("ctl00_MainContent_ExpiryTimePicker_cmbHour");
	By placeOrder = By.id("ctl00_MainContent_btnBookOrder");
	By date = By.id("ctl00_MainContent_dtpExpiryDate_anchor_cal");
	
	public WebElement customer()
	{
		return (driver.findElement(customer));
	}
	
	public WebElement Type()
	{
		return (driver.findElement(Type));
	}
	public WebElement buyCcy()
	{
		return (driver.findElement(buyCcy));
	}
	public WebElement sellCcy()
	{
		return (driver.findElement(sellCcy));
	}
	public WebElement notional()
	{
		return (driver.findElement(notional));
	}
	public WebElement marketRate()
	{
		return (driver.findElement(marketRate));
	}
	public WebElement targetRate()
	{
		return (driver.findElement(targetRate));
	}
	public WebElement ExpiryTime()
	{
		return (driver.findElement(ExpiryTime));
	}
	public WebElement date()
	{
		return (driver.findElement(date));
	}	

	public WebElement placeOrder()
	{
		return (driver.findElement(placeOrder));
	}

	
	
	
	
	
}
