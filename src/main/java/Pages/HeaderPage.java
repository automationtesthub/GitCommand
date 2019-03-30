package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
	
private WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By linkLogout=By.linkText("Logout");
	By linkNewLead	=By.linkText("New Lead");
	By linkLead=By.linkText("Lead");
	By linkSettings =By.linkText("Settings");
	
	
	public boolean verifylogout()
	{
		if(driver.findElement(linkLogout).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void ClickLogout()
	{
		driver.findElement(linkLogout).click();
	}
	public void ClicklinkNewLead()
	{
		driver.findElement(linkNewLead).click();
	}
	public void ClicklinkLead()
	{
		driver.findElement(linkLead).click();
	}
	public void ClicklinkSettings()
	{
		driver.findElement(linkSettings).click();
	}
	

}
