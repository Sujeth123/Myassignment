package week3day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--guest");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='password']//preceding::input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//input[@id='username']//following::input)[1]")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		driver.findElement(By.xpath("//span[@class='requiredField']//following::input[@name='companyName']")).sendKeys("kidszee");
		driver.findElement(By.xpath("//span[@class='requiredField']//following::input[@name='firstName']")).sendKeys("Sujeth");
		
		driver.findElement(By.xpath("//span[@class='requiredField']//following::input[@name='lastName']")).sendKeys("Maha");	
		driver.findElement(By.xpath("//span[@class='requiredField']//following::input[@name='firstNameLocal']")).sendKeys("Sujeth");
		driver.findElement(By.xpath("//span[@class='requiredField']//following::input[@name='lastNameLocal']")).sendKeys("Maha");
	
		driver.findElement(By.xpath("//span[@class='requiredField']//following::input[@name='departmentName']")).sendKeys("Create Lead");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Create Lead 123434");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("CreateLead@gmail.com");
		
		WebElement stateProvince=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvinceOpt=new Select(stateProvince);
		stateProvinceOpt.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("12345_test");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		
		String pageName=driver.getTitle();
		System.out.println("The Page title is :" + pageName);
		driver.close();

	}

}
