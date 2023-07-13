package jul13th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys("Electronics");
		
		Thread.sleep(3000);
		
		System.out.println( driver.findElement(By.xpath("//option[text()='Books']")).isSelected());
		
		System.out.println( driver.findElement(By.xpath("//option[text()='Electronics']")).isSelected());
		
		driver.quit();

	}

}
