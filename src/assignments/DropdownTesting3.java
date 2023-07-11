package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		
		
		new Select(driver.findElement(By.xpath("//select[@name='birthday_day']"))).selectByVisibleText("20");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//select[@name='birthday_month']"))).selectByVisibleText("Oct");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//select[@name='birthday_year']"))).selectByVisibleText("2000");
		Thread.sleep(3000);
			
		
		
		driver.quit();
		

	}

}
