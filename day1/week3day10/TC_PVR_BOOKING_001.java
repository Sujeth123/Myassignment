package week3day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_PVR_BOOKING_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement cine=driver.findElement(By.xpath("//span[@class='cinemas-inactive']"));
		
		driver.executeScript("arguments[0].click();", cine);	
		driver.findElement(By.xpath("//div[@id='cinema']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Royapettah')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("date")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']//following::li[2]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='DO DEEWANE SEHER MEIN']")).click();--doubt
		Thread.sleep(3000);		
	///	driver.findElement(By.xpath("//div[@id='movie']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@role='listbox']//following::li[2]")).click();
		
		Thread.sleep(3000);
			driver.findElement(By.xpath("//ul[@role='listbox']//following::li")).click();
			
			driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@id='EL.ELITE|I:14']")).click();
			Thread.sleep(3000);
			String seat1= driver.findElement(By.xpath("(//div[@class='seat-info']//following::p)[1]")).getText();
			Thread.sleep(3000);
			String seatno= driver.findElement(By.xpath("(//div[@class='seat-info']//following::p)[2]")).getText();
			Thread.sleep(3000);
			
			System.out.println("The Seat number " + seat1 + "-"  + seatno);
			
			
			
			Thread.sleep(3000);
			String grandTotal= driver.findElement(By.xpath("//div[@class='grand-total']/h6")).getText();
			Thread.sleep(3000);
			String grandTotalAmount= driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
			Thread.sleep(3000);
			System.out.println("The Seat number " + grandTotal + "="  + grandTotalAmount);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='sc-bbbBoY kbsOBB btn-proceeded']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[(text()='Continue')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
			String currentPage= driver.getTitle();
			System.out.println("The current Page is " + currentPage);
			driver.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		
		
		
		
		
		
		
		
	}

}
