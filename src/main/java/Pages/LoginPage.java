package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By logo=By.xpath("//img[@src='include/images/vtiger-crm.gif']");
	By username=By.name("user_name");
	By psswd=By.name("user_password");
	By theme=By.name("login_theme");
	By loginbtn=By.name("Login");
	By errmsg=By.xpath("//*[contains(text(),'You must specify a valid username and password.')]");
	
	public boolean invalidLogin(String user,String pwd)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
		driver.findElement(psswd).clear();
		driver.findElement(psswd).sendKeys(pwd);
		driver.findElement(loginbtn).click();
		if(driver.findElement(errmsg).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public HomePage validLogin(String user,String pwd)
	{
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
		driver.findElement(psswd).clear();
		driver.findElement(psswd).sendKeys(pwd);
		driver.findElement(loginbtn).click();
		return new HomePage(driver);
		
	}
	
	public boolean verifyTitle(String exp)
	{
		if(driver.getTitle().equals(exp))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifylogo()
	{
		if(driver.findElement(logo).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	

}
