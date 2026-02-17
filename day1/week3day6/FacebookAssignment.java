package week3day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("geethanallacts@gmail.com");
driver.findElement(By.xpath("//a[text()='Create new account']")).click();

driver.findElement(By.xpath("//div[@id='fullname_field']//input")).sendKeys("Sujeth1");


driver.findElement(By.xpath("//div[@id='fullname_field']//input[@name='lastname']")).sendKeys("Maha1");

WebElement birthDay= driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select bDay=new Select(birthDay);
bDay.selectByVisibleText("3");


WebElement birthMonth= driver.findElement(By.xpath("//select[@id='month']"));
Select bMonth=new Select(birthMonth);
bMonth.selectByIndex(11);

WebElement birthYear= driver.findElement(By.xpath("//select[@id='year']"));
Select bYear=new Select(birthYear);
bYear.selectByValue("2014");

driver.findElement(By.xpath("//input[@value='2']")).click();

driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1ahsu@gmail.com");

driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("******");

driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
