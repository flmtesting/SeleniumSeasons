package jul13th;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	
	@Test(priority=2)
	public void loginTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched...");
		Assert.assertTrue(false);
		System.out.println("login successfull.. ");
		System.out.println("Browser Closed...");
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched...");
		System.out.println("registration successfull.. ");
		System.out.println("Browser Closed...");
	}
	
	@Test(priority=3,enabled=true,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched...");
		System.out.println("change password successfull.. ");
		System.out.println("Browser Closed...");
	}
	

}
