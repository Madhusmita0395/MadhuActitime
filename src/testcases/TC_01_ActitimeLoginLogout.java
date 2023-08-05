package testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.BaseTest;
import pages.ActitimeHomePage;
import pages.ActitimeLoginPage;

//@Listeners(generics.Screenshot.class)
public class TC_01_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test(dependsOnMethods = "login")
	public void titlevalidationhomepage()
	{
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.validateTitle();
	}
	
	@Test (dependsOnMethods = "titlevalidationhomepage")
	public void logout() throws InterruptedException
	{
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}