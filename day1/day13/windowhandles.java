package week5.day13;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowhandles {

	public static void main(String[] args) {
		
		ChromeOptions guest= new ChromeOptions();
		guest.addArguments("--guest");
		guest.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(guest);
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		Set<String> wNames=driver.getWindowHandles();
		List<String> wNamess= new ArrayList<String>(wNames);
		driver.switchTo().window(wNamess.get(1));
		
		String filightWN=driver.getTitle();
		System.out.println(filightWN);
		driver.switchTo().window(wNamess.get(0));
		driver.close();
		
		
		
		
		
		
		


		
}
}
