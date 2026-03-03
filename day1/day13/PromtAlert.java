package week5.day13;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		
	
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		 Alert prompt1=driver.switchTo().alert();
		 
	prompt1.sendKeys("Geetha");
	prompt1.accept();
	
	//<p id="demo">Hello Geetha! How are you today?</p>
	
	String promptmsg=driver.findElement(By.id("demo")).getText();

	//String promptmsg=driver.findElement(By.xpath("//p[@id='demo']")).getText();
	
		System.out.println("The message is : " + promptmsg); 
		
		
		
	}

}
