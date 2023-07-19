package jul19th;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits3 {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\FLM0730PM\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void screenshotTest() throws IOException, InterruptedException
	{
		
	  driver.findElement(By.xpath("//span[text()='1']")).click();
	  driver.findElement(By.xpath("//span[text()='+']")).click();
	  driver.findElement(By.xpath("//span[text()='3']")).click();
	  driver.findElement(By.xpath("//span[text()='=']")).click();
	  //Fluent Wait
	  
	  FluentWait<WebDriver> fWait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
	                                       .pollingEvery(Duration.ofMillis(300))
	                                       .ignoring(NoSuchElementException.class);
	  
	  fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@id='spinner']")));
	  
	  String res=driver.findElement(By.xpath("//div[@class='screen']")).getText();
	  
	  System.out.println(res);
	  
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{
		
		//Thread.sleep(3000);
		
		driver.quit();
	}
	

}
