package week4day10;

public class JavaChallenge {

	public void majorityElement(int input[]) {
	// TODO Auto-generated method stub
	 for (int i=0;i<(input.length-1);i++) {
			
			int count=1;
			int z=(input.length)/2;
			
			for (int k=i+1;k<(input.length)-1;k++){
		
			if(	input [i]==input[k]) {
				count++;
			System.out.println(input[i] +"Repeated" + count);				
			}
			
			}
			
			if (count==z) {
			System.out.println(input[i]);
			}
		}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaChallenge obj=new JavaChallenge();
//		int num1[]={3,2,3};
//		obj.majorityElement( num1);
		int num2[]= {2,2,1,1,1,2,2};
		obj.majorityElement( num2);
	
		
		
	}

}
