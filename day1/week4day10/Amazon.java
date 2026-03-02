package week4day10;

public class Amazon extends CanaraBank{


	
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("This method from execution Class and internetBanking");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon obj=new Amazon();
		obj.cardPayments();
		obj.cashOnDelivery();
		obj.internetBanking();
		obj.recordPaymentDetails();
		obj.upiPayments();
		
		
	}

	@Override
	void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("This method from execution Class and recordPaymentDetails");
	}


}
