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

public class RadioButton2 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\FLM0730PM\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void radioButtonTest() throws IOException, InterruptedException
	{
		
	 
		List<WebElement> allRadios=driver.findElements(By.xpath(" //input[@name='group1']"));
		
		for(int i=0;i<allRadios.size();i++)
		{
			System.out.println(allRadios.get(i).getAttribute("checked"));
		}
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		//Thread.sleep(3000);
		
		driver.quit();
	}
	

}
