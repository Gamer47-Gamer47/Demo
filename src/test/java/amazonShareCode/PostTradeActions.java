package amazonShareCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.WorkflowBlotter;

public class PostTradeActions extends OrderEntry

{
	@Test
	public void actions() throws InterruptedException
	{
		//System.out.println("Array list 1 is "+OrderEntry.arrayList1);
		
		
		for(int i =0;i<OrderEntry.arrayList1.size();i++)
		{
			System.out.println(OrderEntry.arrayList1.get(i));
			if(OrderEntry.arrayList1.get(i).contains("Cyberpunk"))
			{
				
				System.out.println("***********Entered Loop*********");
				Thread.sleep(2000);
				//System.out.println("Found the item in array");
				driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
				
				WorkflowBlotter wb = new WorkflowBlotter(driver);
				wb.email().sendKeys("12345");
				wb.continueButton().click();
				wb.createAccountButton().click();
				break;
							
			}
			else System.out.println("Not found in array");
		}
		
		
	}

	
	
	
}
