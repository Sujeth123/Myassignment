package week2day3;

public class RemoveDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1"; 
		
		String[] text1=text.split(" ");
		
		int count=0;
		
		for(int i=0;i<text1.length;i++) {
			for (int j=i+1;j<text1.length;j++) {
			
			if (text1[i].equalsIgnoreCase(text1[j])){	
				text1[j]=" ";
				count++;
			}
				
			}		
		}
		System.out.println(count);
		if (count>1) {
			for(int y=0;y<text1.length;y++) {
				
				System.out.print(text1[y] +" ");
				
			}
			
			
		}else {
				System.out.println("There is no diplicates in this " + text);
				
	}
}
}