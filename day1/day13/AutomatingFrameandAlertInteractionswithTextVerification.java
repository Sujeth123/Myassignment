package week5.day13;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameandAlertInteractionswithTextVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.switchTo().frame(0);
WebElement tryIt= driver.findElement(By.xpath("//button[text()='Try it']"));
tryIt.click();
Alert popup=driver.switchTo().alert();
String popUpTxt= popup.getText();
System.out.println("The text msg in popup is : " +popUpTxt);
popup.accept();
WebElement cfmsg= driver.findElement(By.xpath("//p[@id='demo']"));
String cfmsg1= cfmsg.getText();
System.out.println("The text msg in frame is : " +cfmsg1);
if(cfmsg1.contains("OK"))
{
	System.out.println("The verification is success");
}
else
{
	System.out.println("The verification is failed");
}

driver.close();



		
	}

}
