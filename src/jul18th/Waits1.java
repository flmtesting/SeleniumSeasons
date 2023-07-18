package jul18th;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits1 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void screenshotTest() throws IOException, InterruptedException
	{
		
	   driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   
	   //Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Riyaz");
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	

}
