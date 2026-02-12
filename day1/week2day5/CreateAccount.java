package week2day5;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoCSR2");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.id("label")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Geetha N");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("100");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.className("smallSubmit")).click();
String titleName=driver.getTitle();
driver.close();
System.out.println(titleName);
	

	}

}
