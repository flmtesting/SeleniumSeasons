package jul15th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle2 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void multipleWindowHandleTest() throws InterruptedException
	{
		
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		
		switchToWindow("Adactin Hotel App - Apps on Google Play");
		
		
		driver.findElement(By.xpath("//span[text()='Games']/ancestor::button")).click();
		
		Thread.sleep(3000);
		
		//swithcing back to adactin home page
		
		driver.switchTo().window(homeWindowId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		Thread.sleep(3000);
		
		switchToWindow("TestFlight - Apple");
		
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(homeWindowId);
		
		
	}
	
	private void switchToWindow(String expTitle) throws InterruptedException {
		
		Set<String>  windowIds=driver.getWindowHandles();
		
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			String windowId=it.next();
			
			driver.switchTo().window(windowId);
			
			Thread.sleep(3000);
			
			//validate the title if the page where we switch to
			
			if(driver.getTitle().equals(expTitle))
			{
				break;
			}
			
		}
		
	}

	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	
	
	

}
