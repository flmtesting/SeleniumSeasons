package jul14th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser started...");
		System.out.println("App launched...");
	}
	

	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed...");
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		
		Assert.assertTrue(true);
		System.out.println("login successfull.. ");
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("registration successfull.. ");
		
	}
	
	@Test(priority=3,enabled=true,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("change password successfull.. ");
		
	}
	

}
