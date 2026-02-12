package week2day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1, 4,3,2,8, 6, 7};        
	//1,2,3,4,6,7,8
	//1,2,3,4,5,6,7
Arrays.sort(a);

for(int i=0;i<=6;i++) {		
	int j=i+1;
     		if(j!=a[i]) {
     			System.out.println("Missing Element - " + j);
     			break;
     			
     			
}
}
}
}
