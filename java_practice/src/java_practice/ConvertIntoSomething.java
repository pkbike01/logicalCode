package java_practice;

public class ConvertIntoSomething {
	
	public static void main(String[] args) {
		String name="automatic trans machine";
		String[] n = name.split(" ");
		for(String s : n) {
			for(int i=0;i<s.length();i++) {
				if(i==0) {
					System.out.print(s.toUpperCase().charAt(i));
					
				}
			}
			if(s==n[2]) {
				String y = s.replace('m', 'M');
				System.out.println(" " + y);
			}
		}
	}

}
