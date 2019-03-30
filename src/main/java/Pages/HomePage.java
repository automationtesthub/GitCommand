package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HeaderPage {
	
private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

}
