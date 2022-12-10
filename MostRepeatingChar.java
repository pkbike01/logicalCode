import java.util.List;
import java.util.ArrayList;


public class MostRepeatingChar{
	public static void main(String[] args){
		String name = "pankajajalkjajkjajkkkkkkkkkkkkk";
		List<Character> l = new ArrayList<>();
		for(int i=0;i<name.length();i++){
			l.add(name.charAt(i));
			
		}
		
		int freq =0;
		char result = 'l';
		for(int i=0;i<l.size();i++){
			int count=0;
			for(int j=0;j<l.size();j++){
				if(l.get(i).equals(l.get(j))){
					count++;
				}
				if(count>freq){
					freq = count;
					result = l.get(i);
				}
			}

		}
		System.out.println("no of repeatation : " + freq);
		System.out.println("char which is repeating in a given string : "+result);


	}



}

























java me convert kr