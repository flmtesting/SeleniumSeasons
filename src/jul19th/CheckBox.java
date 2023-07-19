package jul19th;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\FLM0730PM\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void radioButtonTest() throws IOException, InterruptedException
	{
		
	 Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected(), false);
	 Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected(), false);
	 
	 List<WebElement> allChecks=driver.findElements(By.xpath("//td[@class='table5']/descendant::input"));
	 
	 for(int i=0;i<allChecks.size();i++)
	 {
		 if(!allChecks.get(i).isSelected())
		 {
			 allChecks.get(i).click();
			 Thread.sleep(3000);
		 }
	 }
	 
	 Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Milk']")).isSelected(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Butter']")).isSelected(), true);
	 Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Cheese']")).isSelected(), true);
	 
	 
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		//Thread.sleep(3000);
		
		driver.quit();
	}
	

}
