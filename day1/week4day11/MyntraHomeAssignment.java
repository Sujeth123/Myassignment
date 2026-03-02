package week4day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraHomeAssignment {



public static void main(String [] args) throws InterruptedException {
	
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.myntra.com/");
	
	driver.manage().window().maximize();
	
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags",Keys.ENTER);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//label[@class='common-customRadio gender-label']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[3]")).click();
	
	String countOfBags=driver.findElement(By.xpath("//span[@class='title-count']")).getText();
	
	System.out.println("Total bags =" + countOfBags);
	Thread.sleep(3000);
	 List<WebElement> productBrandE = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3[@class='product-brand']"));
	
	List<String> productBrandN=new ArrayList<String>();
	

	
	
	for (WebElement i : productBrandE) {
		
		String pb=i.getText();
		productBrandN.add(pb);
		System.out.println("The Laptop productBrand name is :" + pb);
	}
	Thread.sleep(3000);
	List<WebElement> productName = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h4[@class='product-product']"));
	
	driver.executeScript("return arguments[0].innerText;", productName);
	
	List<String> productN=new ArrayList<String>();
	
	for (WebElement e : productName) {


		String pn=e.getText();
		productN.add(pn);
		System.out.println("The Laptop product name  is :" + pn);
		
	}
	
	driver.close();
}
}


