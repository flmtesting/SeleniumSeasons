package jul4th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.className("build_title")).getText());
		
		System.out.println( driver.findElement(By.xpath("//img[@alt='Hotel Image 3']")).getLocation().getX());
		
		System.out.println( driver.findElement(By.xpath("//img[@alt='Hotel Image 3']")).getLocation().getY());
		
		System.out.println( driver.findElement(By.xpath("//img[@alt='Hotel Image 3']")).getSize().getHeight());
		
		System.out.println( driver.findElement(By.xpath("//img[@alt='Hotel Image 3']")).getSize().getWidth());
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
