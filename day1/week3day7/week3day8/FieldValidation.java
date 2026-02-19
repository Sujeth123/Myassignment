package week3day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0gjur8w85x8dyf3gahnqnmh6m12796203.node0");	
	driver.manage().window().maximize();
	System.out.println("5.retrived the typed text :");
	String attribute = driver.findElement(By.xpath("(//h5[text()='Retrieve the typed text.']/following::Input)[1]")).getDomAttribute("value");
	System.out.println("retrived text form textbox "+ attribute);
	
	
	WebElement userName=driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']//following::input"));
	Point location = userName.getLocation();
	int x=location.x;
	int y= location.y;
	System.out.println(x + "," + y);
	System.out.println("before clickn position");

	userName.sendKeys("geetha");
	WebElement userName1 = driver.findElement(By.xpath("//label[contains(@class,'ui-outputlabel')]"));
	Point location1 = userName1.getLocation();
	
	int x1=location1.x;
	int y1= location1.y;
	System.out.println(x1 + "," + y1);
	
//	WebElement position = driver.findElement(By.xpath("//span[@class='ui-float-label']/input"));
//	Point check2= position.getLocation();
//	System.out.println("before clickn position");
//	System.out.println(check2.x);
//	System.out.println(check2.y);
//
	
//	driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).sendKeys("geetha");
//	WebElement position1 = driver.findElement(By.xpath("//label[contains(@class,'ui-outputlabel')]"));
//	System.out.println("after clickn position");
//
//	Point check3= position1.getLocation();
//	System.out.println(check3.x);
//	System.out.println(check3.y);
	if(location.y!=location1.y) {
		System.out.println("Position Changed");
		
	}else {
		System.out.println("Position not Changed");

	}
	

	}

}
