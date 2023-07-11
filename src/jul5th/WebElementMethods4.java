package jul5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicibank.com//");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Loans']")).isDisplayed());
		
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[text()='Loans']")))
		.build().perform();
		
		System.out.println(driver.findElement(By.xpath("//label[text()='Agri and Rural Finance']")).isDisplayed());
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
