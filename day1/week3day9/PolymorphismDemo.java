package week3day9;

public class PolymorphismDemo {
	
	
	public void reportStep(String msg,String Status)
	{
		System.out.println("The message and status are " + msg +" and " + Status );

	}
	
	public void reportStep(String msg,String Status,boolean snap) {
		
		System.out.println("The message, status and boolean are " + msg +" , " + Status + " and " + snap );


	}

	public static void main(String[] args) {
		PolymorphismDemo overLoading=new PolymorphismDemo();
		
		overLoading.reportStep("Working as expected", "Success");
		
		overLoading.reportStep("Working as expected as per reportsteps2", "Completed", true);
		
	}

}
