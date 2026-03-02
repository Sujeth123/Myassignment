package week4day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Dacathon_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();



		driver.get("https://www.decathlon.in/");

		driver.manage().window().maximize();

		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		Thread.sleep(300);

		String homeTitle=driver.getTitle();
		
		System.out.println(homeTitle);
		
		if(homeTitle=="Buy Sporting Goods, Sportswear and Equipments | Download App") {
			System.out.println("The Decathlon homepage is displayed");
		}
			
		Thread.sleep(5000);
		
		WebElement text=driver.findElement(By.xpath("//span[contains(text(),'Search for')]"));
		System.out.println("The Decathlon homepage is displayed1");
		text.click();
		System.out.println("The Decathlon homepage is displayed2");
		Thread.sleep(5000);
		//text.sendKeys("Shoes");
		driver.findElement(By.xpath("//span[text()='Shoes For Men']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[contains(@class,'focus:outline')])[2]")).sendKeys("Run");
		System.out.println("Running text");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Running')]")).click();
		System.out.println("Running checked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@class='flex items-center cursor-pointer']//span[@class='aisRefinementListLabelText']")).click();
		Thread.sleep(5000);
		System.out.println("Men checked");
		driver.findElement(By.xpath("//p[contains(@class,'inline-block relative')]/span")).click();
		System.out.println("Sort clicked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(@class,'inline-block relative')]//li/a[text()='Highest Discount']")).click();
		System.out.println("Highest Discount checked");
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='ADD TO CART']")).click();
		System.out.println("Addtocart checked");
		Thread.sleep(5000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'py-2 px-3 font-medium')])[5]")).click();
		System.out.println("select Size checked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
		System.out.println("Addtocart2 checked");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='relative'])[3]")).click();
		System.out.println("Go Addtocart clicked");
		Thread.sleep(5000);
		
		
		
		
		
		

		
		
	}

}
