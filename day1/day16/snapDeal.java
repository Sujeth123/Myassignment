package week5.day16;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapDeal {
public static void main(String[]arg) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();

	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Actions acts=new Actions(driver);
	
	
	driver.findElement(By.xpath("//div[@id='tab-category-0']")).click();
	
	
	WebElement sportShoes = driver.findElement(By.xpath("//div[contains(text(),'Sports Shoes')]"));

	acts.moveToElement(sportShoes).perform();
	
	sportShoes.click();
	
	String countShoes1 = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	
	String countShoes= countShoes1.replaceAll("(^0-9)", "");
	System.out.println("The total number of countShoes :"+countShoes);
	
	driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	
	driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
	driver.findElement(By.xpath("//ul[@class='sort-value']//li[2]")).click();
	
	List<WebElement> priceElement = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	
	List<String> pricelist=new ArrayList<String>();
	
	for (WebElement a : priceElement) {
		
//		String pricelist1=priceElement.get(0).getText().replaceAll("(^0-9)", "");
		
		Thread.sleep(3000);
		String pricelist_1=priceElement.get(0).getText();
		
		 String pricelist1 = pricelist_1.replaceAll("(^0-9)", "");
		
		pricelist.add(pricelist1);
		
	}
	
	List<String> pricelistCopy=new ArrayList<String>();
	
	pricelistCopy.addAll(pricelist);
	
	Collections.sort(pricelistCopy);
	
for(int i=0;i<pricelistCopy.size();i++) {

	String pricelistCopyText=pricelistCopy.get(i);
	String pricelistText=pricelist.get(i);
	
	if(pricelistCopyText==pricelistText) {
		
		System.out.println("The prices are ordered in asce");
	}else
	{
		System.out.println("The prices are not ordered in asce");
		break;
	}
}
	
	}
}
