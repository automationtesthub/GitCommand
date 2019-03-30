package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AppSetting.CommonFunction;
import AppSetting.configfile;
import Pages.HomePage;
import Pages.LoginPage;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTest extends BaseTest {
	
	
	@Given("^user need to navigate on vtiger website$")
	public void user_need_to_navigate_on_vtiger_website() throws Throwable {
		
		if(report==null)
		{
		createtestReport();
		}
		launchApp();
	}

	@Given("^enter user id as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void enter_user_id_as_and_password_as(String arg1, String arg2) throws Throwable {
		 System.out.println("Credentials entered");
		    logger=report.startTest("verifyvalidlogin");
			LoginPage lp=new LoginPage(driver);
			HomePage hp=lp.validLogin(arg1, arg2);
			boolean val=hp.verifylogout();
			Assert.assertEquals(true, val);
			hp.ClickLogout();
			if(val)
			{
				logger.log(LogStatus.PASS, "validation done successfully");	
			}
			else
			{
				CommonFunction.getscreenshot("verifyApplicationUrl", driver);
				logger.log(LogStatus.FAIL, "valid login failed");	
			}
			report.endTest(logger);
			report.flush();
		
	}

	

	@Then("^Logout link should be appered on home page$")
	public void logout_link_should_be_appered_on_home_page() throws Throwable {
		Assert.assertEquals(driver.findElements(By.linkText("Logout")).size(), 0);
		driver.quit();
	}
	

}
