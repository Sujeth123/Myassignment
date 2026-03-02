package week4day10;

public class JC5 {

	public static void main(String [] arg) {
		// TODO Auto-generated method stub
		int input []= {2,2,1,1,1,2,2};
		int z=input.length/2;
		
		for (int i=0;i<(input.length-1);i++) {
			
			int count=1;
			
			for (int k=0;k<(input.length-1);k++){
		
			if(	input [i]==input[k+1]) {
				count++;
			//System.out.println(input[i] +"Repeated" + count);				
			}
			
			}
			
			if (count>z) {
			System.out.println(input[i]);
			}
		}
		
//		JC5 obj = new JC5();
//		obj.main(num);
//		nums = ;
//			
				
		
		
				
				
		

} 
	}

