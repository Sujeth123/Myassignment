package stepDefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForce {
	
	ChromeDriver driver;
	
	
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	   ChromeOptions options=new ChromeOptions();
	   options.addArguments("--user-data-dir=C:\\SeleniumProfile");
	   options.addArguments("--disable-notification");
		driver=new ChromeDriver(options);
	   
	}

	@Given("Launch the Url")
	public void launch_the_url() throws InterruptedException {
	  driver.get("https://login.salesforce.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://login.salesforce.com");  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.findElement(By.id("username")).sendKeys("geethanallacts.ba20a80667e1@agentforce.com");
	  driver.findElement(By.id("password")).sendKeys("Ganesh123*");
	  driver.findElement(By.id("Login")).click();
	  Thread.sleep(5000);
	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	   
		
	}

	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher(){
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		
		WebElement sales = driver.findElement(By.xpath("//p[text()='Sales']"));
		Actions action=new Actions(driver);
		action.moveToElement(sales).perform();
		sales.click();

		
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		
		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", accounts);
		
	}

	@When("Click on New button")
	public void click_on_new_button() {
		WebElement newaccounts = driver.findElement(By.xpath("//div[@title='New']"));
		newaccounts.click();
		
	}

	@When("Enter the name as account name")
	public void enter_the_name_as_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Geetha");
		
		
	}

	
	@When("Select Ownership")
	public void select_ownership() {
		WebElement ownership = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		ownership.click(); 
		WebElement selectPublic = driver.findElement(By.xpath("//span[@title='Public']"));
		selectPublic.click(); 	
	}

	@When("Click save")
	public void click_save() {
		WebElement saveButton = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		saveButton.click();
	}

	@Then("Account created with name successful")
	public void account_created_with_name_successful()  {
	
		WebElement toastMsg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		String toastMsg1 = toastMsg.getText();
		String toastMsgs = toastMsg1.replace("\"", "");
		System.out.println(toastMsgs);
		String expectedmsg="Account Geetha was created.";
		if(toastMsgs.equalsIgnoreCase(expectedmsg)) {
			System.out.println("Account created successfully");
		}else {
			System.out.println("Account is not created");

		}
		
	}
}
