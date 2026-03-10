package week5.day17;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class marathonTatacliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();

		Actions acts = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("moe-dontallow_button")).click();

		driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]")).click();

		Thread.sleep(3000);
		WebElement wWatches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Thread.sleep(3000);
		acts.moveToElement(wWatches).perform();
		Thread.sleep(3000);
		WebElement wCasio = driver.findElement(By.xpath("//div[text()='Casio']"));
		Thread.sleep(3000);
		acts.moveToElement(wCasio).perform();

		wCasio.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();

		Thread.sleep(3000);

		WebElement sortdropdown = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select popularity = new Select(sortdropdown);
		Thread.sleep(3000);

		popularity.selectByIndex(3);
		
		Thread.sleep(3000);

		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		
		List<String> listPrice = new ArrayList<String>();

		 //List<Integer> priceOfwatch1= new ArrayList<Integer>();

		 for(WebElement a:price ) {
		
		 String b= a.getText();
	 System.out.println("The Price of watch :" +b);
	 listPrice.add(b);
		
		 }
		
		

		
//
//		for (int i = 0; i < price.size(); i++) {
//			 Thread.sleep(5000);
//			String Fp = price.get(i).getText();
//			 Thread.sleep(5000);
//			int c = Integer.parseInt(Fp.replaceAll("[^0-9.]", ""));
//			 Thread.sleep(5000);
//			listPrice.add(c);
//			 Thread.sleep(5000);
//			System.out.println(c);
//		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(@class,'ProductModule__base')]")).click();

		Thread.sleep(3000);

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> WH = new ArrayList<String>(windowHandles);

		driver.switchTo().window(WH.get(1));
		System.out.println(WH.get(1));

		String firstwatchPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"))
				.getText();
		System.out.println("The 1st watch price :" + firstwatchPrice);
		WebElement addtocart = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		acts.scrollToElement(addtocart).perform();
		addtocart.click();
		
		String addTocartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();

		System.out.println("The 1st watch price :" + addTocartCount);

		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();

		Thread.sleep(5000);
		WebElement addcartImage = driver.findElement(By.xpath("//div[@class='App__base']"));

		File screenshotAs = addcartImage.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);

		File target = new File("./Screenshots/TataCliq.png");
		Thread.sleep(3000);

		FileUtils.copyFile(screenshotAs, target);
		Thread.sleep(3000);

		driver.close();
		Thread.sleep(3000);

		driver.switchTo().window(WH.get(0));
		Thread.sleep(3000);

		driver.close();

	}

}
