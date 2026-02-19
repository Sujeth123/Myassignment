package week3day8;

public class RadioButton extends Button {

	
	public void selectRadioButton() {
		System.out.println("selectRadioButton");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rB= new RadioButton();
		rB.selectRadioButton();
		rB.click();
		rB.setText();
		rB.submit();
		
	}

}
