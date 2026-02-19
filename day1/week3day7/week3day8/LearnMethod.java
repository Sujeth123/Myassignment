package week3day8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMethod {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCSR2");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujeth");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Maha");
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("kidszee");
	driver.findElement(By.name("generalProfTitle")).sendKeys("Create Lead");
	driver.findElement(By.name("submitButton")).click();
	String pageName=driver.getTitle();
	System.out.println("The Page title is :" + pageName);
	driver.close();

}
