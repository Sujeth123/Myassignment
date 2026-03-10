package week5.day16;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class webTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--guest");
		
		ChromeDriver driver= new  ChromeDriver(option);
		
		driver.get("http://nyse.com/ipo-center/recent-ipo");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		Actions action=new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath("(//table[@data-testid='priced-deals'])//tr/td[1]"));
		action.moveToElement(element).perform();
		
		
		
		List<WebElement> size = driver.findElements(By.xpath("(//table[@data-testid='priced-deals'])//tr/td[1]"));
		
		List<String> column=new ArrayList<String>();
		
		System.out.println(size.size());
for (WebElement webElement : size) {
	
	String a=webElement.getText();
	
	System.out.print(a);
	column.add(a);
	System.out.print(" / ");

	
}
	}

}
