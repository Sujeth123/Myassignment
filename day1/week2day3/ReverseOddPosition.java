package week2day3;

public class ReverseOddPosition {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="I am a software tester";
String[] textArray=text.split(" ");
String oddReverse="";
for(int i=0;i<textArray.length;i++) {

	if(i%2==0) {
		
		System.out.print(textArray[i] +" ");
	}
	else 
	{
		for (int j=textArray[i].length()-1;j>=0;j--) {
			
			oddReverse=oddReverse+textArray[i].charAt(j);
			
		}
		
		System.out.print(oddReverse +" ");
		

	}
}
}
}

	
