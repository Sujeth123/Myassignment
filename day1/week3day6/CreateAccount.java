package week3day6;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR2");
		driver.findElement(By.xpath("//input[contains(@name,'PASS')]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[3]/input")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		WebElement industry=  driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industryOpt=new Select(industry);
		industryOpt.selectByIndex(3);
		
		WebElement ownershipID=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownershipIDOpt=new Select(ownershipID);
		ownershipIDOpt.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sourceOpt=new Select(source);
		sourceOpt.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketingCampaignOpt=new Select(marketingCampaign);
		marketingCampaignOpt.selectByIndex(6);
		
		WebElement stateProvince=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateProvinceOpt=new Select(stateProvince);
		stateProvinceOpt.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit"));
		String pageTitle=driver.getTitle();	
		if (pageTitle.contains("Create Account"))
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
