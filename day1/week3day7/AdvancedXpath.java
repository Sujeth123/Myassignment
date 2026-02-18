package week3day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[1]")).sendKeys("Sujeth");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']/following::input[1]")).sendKeys("Maha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']/following::input[2]")).sendKeys("kidszee");
		driver.findElement(By.xpath("//div[@class='fieldgroup']/descendant::input[9]")).sendKeys("Create Lead");
		
		
	
		
		
		
		driver.findElement(By.name("submitButton")).click();
		String pageName=driver.getTitle();
		System.out.println("The Page title is :" + pageName);
		driver.close();
	}

}
