package week2day3;

public class ChangeOddIndexToUppercase {

	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme"; 
		
		//Convert to char array
		 char[] test1= test.toCharArray();
		
		
		for(int i=0;i<test1.length; i++) {
			
			   char test2= test1[i];
			   //Pick the even place char
			   if (i%2==0) {
			   
			   System.out.print(test2);
			   }
			   //pick the odd place char and convert to upper case.
			   else {
				  char test3 =Character.toUpperCase(test1[i]);
				  
				  System.out.print(test3);
			   }
		}
       
}
}