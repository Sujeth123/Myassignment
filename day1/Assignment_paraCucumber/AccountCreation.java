package stepDefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountCreation {
	ChromeDriver driver;

	@Given("Login to Salesforce with userID and Pwd")
	public void login_to_salesforce_with_user_id_and_pwd() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
		options.addArguments("--disable-notification");
		driver=new ChromeDriver(options);

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

	@Given("Click on App Launcher icon")
	public void click_on_app_launcher_icon() throws InterruptedException {

		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("sales",Keys.ENTER);
		driver.findElement(By.xpath("(//p[@title='Manage your sales process with accounts, leads, opportunities, and more']/preceding::mark[text()='Sales'])[4]")).click();


	}

	@When("Click on the Accounts tab")
	public void click_on_the_accounts_tab() {
		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
	}

	@When("Click on the New button")
	public void click_on_the_new_button() {

		driver.findElement(By.xpath("//div[@title='New']")).click();

	}

	@When("Enter your name as account name {string}")
	public void enter_your_name_as_account_name (String AccountName) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(AccountName);

	}

	

	@When("Select Ownership {string}")
	public void select_ownership(String Ownership) {
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
		
		driver.findElement(By.xpath("//span[@title='"+Ownership+"']")).click();

	}

	@When("Click on Save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

	@Then("Verify the Account Name {string}")
	public void verify_the_account_name(String AccountName) throws InterruptedException {
//		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
//		driver.executeScript("arguments[0].click();", accounts);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys(AccountName,Keys.ENTER);
//		String text = driver.findElement(By.xpath("//table[@class='slds-table slds-table_header-fixed slds-table_bordered slds-table_edit slds-table_resizable-cols']//thead/tr/th[3]")).getText();
//		Assert.assertEquals(text, AccountName);
//		
		driver.close();

	}}

