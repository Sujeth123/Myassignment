package week3day8;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("clickCheckButton");


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton cB=new CheckBoxButton();
		cB.click();
		cB.clickCheckButton();
		cB.setText();
		cB.submit();
	}

}
