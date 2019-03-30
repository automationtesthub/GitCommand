package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import AppSetting.CommonFunction;
import AppSetting.configfile;

public class BaseTest {
	public WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest logger; 
	public  static String extentReport;
	
	public void launchApp()
	{
		   System.setProperty("webdriver.chrome.driver", "E:/Selenium/Selenium_Software/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get(configfile.url);
		   driver.manage().timeouts().implicitlyWait(configfile.globaltimeout, TimeUnit.SECONDS);
	}
	
	public void createtestReport()
	{
		report=CommonFunction.setupResult();
	}

}
