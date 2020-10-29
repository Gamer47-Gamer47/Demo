package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	static WebDriver driver;
	public static WebDriver initialiseDriver() throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void checkPageIsReady() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  
		  //Initially bellow given if condition will check ready state of page.
		  if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		   System.out.println("Page Is loaded.");
		   return; 
		  } 
		  
		  //This loop will rotate for 25 times to check If page Is ready after every 1 second.
		  //You can replace your value with 25 If you wants to Increase or decrease wait time.
		  for (int i=0; i<25; i++){ 
		   try {
		    Thread.sleep(1000);
		    }catch (InterruptedException e) {} 
		   //To check page ready state.
		   if (js.executeScript("return document.readyState").toString().equals("complete")){ 
		    break; 
		   }   
		  }
		 }
	
	public void switchToNewWindow(int windowNumber) 
	{
	    Set < String > s = driver.getWindowHandles();   
	    Iterator < String > ite = s.iterator();
	    int i = 1;
	    while (ite.hasNext() && i < 10) {
	        String popupHandle = ite.next().toString();
	        driver.switchTo().window(popupHandle);
	        System.out.println("Window title is : "+driver.getTitle());
	        if (i == windowNumber) break;
	         i++;
	    }
	}
	
	
	
	public boolean waitForNewWindow(WebDriver driver, int timeout){

        boolean flag = false;

        int counter = 0;

        while(!flag)
        {

            try 
            {
                Set<String> winId = driver.getWindowHandles();
                if(winId.size() > 2)
                {
                    flag = true;
                    return flag;
                }

                Thread.sleep(1000);
                counter++;
                if(counter > timeout)
                {
                    return flag;
                }

            } 
            
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
                return false;
            }

        }

        return flag;

 }
	
	
		}



	
	
	