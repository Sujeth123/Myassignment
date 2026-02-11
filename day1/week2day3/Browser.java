package week2day3;

public class Browser {
	
	public String launchBrowser(String browserName) {
	 System.out.println("Browser launched successfully");
	 
	 return (browserName);
	 
	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	private void login() {
		System.out.println("login successful");
	}
	
	protected void Page1() {
		System.out.println("Page1 loaded successful");
	}
	
	 void Page2() {
		System.out.println("Page2 loaded successful");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Browser object= new Browser();
		String launchBrowser= object.launchBrowser("Chrome");
		
		System.out.println(launchBrowser);
		object.loadUrl();
		
		object.login();
		object.Page1();
		object.Page2();
		

	}

}
