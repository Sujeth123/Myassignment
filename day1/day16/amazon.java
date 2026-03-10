package week5.day16;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
			
			ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price=driver.findElement(By.xpath("//span[@class='a-price']")).getText();
		String price1=price.replaceAll("(^₹0-9)", "");
		
		System.out.println("The Cost is "+ price1);
		
		
		String reviewRating=driver.findElement(By.xpath("//div[@data-cy='reviews-block']//following::a[2]")).getText();
		
		System.out.println("The # of Review  "+ reviewRating);
		
		driver.findElement(By.xpath("//div[@data-cy='title-recipe']/a")).click();

		Actions acts=new Actions(driver);
		
		
		Set<String> windowMult=driver.getWindowHandles();
		
		List<String>windowMult1 =new ArrayList<String>(windowMult);
		
		driver.switchTo().window(windowMult1.get(1));
		
		WebElement image = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		Thread.sleep(3000);

		File screenshotAs = image.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);

		File target=new File("./Screenshots/Snap.png");
		Thread.sleep(3000);

		FileUtils.copyFile(screenshotAs, target);
		
		
	
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));

		acts.scrollToElement(addToCart).perform();
		
		addToCart.click();
		
		driver.findElement(By.id("nav-cart-count")).click();
		
		String subTotal=driver.findElement(By.id("sc-subtotal-amount-activecart")).getText();
		String subTotal1=price.replaceAll("(^₹0-9)", "");

		System.out.println("The subTotal  "+ subTotal1);
		
		if(price1==subTotal1) {
			
			System.out.println("Both the price are same and verification passed");
		}else
		{
			System.out.println("Verification failed");
		}

		
		
		
		
		
		
		
	}

}
