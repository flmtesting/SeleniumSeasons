package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicibank.com/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//h5[text()='Calculators']/parent::div"));
		
		List<WebElement>  allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of Links "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement link=allLinks.get(i);
			
			System.out.println("Linkname "+link.getText());
			
			System.out.println(link.getAttribute("href"));
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0, 3000);");
			
			
			link.click();
			
			Thread.sleep(3000);
			
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().back();
			
			Thread.sleep(3000);
			
			block=driver.findElement(By.xpath("//h5[text()='Calculators']/parent::div"));
			
			allLinks= block.findElements(By.tagName("a"));
		}
		

	}

}
