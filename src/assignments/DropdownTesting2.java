package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select s1=new Select(day);
		
		s1.selectByVisibleText("20");
		
		Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select s2=new Select(month);
		
		s2.selectByVisibleText("Oct");
		
		Thread.sleep(3000);
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s3=new Select(year);
		
		s3.selectByVisibleText("2000");
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
