package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLandingPage 
{
	
WebDriver driver;

public AmazonLandingPage(WebDriver driver)
{
	this.driver=driver;
}
	

By searchBox = By.id("twotabsearchtextbox");
By goButton = By.cssSelector("input[value='Go']");
By filterDropDown = By.cssSelector("span[class='a-button-text a-declarative']");
By newestArrivals = By.xpath("//div[@class='a-popover-wrapper']/div/ul/li[5]/a[contains(text(),'Newest Arrivals')]");
By firstSelection = By.cssSelector("img[data-image-index]");
By itemPrice = By.id("priceblock_ourprice");
public WebElement searchBox()
{
	return(driver.findElement(searchBox));
}

public WebElement goButton()
{
	return(driver.findElement(goButton));
}

public WebElement filterDropDown()
{
	return(driver.findElement(filterDropDown));
}
public WebElement newestArrivals()
{
	return(driver.findElement(newestArrivals));
}
public WebElement firstSelection()
{
	return(driver.findElement(firstSelection));
}
public WebElement itemPrice()
{
	return(driver.findElement(itemPrice));
}
}