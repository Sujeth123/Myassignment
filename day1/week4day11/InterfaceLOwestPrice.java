package week4day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterfaceLOwestPrice {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(300);
		
//Keyboard action
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@value='Go']")).click();
	 List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	 System.out.println("The # of phone product displayed " +  elements.size());
	 for(int i=0;i<elements.size();i++)
	 {
		 
			 String price=elements.get(i).getText();
			 
			 System.out.println("The price of mobile phone " + price);
			 
	 }
		
		
			

	}

}
