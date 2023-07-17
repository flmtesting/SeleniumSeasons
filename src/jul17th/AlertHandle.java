package jul17th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginNoUsernameNoPassword() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		//switching focus form page to alert
		Alert al=driver.switchTo().alert();
		
		Assert.assertEquals(al.getText(), "Please enter a valid user name");
		
		//to click ok button on alert
		al.accept();
		
		
		
	}
	
	@Test
	public void loginUsernameNoPassword() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("reyaz0607");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		
		Assert.assertEquals(al.getText(), "Please enter your password");
		
		al.accept();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
	

}
