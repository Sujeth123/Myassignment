package week2day4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String companyName= "TestLeaf";
		 String reverse="";
		 
		
		
		 for(int i=companyName.length()-1;i>=0;i--) {
			
			reverse=reverse + companyName.charAt(i);
			
		 }
		 
		 System.out.println(reverse);
	}

}
