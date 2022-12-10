package java_practice;

public class MostRepeatingElement {
	public static void main(String[] args) {
		
		String name = "paaankaj";
		System.out.println(name.length());
		int re = 0;
		char c = 'i';
		
		for(int i=0;i<name.length()-1;i++) {
			int count=0;
//			System.out.print(name.charAt(i)+ ",");
			if(name.charAt(i)==name.charAt(i+1)) {
				count++;
				
			}
			if(re<count) {
				re=count;
				c=name.charAt(i);
			}
			
			
			
			
			
			
		}
		System.out.println(re);
		System.out.println(c);
		
		
		
		
		
//		int freq=0;
//		String re ="";
//		for(int i=0;i<name.length();i++) {
//			int count=1;
//			for(int j=0;j<name.length();j++) {
////				if(name.charAt(i).equals(name.charAt(j))) {
////					
////				}
//				System.out.println(name.charAt(i));
//				
//				
//				
//			}
//		}
		
		
		
		
		
	}
	
	
	
	
	

}
