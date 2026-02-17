package week3day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		//ChromeDriver driver=new ChromeDriver();
			ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--guest");	
	ChromeDriver driver = new ChromeDriver(opt);
	driver.get("http://leaftaps.com/opentaps");	
	driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");	
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JohnsBrg");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("christs");
			WebElement source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceOpt=new Select(source);
		sourceOpt.selectByIndex(4);
		WebElement marketingCampaignId= driver.findElement(By.name("marketingCampaignId"));
		Select marketingCampaignIdOpt=new Select(marketingCampaignId);
		marketingCampaignIdOpt.selectByVisibleText("Automobile");	
		WebElement ownershipEnumId=driver.findElement(By.name("ownershipEnumId"));
		Select ownershipEnumIdOpt= new Select(ownershipEnumId);
		ownershipEnumIdOpt.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		String pageTitle=driver.getTitle();	
		if (pageTitle.contains("View Lead"))
				{
			System.out.println("The current page title is  "+ pageTitle);
			System.out.println("Title of the current web page is displaying as expected");
		}
		else {
		System.out.println("Title of the current web page is not displaying as expected");
		}
		driver.close();
	}

}
