package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;
import generics.Helper;

public class ActitimeHomePage extends BasePage
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod() throws InterruptedException
	{
		webdriverwaitvisibilityof(driver, logoutLink);
		Helper.highlightelement(driver, logoutLink);
		javascriptclick(driver, logoutLink);
	}
	
	public void validateTitle()
	{
		webdriverwaittitlecontains(driver, "Enter");
		gettitle(driver, "actiTIME - Enter Time-Track");
	}
}