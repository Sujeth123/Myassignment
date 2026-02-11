package week2day3;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser object1= new Browser();
		String launchBrowser=object1.launchBrowser("IE");

		System.out.println(launchBrowser);
		object1.loadUrl();
		
	}

}
