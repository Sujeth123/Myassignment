package week5.day16;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 2. Click on "Shop by Category"
		WebElement shopByCategory = driver.findElement(By.xpath("(//span[text()='Category'])[2]"));

		shopByCategory.click();
		// 3. Mouse over "Foodgrains, Oil & Masala"
		
		WebElement foodgrainMenu = driver.findElement(By.xpath("(//a[contains(text(),'Foodgrains')])[2]"));

		Actions act = new Actions(driver);
		Thread.sleep(3000);

		
		
		
		act.moveToElement(foodgrainMenu).perform();

		Thread.sleep(3000);
		// 4. Mouse over "Rice & Rice Products"
		WebElement riceRiceProducts = driver.findElement(By.xpath("//a[contains(text(),'Rice & Rice Products')]"));

		Thread.sleep(3000);

		act.moveToElement(riceRiceProducts).perform();

		//5.	Click on "Boiled & Steam Rice". 
		Thread.sleep(3000);

		WebElement boiledSteamRice = driver.findElement(By.xpath("//a[contains(text(),'Boiled & Steam Rice')]"));
		Thread.sleep(3000);

		boiledSteamRice.click();

		WebElement brandSearch = driver.findElement(By.xpath("//span[text()='Brands']//following::input[1]"));
		
		
		brandSearch.sendKeys("bb Royal");
        TakesScreenshot ts = (TakesScreenshot) driver;


		Thread.sleep(3000);
		act.scrollToElement(brandSearch).perform();
		Thread.sleep(3000);
		
		
		
		///driver.executeScript("argument(0).click()", Element);
		//driver.executeScript("window.scrollBy(0, 500)");
		WebElement bbRoyal=driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
		
		act.moveToElement(bbRoyal).perform();
		
		bbRoyal.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowHandlesL=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowHandlesL.get(1));
		
		Thread.sleep(5000);
		WebElement kg5Rice = driver.findElement(By.xpath("//span[text()='5 kg']"));
		
		act.moveToElement(kg5Rice).perform();
		Thread.sleep(3000);
		kg5Rice.click();
		
		String price=driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 sc-eulNck jnBJRV jdJBSX'])[4]")).getText();
		
		System.out.println("The price of 5 kg ponni rice is " +price);
		

		
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		
		String confirmMsg=driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		
		
		//String confirmMsg=driver.findElement(By.xpath("//div[@class='sc-kAyceB ekzshD']")).getText();

		System.out.println(confirmMsg);
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
	File target = new File("./Screenshots/bibasket.png");
	
	FileUtils.copyFile(screenshotAs, target);
	
	driver.close();
	
	driver.switchTo().window(windowHandlesL.get(0));
	
	driver.close();
	
	
		
		
		
		

	}

}
