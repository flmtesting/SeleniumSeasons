package jul1st;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\FLM0730PM\\softwares\\chromedriver_win32\\chromedriver.exe");
		
		new ChromeDriver();

	}

}
