package week3day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_AMAZON_SEARCH_002 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys("Bags for boys");
		Thread.sleep(3000);
		String searchResult=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']")).getText();
		Thread.sleep(3000);
		System.out.println("The first Search result is "  + searchResult);
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='Safari']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='American Tourister']")).click();
		 Thread.sleep(3000);
			String searchResult2=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']")).getText();
			System.out.println("The second Search result is "  + searchResult2);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
			 driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
				Thread.sleep(3000);
			 String firstProduct=driver.findElement(By.xpath("//div[@data-cy='title-recipe']")).getText();
			 String firstProductPrice=driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
				System.out.println("The first product is "  + firstProduct);
				System.out.println("The product Price is "  + firstProductPrice);
				String currentPage=driver.getTitle();
				System.out.println("The current Page tile "  + currentPage);
				driver.close();
				
				
				
				
			
			
		 

		
		
		
	}

}
