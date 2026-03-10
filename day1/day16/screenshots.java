package week5.day16;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		
		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement conditionWBE = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		
		Actions act=new Actions(driver);
		
		act.scrollToElement(conditionWBE).perform();

		String conditionWBEText=conditionWBE.getText();
		System.out.println("The Text is : " +conditionWBEText);
		
		File screenshotAs = conditionWBE.getScreenshotAs(OutputType.FILE);
		File target=new File("./Screenshots/Snap.png");
		FileUtils.copyFile(screenshotAs, target);
		
		
		
		driver.close();
		
		
	}
}
