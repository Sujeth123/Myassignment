package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecific {

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
//	@AfterMethod
//	public void chromeclose() {
//	driver.close();
//	}
	
	@DataProvider(name="data")

	public static String[][] dataCollection(){
		
		String[][] data=new String[2][3];
		data[0][0]="TestLeafA";
		data[0][1]="TestLeafAA";
		data[0][2]="Salesforces1";
		
		data[1][0]="TestLeafB";
		data[1][1]="TestLeafBB";
		data[1][2]="Salesforces2";

		return data;
		
		
	}
}
