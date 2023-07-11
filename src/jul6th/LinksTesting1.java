package jul6th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.linkText("Forgot Password?")).getAttribute("href"));
		
		//clicking on Forgot Password? 
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
