package week4day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> value1=new ArrayList<Integer>();
		//2,3,4,6,7,11
		Collections.addAll(value1,3, 2, 11, 4, 6, 7);
		Collections.sort(value1);
		
		 System.out.println("The second highest value in list is : "+ value1.get(value1.size()-2));

		 
		 //		for (int i=0;i<value1.size();i++) {
//			 System.out.println(value1.get(i));
//		}
////		 
////			 
////			 if (value1.get(i)>value1.get(i+1))
////			 {
////				 int temp=value1.get(i);
////				int  Z=value1.get(i+1);
////						 value1.add(i, Z);
////				value1.add(i+1, temp);
//				
//				 
//			 }
//			
//		 }
//		
//		
		
	}
	

	}


