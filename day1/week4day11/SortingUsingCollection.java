package week4day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] company= {"HCL" ,"Wipro","Aspire Systems","CTS"};

  List<String> companyName=new ArrayList<String>();

for (String a : company) {
	
	companyName.add(a);
	//as Wipro, HCL, CTS, Aspire System
}
Collections.sort(companyName, Collections.reverseOrder());


for (String b : companyName) {
	
	System.out.println(b);
	
	
}




	}

}
