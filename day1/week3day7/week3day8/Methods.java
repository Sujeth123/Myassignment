package week3day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Methods {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		
		WebElement Uname= driver.findElement(By.id("username"));
		Uname.sendKeys("DemoCSR2");
		
		String name1=Uname.getDomAttribute("name");
		System.out.println(name1);

	
		System.out.println(text1);
		

		
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//      String currentUrl=driver.getCurrentUrl();
//		
//		System.out.println(currentUrl);
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		
//		
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sujeth");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Maha");
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("kidszee");
//		driver.findElement(By.name("generalProfTitle")).sendKeys("Create Lead");
//		Boolean buttonDisplayed=driver.findElement(By.name("submitButton")).isDisplayed();
//		System.out.println("Button is present= " + buttonDisplayed);
//		Boolean buttonEnabled=driver.findElement(By.name("submitButton")).isEnabled();
//		System.out.println("Button is Enabled= " + buttonEnabled);
//		driver.findElement(By.name("submitButton")).click();
//		String pageName=driver.getTitle();
//		if (pageName.contains("Lead"))
//				{
//			System.out.println("The Page title is : " + pageName + "and it is working as expected" );
//		}else {
//			System.out.println("The Page title is : " + pageName + "and it is not working as expected" );
//		}
//		driver.close();

	}

}
