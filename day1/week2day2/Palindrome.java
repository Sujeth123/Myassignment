package week2day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="abc";
		
		String reverse="";
		
		String reverse;
		//logic to check the Palindrome
		for(int i=a.length()-1;i>=0;i--) {
			
			 reverse=reverse + a.charAt(i);//why i cannot assign another string here
			
		}
			System.out.println(reverse);
			if (a.equals(reverse)) {
				
			System.out.println("The given no. "+ a + " is a Palindrome");
			
			}
			else {
				System.out.println("The given no. "+ a + " is not a Palindrome");
			}

	
		}
	

}

