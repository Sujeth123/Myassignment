package week2day3;

import java.util.Arrays;

public class Anagram {

	
	static String text1 = "stops";
	
	static String text2 = "potss";
	
	//Method to get the length
	public int text1Length(String text) {
		
		int t=text.length();
		return(t);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anagram firstObject= new Anagram();
		
		int tl1= firstObject.text1Length(text1);
		int tl2= firstObject.text1Length(text2); 
		//Logic to compare the length
		if (tl1==tl2) {
			System.out.println("Both String Lengths match");
		}
		else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		//Convert to char array
	char[] ta1= text1.toCharArray();
	char[] ta2= text1.toCharArray();
	//Sort the array
	Arrays.sort(ta1);
	Arrays.sort(ta2);
		System.out.println(ta1);
		System.out.println(ta2);
		//Compare the Arrays
if(Arrays.equals(ta1, ta2)) {
	System.out.println("The given strings are Anagram." );
}
else {
	System.out.println("The given strings are not an Anagram.");
}
	}

}
