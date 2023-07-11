package jul3rd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//get(String):void
		//this method will launch the web app whose URL is given as String
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		//close():void

		//this will close the window or tab on which webdriver focus is 
		
		//driver.close();
		
		//quit():void 

		//this method will close all the tabs/windows opened during the WebDriver session
		
		driver.quit();

	}

}
