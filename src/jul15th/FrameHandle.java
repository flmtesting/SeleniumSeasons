package jul15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void mouseHoverTest() throws InterruptedException
	{
		//frame(int) ==> here int is an index of frame , which we should calcuate manually starts from zero
		//driver.switchTo().frame(1);
		
		//frame(String) ==> here String is id or name attribute value only
		//driver.switchTo().frame("packageFrame");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'allclasses-frame')]")));
		
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		
		Thread.sleep(3000);
		
		//this will switch the focus from any frame to Page
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome' and @target='packageFrame']")).click();
		
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	

}
