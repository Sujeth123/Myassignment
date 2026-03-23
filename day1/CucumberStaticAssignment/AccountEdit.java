package stepDefenition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountEdit {
	ChromeDriver driver;


	@Given("Login to Salesforce")
	public void login_to_salesforce() throws InterruptedException {
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

	@Given("Click on App Launcher")
	public void click_on_app_launcher() {
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	}

	@When("Select Accounts")
	public void select_accounts() {

		WebElement accounts = driver.findElement(By.xpath("//a[@title='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
	}

	@When("Search for the account")
	public void search_for_the_account() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Geetha",Keys.ENTER);
		driver.findElement(By.xpath("//table[@class='slds-table slds-table_header-fixed slds-table_bordered slds-table_edit slds-table_resizable-cols']//tbody/tr/td[2]")).click();
		Thread.sleep(3000);
	}

	@When("Click the dropdown icon next to the account and select Edit")
	public void click_the_dropdown_icon_next_to_the_account_and_select_edit() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']")).click();
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
	}

	@When("Set Type to Technology Partner")
	public void set_type_to_technology_partner() {
		driver.findElement(By.xpath(("(//div[@class='slds-form-element__control'])[5]"))).click();
		driver.findElement(By.xpath(("//span[@title='Technology Partner']"))).click();

	}

	@When("Set Industry to Healthcare")
	public void set_industry_to_healthcare() {
		driver.findElement(By.xpath(("(//div[@class='slds-form-element__control'])[7]"))).click();

		Actions action=new Actions(driver);

		WebElement options = driver.findElement(By.xpath(("//span[@title='Healthcare']")));
		action.scrollToElement(options).perform();
		options.click();


	}

	@When("Enter a unique number in the Phone field {string}")
	public void enter_a_unique_number_in_the_phone_field(String phonenum) {
		Actions action=new Actions(driver);
		WebElement phone = driver.findElement(By.xpath("//input[@name='Phone']"));
		action.moveToElement(phone).perform();

		phone.sendKeys(phonenum);	   
	}
	@When("Set Active to NO")
	public void set_active_to_no() {
		Actions action=new Actions(driver);
		WebElement active = driver.findElement(By.xpath(("//button[@aria-label='Active']")));
		action.moveToElement(active).perform();
		active.click();
		driver.findElement(By.xpath(("//span[@title='No']"))).click();

	}



	@When("Set Upsell Opportunity to No")
	public void set_upsell_opportunity_to_no() {
		Actions action=new Actions(driver);
		WebElement upsellOpportunity =driver.findElement(By.xpath(("//button[@aria-label='Upsell Opportunity']")));
		action.moveToElement(upsellOpportunity).perform();
		upsellOpportunity.click();
		driver.findElement(By.xpath(("//span[@title='No']"))).click();
	}
	@When("Enter the Billing Address {string} and {string} and {string} and {string}")
	public void enter_the_billing_address_and_and_and(String Coun, String street, String city, String province1) throws InterruptedException {

		Thread.sleep(3000);
		Actions action=new Actions(driver);

		WebElement billingCountry = driver.findElement(By.xpath(("//input[@name='country']")));
		action.moveToElement(billingCountry).perform();
		driver.executeScript("arguments[0].click();", billingCountry);


		Thread.sleep(3000);
		WebElement countryOption = driver.findElement(By.xpath(("//span[@title='"+Coun+"']")));
		action.moveToElement(countryOption).perform();
		countryOption.click();		
		driver.findElement(By.xpath(("//textarea[@name='street']"))).sendKeys(street);

		driver.findElement(By.xpath(("//input[@name='city']"))).sendKeys(city,Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath(("//input[@name='province']"))).click();
		Thread.sleep(3000);
		WebElement province = driver.findElement(By.xpath(("//span[@title='"+province1+"']")));
		action.moveToElement(province).perform();

		province.click();
		driver.findElement(By.xpath(("//input[@name='postalCode']"))).sendKeys("600126");
	}

	@When("Enter the Shipping Address")
	public void enter_the_shipping_address() throws InterruptedException {

		Thread.sleep(3000);

		WebElement country1=driver.findElement(By.xpath(("(//input[@name='country'])[2]")));
		Actions action=new Actions(driver);
		driver.executeScript("arguments[0].click();", country1);
		WebElement countryOption1 = driver.findElement(By.xpath(("(//span[@title='India'])[2]")));
		action.scrollToElement(countryOption1).perform();
		countryOption1.click();

		driver.findElement(By.xpath(("//label[text()='Shipping Street']//following::textarea[@name='street']"))).sendKeys("2nd Street");

		driver.findElement(By.xpath(("//label[text()='Shipping City']//following::input[@name='city']"))).sendKeys("Chennai",Keys.TAB);
		Thread.sleep(3000);

		driver.findElement(By.xpath(("//label[text()='Shipping State/Province']//following::input[@name='province']"))).click();
		WebElement stateOption = driver.findElement(By.xpath(("(//span[@title='Tamil Nadu'])[2]")));


		action.scrollToElement(stateOption).perform();
		stateOption.click();
		driver.findElement(By.xpath(("//label[text()='Shipping Zip/Postal Code']//following::input[@name='postalCode']"))).sendKeys("600126");
	}

	@When("Set Customer Priority to Low")
	public void set_customer_priority_to_low() throws InterruptedException {

		Thread.sleep(3000);
		Actions action=new Actions(driver);

		WebElement customerPriority = driver.findElement(By.xpath(("//button[@aria-label='Customer Priority']")));
		action.scrollToElement(customerPriority).perform();

		driver.executeScript("arguments[0].click();", customerPriority);
		Thread.sleep(3000);

		driver.findElement(By.xpath(("//span[@title='Low']"))).click();


	}

	@When("Set SLA to Silver")
	public void set_sla_to_silver() {
		Actions action=new Actions(driver);
		WebElement sla = driver.findElement(By.xpath(("//button[@aria-label='SLA']")));
		action.moveToElement(sla).perform();
		sla.click();

		driver.findElement(By.xpath(("//span[@title='Silver']"))).click();

	}



	@When("Click on Save")
	public void click_on_save() {
		driver.findElement(By.xpath(("//button[@name='SaveEdit']"))).click();
	}


	@Then("Verify the Phone Number {string}")
	public void verify_the_phone_number(String phonenum) throws InterruptedException {
		Actions action=new Actions(driver);
		WebElement phoneNos = driver.findElement(By.xpath(("//table[@class='slds-table slds-table_header-fixed slds-table_bordered slds-table_edit slds-table_resizable-cols']//tbody/tr/td[4]")));
		action.moveToElement(phoneNos).perform();
		Thread.sleep(3000);
		String phoneNosText = phoneNos.getText();
		System.out.println("The phone number is "+ phoneNosText);
		String phoneNosText1 = phoneNosText.replaceAll("[^0-9_]", "");
		System.out.println("The phone number is "+ phoneNosText1);
		org.testng.Assert.assertEquals(phoneNosText1, phonenum);
		System.out.println("Test Case is passed");

	}

}
