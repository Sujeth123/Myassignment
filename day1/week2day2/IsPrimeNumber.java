package week2day2;

public class IsPrimeNumber {

public static void main(String[] args) {
	
	int n=27;
	
	boolean Isprime=true;
	
	for(int i=2;i<n;i++ )
	{
		//logic to check it is not prime
		if (n%i==0) {
			
			Isprime=false;
			break;		
			}
	}
		 if (Isprime==true)
		 {
System.out.println("It is the   prime number");
}
		else {
			System.out.println("It is the  not  prime number");
		}
	}

}
