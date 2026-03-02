package week4day10;

public abstract class CanaraBank implements Payments{
	
	
	abstract void recordPaymentDetails();

	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("This method from abstract Class and cashOnDelivery");
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("This method from abstract Class and upiPayments");
	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("This method from abstract Class and cardPayments");
	}

	

	

}
