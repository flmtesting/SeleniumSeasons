package jul4th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("reyaz0617");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).clear();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
