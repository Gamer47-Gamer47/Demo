package amazonShareCode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AmazonLandingPage;

import pageObjects.OrderEntryPage;
import pageObjects.WorkflowBlotter;
import resources.base;

public class OrderEntry extends base {

	static WebDriver driver;
	static ArrayList<String> arrayList1 = new ArrayList<String>();
	static ArrayList<String> arrayList2 = new ArrayList<String>();


	
	

//-------------------------------------------------------------------------------------------------


	@BeforeTest
	public void initialise() throws IOException {
		driver = initialiseDriver();
		driver.manage().window().maximize();

		driver.get("https://amazon.in");
		
		

	}

//---------------------------------------------------------------------------------------------------	

	@Test(dataProvider = "getData")
	public void sendItems(String itemSearch)
	
	{
	
		AmazonLandingPage alp = new AmazonLandingPage(driver);
		alp.searchBox().sendKeys(itemSearch);
		alp.goButton().click();
		 List<WebElement> A=driver.findElements(By.xpath("//div[@class='a-section a-spacing-none']/h2/a"));
		
		 for(int i =0;i<A.size();i++)
		 {
			 //System.out.println(A.get(i).getText());
			 arrayList1.add(A.get(i).getText());
		 }
	System.out.println("Array List 1 is "+arrayList1);
	}
	
//------------------------------------------------------------------------------------------------
	
//----------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------------------
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
//--------------------------------------------------------------------------------------------------------------------------------
//	1. Order Details input
	
	
	@DataProvider
	public Object[] getData() {

		Object[] Data = new Object[1];
		Data[0] = "XBOX";
		
		return Data;

	}

}
