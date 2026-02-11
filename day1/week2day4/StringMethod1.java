package week2day4;

import java.util.Arrays;

public class StringMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String name="Golod";

		String[] alpha=name.split("o");

		for (int i=0;i<alpha.length;i++) {
			
			System.out.println(alpha[i]);
	}
System.out.println(Arrays.toString(alpha));

}
}
