package week5.day13;

import static org.testng.Assert.assertEquals;

public class JavaChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aA";
		
		char[] jeq=jewels.toCharArray();
		
		System.out.println(jeq[0]);
		String stones="aAAbbbb";
				
		char[] st=stones.toCharArray();
		
		int count=0;
		
		
		for (int i=0;i<jewels.length();i++) {
			
			for (int j=0;j<stones.length();j++) {
				
				if (jeq[i]==st[j]) {
					
					count=count+1;
				}
				
			}
				
		}
		System.out.println(count);
	

	}}
		


