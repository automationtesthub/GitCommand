package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLeadPage extends HeaderPage {
	
private WebDriver driver;
	
	public CreateLeadPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	
	By txtlastname=By.name("lastname");
	By txtcompany=By.name("company");
	By save=By.name("button");
	
	
	public void createNewLeadwithMandatoryfields(String lastname, String comp)
	{
		driver.findElement(txtlastname).sendKeys(lastname);
		driver.findElement(txtcompany).sendKeys(comp);
		driver.findElements(save).get(0).click();
	}

}
