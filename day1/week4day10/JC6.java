package week4day10;

public class JC6 {

private void nonRepeated(String letter) {
	// TODO Auto-generated method stub


	  String  s = "aabb";
      String s1=s.toLowerCase();
      
      System.out.println(s1);
		
      String l="";
		//char a[]=s.toCharArray();
		
		for(int i=0;i<s1.length();i++)
		{
			
			
			int flag=0;
			
			for (int j=0;j<s1.length()-1;j++) {
				
				if ((s1.charAt(i)==s1.charAt(j)&&(i!=j))) {
					
					System.out.println("Repeated charater "+s1.charAt(i));
					flag=1;
					break;
				}
			}
				if(flag==0) {
					
					 l= l+s1.charAt(i);
					System.out.println("non Repeated charater "+ l);
				}
				if(flag!=0 && flag==1) {
					System.out.println("all are repeated");
				}
				
	}
	
}

	public static void main(String[] args) {
		
		JC6 obj=new JC6();
//		
//		String a1="TestLeaf";
//		obj.nonRepeated(a1);
//		String a2="loveTestLeaf";
//				obj.nonRepeated(a2);
		String a3="aabb";
				obj.nonRepeated(a3);
		
		
		

}
	}
