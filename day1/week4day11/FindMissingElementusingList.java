package week4day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		 List <Integer> value1=new ArrayList <Integer>();
		 Collections.addAll(value1,1, 2, 3, 4, 10, 6, 8);
		 
		 Collections.sort(value1);
		 
		for(int i=1;i<=10;i++) {
			 
			 int flag=0; 
			for(int j=0;j<value1.size();j++) {
		
			 if((value1.get(j))==i){
				 
				 flag=1;
				break; 
			 } 
			 } if ( flag==0) {
				 System.out.println("The missing no." + i );
	}
	}
	}
}

