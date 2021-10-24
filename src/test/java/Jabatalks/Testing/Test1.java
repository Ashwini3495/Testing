package Jabatalks.Testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 extends TestBase{

		@Test
		public void signUp() throws InterruptedException
		{
			driver.get(baseUrl);
			
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("language")));
				
			String lang = driver.findElement(By.id("language")).getText();
			
					if (lang.equalsIgnoreCase("English"))
						{
							System.out.println("English is available in language dropdown");
			
						}
					else if (lang.equalsIgnoreCase("Dutch"))
						{
			
							System.out.println("Dutch is available in language dropdown");	
						}
		
					else
			System.out.println("Other language is avialable");
		
		
				driver.findElement(By.name("name")).sendKeys("Ashwini Pawar");
				
					Thread.sleep(20);
		
				driver.findElement(By.id("orgName")).sendKeys("CapG");
		
					Thread.sleep(20);
		
				driver.findElement(By.id("singUpEmail")).sendKeys("ash.pawar@gmail.com");
		
					Thread.sleep(20);
		
				driver.findElement(By.xpath("//*[@class = 'black-color ng-binding']")).click();
		
					Thread.sleep(20);
					
					driver.findElement(By.xpath("//*[@type = 'submit']")).click();
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					}
		}


