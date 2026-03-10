package week5.day17;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class MarathonServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://dev266363.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("Admin");
		driver.findElement(By.id("user_password")).sendKeys("CSO=y7Fc7m@c");
		driver.findElement(By.id("sysverb_login")).click();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions acts = new Actions(driver);

		Shadow Shadow = new Shadow(driver);
		Thread.sleep(3000);

		Shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		Thread.sleep(3000);

		// Shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service
		// catalog",Keys.ENTER);

		Shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		Shadow.findElementByXPath("//span[text()='Service Catalog']").click();

		Thread.sleep(3000);
		WebElement element = Shadow.findElementByXPath("//iframe[@id='gsft_main']");

		driver.switchTo().frame(element);

		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();

		driver.findElement(By.xpath("//a[@id='item_link_73b1bafa9752cd1021983d1e6253afb5']")).click();

		driver.findElement(By.xpath("//span[@class='input-group-radio']/label")).click();

		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']"))
				.sendKeys("9874561230");

		WebElement selectElement = driver
				.findElement(By.xpath("//select[contains(@class,'form-control cat_item_option')]"));

		Select select = new Select(selectElement);
		select.selectByValue("unlimited");

		WebElement phoneColor = driver.findElement(By.xpath("(//span[@class='input-group-radio'])[7]"));

		acts.moveToElement(phoneColor).perform();

		phoneColor.click();
		driver.findElement(By.xpath("(//span[@class='input-group-radio'])[10]")).click();

		driver.findElement(By.id("oi_order_now_button")).click();

		String sucessText = driver.findElement(By.xpath("//div[@class='notification notification-success']//span[2]")).getText();
		
		System.out.println("The Msg is :" + sucessText);

		String expectedMsg = "Thank you, your request has been submitted";
		
		if (sucessText.equals(expectedMsg)) {
			System.out.println("Order is placed sucessfully");
		} else {
			System.out.println("Order is not placed sucessfully");
		}
		String requestNumber = driver.findElement(By.id("requesturl")).getText();

		System.out.println("requestNumber  :" + requestNumber);
		
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots/ServiceNow.png");
		FileUtils.copyFile(screenshotAs, target);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
