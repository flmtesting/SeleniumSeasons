package jul5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//driver.get("https://echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		 System.out.println( driver.findElement(By.linkText("New User Register Here")).getAttribute("href"));
		
		//System.out.println( driver.findElement(By.linkText("New User Register Here")).getAttribute("id"));
		
		//System.out.println(driver.findElement(By.xpath("//input[@name='option2']")).getAttribute("checked"));
		
		
		System.out.println(driver.findElement(By.className("build_title")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.className("build_title")).getTagName());
		 
		
		 
		 driver.quit();
		

	}

}
