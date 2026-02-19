package week3day8;

public class TextField extends WebElement {

	private void getText() {
		
		System.out.println("getText");
	}
	public static void main(String[] args) {
		
		
		TextField tF=new TextField();
		tF.click();
		tF.setText();
		tF.getText();
	}


}
