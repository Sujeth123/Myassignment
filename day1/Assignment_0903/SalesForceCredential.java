package week6.day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class SalesForceCredential {

	WebDriver driver;
	
	@Parameters({"url","userName","passWord"})
	
	@BeforeSuite
	public void preConditions(String url,String userName,String passWord) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--user-data-dir=C:\\SeleniumProfile");
		option.addArguments("--disable-notification");

		 driver=new ChromeDriver(option);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.id("Login")).click();	

	}

}
