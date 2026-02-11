package week2day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int f=0; int s=1;

for(int i=0;i<8;i++) {
	
	System.out.println("The number is "+ f);
	int t=f+s;
	f=s;
	s=t;

}
	}

}
