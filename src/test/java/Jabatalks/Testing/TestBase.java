package Jabatalks.Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TestBase {

	
	WebDriver driver;
	public String baseUrl = "http://jt-dev.azurewebsites.net/#/SignUp";
	
	
	@BeforeClass
	public void setup()
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	
	@AfterMethod
	public void Screenshot() {

		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 try {
		        FileUtils.copyFile(scr, new File("D:\\\\Screenshots\\\\ElementScreenshot.jpg"));
		    } catch (IOException e) {
		        System.out.println(e.getMessage());
		    }
		}
	
}
