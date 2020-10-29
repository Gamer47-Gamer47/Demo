package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkflowBlotter  {
WebDriver driver;
	
	
	public WorkflowBlotter(WebDriver driver) 
	{
		
		this.driver=driver;
	}
	
	
	By email = By.id("ap_email");
	By continueButton = By.id("continue");
	By createAccountButton = By.id("createAccountSubmit");	
	
	public WebElement email()
	{
		return (driver.findElement(email));
	}
	
	public WebElement continueButton()
	{
		return (driver.findElement(continueButton));
	}
	
	public WebElement createAccountButton()
	{
		return (driver.findElement(createAccountButton));
	}
	
}