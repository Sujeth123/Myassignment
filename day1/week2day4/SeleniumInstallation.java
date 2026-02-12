package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInstallation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com"); 
   driver.manage().window().maximize();
   driver.findElement(By.id("email")).sendKeys("geethacivil@rediffmail.com");
   driver.findElement(By.id("pass")).sendKeys("Ganesh123*");
   driver.findElement(By.name("login")).click();
	}

}
