package week3day9;

public class PolymorphismOR extends PolymorphismOverRidind  {
	
	public void starColor() {
		super.starColor();
		int a=10; int b=20;
		
		System.out.println(a+b);
		System.out.println("The color is Yellow");

	}
	
	public static void main(String[] args) {
		PolymorphismOR OverRiding=new PolymorphismOR();
		OverRiding.starColor();
		
	}
}

