package week4day12;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_RedBus_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();



driver.get("https://www.redbus.in/");

driver.manage().window().maximize();

///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

Thread.sleep(300);

//driver.executeScript(null, args)
//
driver.findElement(By.id("srcinput")).sendKeys("Perungalathur");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[text()='Perungalathur, Chennai']")).click();

driver.findElement(By.id("destinput")).sendKeys("Salem");
Thread.sleep(3000);

driver.findElement(By.xpath("//div[text()='Ammapet Bypass Road, Salem']")).click();
driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
Thread.sleep(5000);
String totalBus= driver.findElement(By.xpath("//div[contains(@class,'busesFoundText')]")).getText();
Thread.sleep(3000);
System.out.println("Total buses available " + totalBus);
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[contains(text(),'AC')])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(text(),'High Rated Buses')]")).click();

Thread.sleep(3000);
String totalHighRatedACBus=driver.findElement(By.xpath("//div[contains(@class,'busesFoundText')]")).getText();
Thread.sleep(3000);

System.out.println("Total # of high rated AC buses available " + totalHighRatedACBus);
Thread.sleep(3000);

List<WebElement> price = driver.findElements(By.xpath("//p[contains(@class,'finalFare')]"));

List<Integer> listPrice = new ArrayList<Integer>();

for(int i=0;i<price.size();i++) {
	
	String Fp=price.get(i).getText();
	
	int c=Integer.parseInt(Fp.replaceAll("[^0-9.]",""));
	
	listPrice.add(c);		
}

Collections.sort(listPrice);

System.out.println("The lowest price "+listPrice.get(0));

Thread.sleep(3000);

System.out.println("The current page =" + driver.getTitle() );


driver.close();







	}

}
