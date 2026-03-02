package week4day11;
//find common elements in 2 lists
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> value1=new ArrayList<Integer>();
		
  Collections.addAll(value1, 3, 2, 11, 4, 6, 7);
  List<Integer> value2=new ArrayList<Integer>();
  Collections.addAll(value2, 1, 2, 8, 4, 9, 7);
  
  for (int i=0;i<value1.size();i++) {
	  
	  for ( int j=0;j<value2.size();j++) {
		  
		  if(value1.get(i)==value2.get(j)){
			  
			  System.out.println(value1.get(i));
		  }
		  
	  }
	  
  }
  
  
	}

}
