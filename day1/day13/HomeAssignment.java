package week5.day13;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys("DemoCSR2");
driver.findElement(By.id("password")).sendKeys("crmsfa");

driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

driver.findElement(By.xpath("//td[span[text()='From Contact']]/following-sibling::td//a")).click();
Thread.sleep(5000);

Set<String> windowHandles = driver.getWindowHandles();
Thread.sleep(5000);

List<String> wH=new ArrayList<String>(windowHandles);
System.out.println(wH.get(0));
Thread.sleep(5000);

System.out.println(wH.get(1));
driver.switchTo().window(wH.get(1));
driver.findElement(By.xpath("//a[@class='linktext']")).click();
//2nd wh2
driver.switchTo().window(wH.get(0));
driver.findElement(By.xpath("//td//input[@id='partyIdTo']/following::a[1]")).click();
Thread.sleep(5000);

Set<String> windowHandles1 = driver.getWindowHandles();
Thread.sleep(5000);

List<String> wH1=new ArrayList<String>(windowHandles1);
Thread.sleep(5000);

System.out.println(wH1.get(0));
Thread.sleep(5000);

System.out.println(wH1.get(1));
driver.switchTo().window(wH1.get(1));
driver.findElement(By.xpath("(//tbody/tr/td/div/a)[5]")).click();
driver.switchTo().window(wH1.get(0));
driver.findElement(By.xpath("//a[text()='Merge']")).click();
Alert pop1=driver.switchTo().alert();

pop1.accept();

driver.switchTo().window(wH1.get(0));
String wW2=driver.getTitle();
//driver.switchTo().defaultContent();
System.out.println(wW2);
if(wW2.contains("Contact")) {
	System.out.println("Test Case passed");
}

driver.close();


	}

}
