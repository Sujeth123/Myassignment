package week5.day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.switchTo().frame(1);
driver.switchTo().frame("frame2");
WebElement nestedFrame= driver.findElement(By.xpath("(//button[@id='Click'])[3]"));
nestedFrame.click();
System.out.println("Click");
			
		
		
	}

}
