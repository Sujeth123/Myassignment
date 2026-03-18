package testNGDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization  extends ProjectSpecific{


	@Test(dataProvider ="data")
	public void commonNavigation(String name,String cName ,String Desc) throws InterruptedException  {

	
		//			
//		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--user-data-dir=C:\\SeleniumProfile");
//		option.addArguments("--disable-notification");
//
//		ChromeDriver driver=new ChromeDriver(option);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);

		Actions action=new Actions(driver);
		
		Thread.sleep(3000);
		WebElement legalEntities = driver.findElement(By.xpath("//p[text()='Legal Entities']"));

		action.moveToElement(legalEntities).perform();

		legalEntities.click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cName);
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(Desc);
	
		
//		WebElement status = driver.findElement(By.xpath("//button[contains(@id,'combobox-button')]"));
//		action.moveToElement(status).perform();
//		status.click();
//		driver.findElement(By.xpath("//span[text()='Active']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String msg=driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		
		//String expected ="Legal Entity "TestLeafB" was created.";
		String expected ="created.";
		
		System.out.println(msg);
		
		if(msg.contains(expected)) {
			System.out.println("Verification passed");
		}else {
			System.out.println("Verification failed");

		}
		
		
			
			
			
		}
	



}
