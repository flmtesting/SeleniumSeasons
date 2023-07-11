package jul6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
